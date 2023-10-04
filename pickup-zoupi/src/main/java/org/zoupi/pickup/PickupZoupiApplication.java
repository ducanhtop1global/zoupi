package org.zoupi.pickup;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;

import java.io.IOException;

@SpringBootApplication
@EnableDiscoveryClient
public class PickupZoupiApplication {
	public static void main(String[] args) {
		SpringApplication.run(PickupZoupiApplication.class, args);
	}
	@Autowired
	ReactiveRedisConnectionFactory redisConnectionFactory;
	@Bean
	ApplicationRunner runner2(ReactiveMongoTemplate mongoTemplate, ReactiveRedisTemplate<String, String> redisTemplate) {
		return args -> {
		};
	}
	@Bean
	ApplicationRunner runner() {
		return args -> {
		};
	}
	@PreDestroy
	void flushDbRedis() {
		redisConnectionFactory.getReactiveConnection().serverCommands().flushDb().doOnNext(e -> System.out.println("Flushing Redis")).subscribe();
	}
}
