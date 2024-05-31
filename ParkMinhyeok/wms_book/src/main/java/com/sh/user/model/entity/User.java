package com.sh.user.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userId;
    private String userName;
    private String password;
    private Role role;
    private LocalDateTime createdAt;
}
