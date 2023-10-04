package org.zoupi.userzoupi.entities.dto;

import java.time.LocalDate;
import java.util.List;

public class UserDto {

    private String name;
    private String email;
    private LocalDate birthday;
    private String accountId;
    private List<String> videoPublishedIds;
    private List<String> videoLikedIds;
    private String avtUrl;
    private String description;

    public UserDto(String name, String email, LocalDate birthday, String accountId, List<String> videoPublishedIds, List<String> videoLikedIds, String avtUrl, String description) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.accountId = accountId;
        this.videoPublishedIds = videoPublishedIds;
        this.videoLikedIds = videoLikedIds;
        this.avtUrl = avtUrl;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<String> getVideoPublishedIds() {
        return videoPublishedIds;
    }

    public void setVideoPublishedIds(List<String> videoPublishedIds) {
        this.videoPublishedIds = videoPublishedIds;
    }

    public List<String> getVideoLikedIds() {
        return videoLikedIds;
    }

    public void setVideoLikedIds(List<String> videoLikedIds) {
        this.videoLikedIds = videoLikedIds;
    }

    public String getAvtUrl() {
        return avtUrl;
    }

    public void setAvtUrl(String avtUrl) {
        this.avtUrl = avtUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
