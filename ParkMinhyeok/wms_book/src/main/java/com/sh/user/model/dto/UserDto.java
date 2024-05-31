package com.sh.user.model.dto;

import com.sh.user.model.entity.Role;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private int userId;
    private String userName;
    private String password;
    private Role role;
    private LocalDateTime createdAt;
}
