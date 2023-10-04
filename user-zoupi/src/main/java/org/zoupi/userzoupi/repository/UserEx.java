package org.zoupi.userzoupi.repository;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.stereotype.Service;
import org.zoupi.userzoupi.entities.Account;
import org.zoupi.userzoupi.entities.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service
public class UserEx {
    @Autowired
    ReactiveMongoTemplate mongoTemplate;
    @Autowired
    ReactiveRedisOperations<String, User> redisOperations;

    private Query queryUserByAccId(String id) {
        return Query.query(Criteria.where("accountId").is(id));
    }
    public Mono<Boolean> checkUserExit(String idA) {
        return mongoTemplate.exists(queryUserByAccId(idA), User.class, "User");
    }

    public Mono<Optional<User>> addUser(User user) {
        return checkUserExit(user.getAccountId()).flatMap(b -> {
            if (b) return Mono.just(Optional.empty());
            else return mongoTemplate.save(user, "User").map(Optional::of);
        });
    }
    public Mono<Optional<User>> getUsrByAcc(String idA) {
        return redisOperations.opsForValue().get(idA).hasElement().flatMap(b -> {
            if (b) return redisOperations.opsForValue().get(idA).map(Optional::of);
            else
                return mongoTemplate.findOne(queryUserByAccId(idA), User.class, "User").doOnSuccess(u -> redisOperations.opsForValue().set(idA, u)).map(Optional::of);
        });
    }

    public Mono<Boolean> updateFieldUser(String id, String fieldName, Object value) {
        Update update = new Update();
        update.set(fieldName, value);
        return this.checkUserExit(id).flatMap(b -> {
                    if (b) return mongoTemplate.updateFirst(queryUserByAccId(id), update, User.class, "User").map(UpdateResult::wasAcknowledged);
                    else return Mono.just(false);
                }
        );
    }
    public Mono<Boolean> removeUser(String idA) {
        return this.checkUserExit(idA).flatMap(b -> {
            if(b) return mongoTemplate.remove(queryUserByAccId(idA), "User").map(DeleteResult::wasAcknowledged);
            else return Mono.just(false);
        });
    }

}
