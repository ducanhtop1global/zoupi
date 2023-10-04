package org.zoupi.userzoupi.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.zoupi.userzoupi.entities.Account;
import org.zoupi.userzoupi.entities.User;

@Configuration
public class redisCf {
    @Bean(name = "redisOpsAcc")
    ReactiveRedisOperations<String, Account> redisOperationsAcc(ReactiveRedisConnectionFactory connectionFactory) {
        Jackson2JsonRedisSerializer<Account> serializer = new Jackson2JsonRedisSerializer<>(Account.class);
        RedisSerializationContext.RedisSerializationContextBuilder<String , Account> builder = RedisSerializationContext.newSerializationContext(new StringRedisSerializer());
        RedisSerializationContext<String, Account> context = builder.value(serializer).build();
        return new ReactiveRedisTemplate<>(connectionFactory, context);
    }
    @Bean(name = "redisOpsUser")
    ReactiveRedisOperations<String, User> redisOperationsUser(ReactiveRedisConnectionFactory connectionFactory) {
        Jackson2JsonRedisSerializer<User> serializer = new Jackson2JsonRedisSerializer<>(User.class);
        RedisSerializationContext.RedisSerializationContextBuilder<String , User> builder = RedisSerializationContext.newSerializationContext(new StringRedisSerializer());
        RedisSerializationContext<String, User> context = builder.value(serializer).build();
        return new ReactiveRedisTemplate<>(connectionFactory, context);
    }

}
