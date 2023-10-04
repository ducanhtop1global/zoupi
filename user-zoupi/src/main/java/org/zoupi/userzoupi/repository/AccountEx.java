package org.zoupi.userzoupi.repository;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.stereotype.Service;
import org.zoupi.userzoupi.entities.Account;
import org.zoupi.userzoupi.entities.User;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class AccountEx {
    @Autowired
    private ReactiveMongoTemplate mongoTemplate;
    @Autowired
    private ReactiveRedisOperations<String, Account> redisOperations;
    public Mono<Optional<Account>> getAccById(String id) {
        return mongoTemplate.findById(id, Account.class).map(Optional::of);
    }

    public Mono<Optional<Account>> getByUsrNPsw(String username, String pass) {
        return redisOperations.opsForValue().get(username).map(Optional::ofNullable).flatMap(oa -> {
            if(oa.isEmpty()) {
                return mongoTemplate.findOne(this.queryUsrPsw(username, pass), Account.class).doOnSuccess(acc -> redisOperations.opsForValue().set(acc.getUsername(), acc)).map(Optional::ofNullable);
            } else {
                return redisOperations.opsForValue().get(username).map(Optional::of);
            }
        });
    }

    public Mono<Boolean> updatePass(String username, String oldPass, String newPass) {
        var upd = new Update();
        upd.set("password", newPass);
        return mongoTemplate.updateFirst(this.queryUsrPsw(username, oldPass), upd, "Account").map(UpdateResult::wasAcknowledged);
    }
    public Mono<Optional<Account>> addAcc(String username, String password) {
        return this.usrNExit(username).flatMap(bol -> {
            if(!bol) return mongoTemplate.save(new Account(username, password, false, LocalDate.now())).map(Optional::of);
            else return Mono.just(Optional.empty());
        });
    }
    public Mono<Boolean> accExist(String username, String password) {
        return mongoTemplate.exists(this.queryUsrPsw(username, password), "Account").map(Boolean::booleanValue);
    }
    public Mono<Boolean> usrNExit(String username) {
        return mongoTemplate.exists(Query.query(Criteria.where("username").is(username)), Account.class, "Account");
    }
    public Mono<Boolean> removeAcc(String username, String password) {
        return this.accExist(username, password).flatMap(bol -> {
            if(bol) {
                return mongoTemplate.remove(this.queryUsrPsw(username, password)).map(DeleteResult::wasAcknowledged);
            } else {
                return Mono.just(false);
            }
        });

    }
    private Query queryUsrPsw(String username, String password) {
        return Query.query(Criteria.where("username").is(username)).addCriteria(Criteria.where("password").is(password));
    }

}
