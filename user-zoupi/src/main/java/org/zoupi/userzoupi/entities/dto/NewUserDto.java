package org.zoupi.userzoupi.entities.dto;

import java.time.LocalDate;

public class NewUserDto {
    private String name;
    private String email;
    private String accId;
    private LocalDate birthday;

    public NewUserDto(String name, String email, String accId, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.accId = accId;
        this.birthday = birthday;
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

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
