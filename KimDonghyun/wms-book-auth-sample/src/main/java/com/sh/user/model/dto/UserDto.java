package com.sh.user.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {
    private int userId;
    private String userName;
    private String password;
    private Role role;
    private LocalDateTime userCreatedAt;
}