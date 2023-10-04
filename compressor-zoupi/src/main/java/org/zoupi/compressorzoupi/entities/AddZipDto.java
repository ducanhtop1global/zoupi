package org.zoupi.compressorzoupi.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddZipDto {
    private String filename;
    private String idAuthor;
    private byte[] content;
}
