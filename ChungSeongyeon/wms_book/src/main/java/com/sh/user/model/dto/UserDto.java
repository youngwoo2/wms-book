package com.sh.user.model.dto;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
    private int userId;
    private String username;
    private String password;
    private Roles role;
    private LocalDate createdAt;
}
