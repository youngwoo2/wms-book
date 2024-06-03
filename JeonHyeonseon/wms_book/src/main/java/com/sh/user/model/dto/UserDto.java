package com.sh.user.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {
    private int userId; // 사용자 아이디
    private String password; // 비밀번호
    private String userName; // 사용자 이름
    private Role role; // 사용자 역할
    private LocalDateTime createdAt; // 생성 일시

    public UserDto(int userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}
