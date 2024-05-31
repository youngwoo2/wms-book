package com.sh.user.model.dto;

import com.sh.user.model.enums.Roles;
import lombok.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int userId;
    private String username;
    private String password;
    private Roles role;
    private Timestamp createdAt;
}
