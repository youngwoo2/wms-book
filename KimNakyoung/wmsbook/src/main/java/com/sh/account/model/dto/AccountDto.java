package com.sh.account.model.dto;

public class AccountDto {
    private int userId; // 계정아이디
    private String username; // 계정이름
    private String password; // 계정 비밀번호 // DB에선 char이지만 JDBC는 Char 없음 그래서 String

    public AccountDto() {
    } // 기본 생성자 setter 쓸때 사용

    @Override
    public String toString() {
        return "AccountDto{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public AccountDto(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
