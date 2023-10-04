package org.zoupi.videozoupi.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

import java.io.DataInputStream;
import java.io.InputStream;

@Configuration
@RequiredArgsConstructor
public class MongoConf {
}
