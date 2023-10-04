package org.zoupi.userzoupi.entities.dto;

public class UpdateAccDto {
    private String username;
    private String password;
    private String newPass;

    public UpdateAccDto(String username, String password, String newPass) {
        this.username = username;
        this.password = password;
        this.newPass = newPass;
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

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }
}
