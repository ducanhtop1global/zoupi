package org.zoupi.userzoupi.entities.dto;

public class UserUpdDto {
    private String accId;
    private String username;
    private String password;
    private String fieldName;
    private String value;

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

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public UserUpdDto(String accId, String username, String password, String fieldName, String value) {
        this.accId = accId;
        this.username = username;
        this.password = password;
        this.fieldName = fieldName;
        this.value = value;
    }
}
