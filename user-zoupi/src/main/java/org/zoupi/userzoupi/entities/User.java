package org.zoupi.userzoupi.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.List;


@Document("User")
public class User {
    private @MongoId String id;
    private String name;
    private String email;
    private LocalDate birthday;
    private String accountId;
    private List<String> videoPublishedIds;
    private List<String> videoLikedIds;
    private String avtUrl;
    private String description;
    public User(String name, String email, LocalDate birthday, String accountId, List<String> videoPublishedIds, List<String> videoLikedIds, String avtUrl, String description) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.accountId = accountId;
        this.videoPublishedIds = videoPublishedIds;
        this.videoLikedIds = videoLikedIds;
        this.avtUrl = avtUrl;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setVideoPublishedIds(List<String> videoPublishedIds) {
        this.videoPublishedIds = videoPublishedIds;
    }

    public void setVideoLikedIds(List<String> videoLikedIds) {
        this.videoLikedIds = videoLikedIds;
    }

    public void setAvtUrl(String avtUrl) {
        this.avtUrl = avtUrl;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAccountId() {
        return accountId;
    }

    public List<String> getVideoPublishedIds() {
        return videoPublishedIds;
    }

    public List<String> getVideoLikedIds() {
        return videoLikedIds;
    }

    public String getAvtUrl() {
        return avtUrl;
    }

    public String getDescription() {
        return description;
    }
}
