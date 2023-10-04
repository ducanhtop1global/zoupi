package org.zoupi.compressorzoupi.api.handler;

import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.zoupi.compressorzoupi.entities.AddZipDto;
import org.zoupi.compressorzoupi.entities.GetZipDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;


@Component
public class EntryPointHandler {
    public Mono<ServerResponse> addSingle(ServerRequest request) {
        return request.multipartData().flatMap(m -> mergeFluxDtb(Objects.requireNonNull(m.toSingleValueMap().get("file")).content())).flatMap(bytes -> {
            try {
                var byteCompressed = compress(Base64.getEncoder().encode(bytes));
                var fileName = Objects.requireNonNull(request.cookies().getFirst("filename"));
                var id = Objects.requireNonNull(request.cookies().getFirst("idAuthor"));
                return this.sendDataCompressed(byteCompressed,fileName.getValue(), id.getValue());
            } catch (IOException e) {
                return Mono.error(new RuntimeException(e));
            }
        }).flatMap(bol -> bol ? ServerResponse.ok().build() : ServerResponse.badRequest().build());
    }
    public static byte[] decompress(byte[] bytes) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read;
        while ((read = inflaterInputStream.read()) != -1) {
            byteArrayOutputStream.write(read);
        }
        inflaterInputStream.close();
        byteArrayInputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
    public static byte[] compress(byte[] bytes) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        byte[] compressedBytes = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return compressedBytes;
    }
    public Mono<Boolean> sendDataCompressed(byte[] dataCompressed, String filename, String idAuthor) {
        var dto = AddZipDto.builder().filename(filename).idAuthor(idAuthor).content(dataCompressed).build();
        return WebClient.create().post().uri(URI.create("http://localhost:4447/addVidAsZip")).contentType(MediaType.APPLICATION_JSON).bodyValue(dto).retrieve().bodyToMono(Boolean.class);
    }
    public static Mono<byte[]> mergeFluxDtb(Flux<DataBuffer> dataBufferFlux) {
        return DataBufferUtils.join(dataBufferFlux).map(dt -> {
           byte[] bytes = new byte[dt.readableByteCount()];
           dt.read(bytes);
           DataBufferUtils.release(dt);
           return bytes;
        });
    }

    public Mono<ServerResponse> getSingle(ServerRequest request) {
        var filename = Objects.requireNonNull(request.cookies().getFirst("filename"));
        var idAuthor = Objects.requireNonNull(request.cookies().getFirst("idAuthor"));
        Map<String, String> map = new HashMap<>();
        map.put("filename", filename.getValue());
        map.put("idAuthor", idAuthor.getValue());
        return WebClient.create().get().uri("http://localhost:4447/getVidAsZip", map).retrieve()
                .bodyToMono(GetZipDto.class).flatMap(dto -> {
                    try {
                        return ServerResponse.ok().bodyValue(decompress(dto.getContent()));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }).onErrorResume(thr -> ServerResponse.badRequest().bodyValue(thr.getMessage()));
    }

}
