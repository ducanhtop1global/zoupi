package org.zoupi.userzoupi.entities.dto;

public class removeUsrDto {
    private String accId;
    private String username;
    private String password;

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public removeUsrDto(String accId, String username, String password) {
        this.accId = accId;
        this.username = username;
        this.password = password;
    }
}
