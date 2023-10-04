package org.zoupi.userzoupi.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Document("Account")
public class Account {
    private @MongoId String id;

    public Account(String username, String password, boolean isLock, LocalDate createdAt) {
        this.username = username;
        this.password = password;
        this.isLock = isLock;
        this.createdAt = createdAt;
    }

    public boolean isLock() {
        return isLock;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    private String username;
    private String password;
    private boolean isLock;
    private LocalDate createdAt;
}
