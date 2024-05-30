package com.sh.user.model.dto;

import java.time.LocalDateTime;

public class UserDto {
    private int userId; // 사용자 아이디
    private String password; // 비밀번호
    private String userName; // 사용자 이름
    private Role role; // 사용자 역할
    private LocalDateTime createdAt; // 생성 일시

    public UserDto() {
    }

    public UserDto(int userId, String password, String userName, Role role, LocalDateTime createdAt) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.role = role;
        this.createdAt = createdAt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", role=" + role +
                ", createdAt=" + createdAt +
                '}';
    }
}
