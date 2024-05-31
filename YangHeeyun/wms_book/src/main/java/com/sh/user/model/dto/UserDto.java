package com.sh.user.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 매개인자 생성자
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
