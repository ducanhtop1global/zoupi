package org.zoupi.userzoupi.kafka;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class config {
    @Bean
    public NewTopic newTopic1() {
        return TopicBuilder.name("account").partitions(10).replicas(3).build();
    }
    @Bean
    public NewTopic newTopic2() {
        return TopicBuilder.name("user").partitions(10).replicas(3).build();
    }
}
