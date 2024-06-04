package com.sh.user.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private int userId;
    private String userName;
    private String password;
    private Role role;
    private LocalDateTime userCreatedAt;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
