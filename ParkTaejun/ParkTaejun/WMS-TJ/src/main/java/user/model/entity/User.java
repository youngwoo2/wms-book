package user.model.entity;

import lombok.*;
import user.model.entity.Role;

import java.sql.Timestamp;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class User {
    private int userId;
    private String userName;
    private String password;
    private Role role;
    private Timestamp createdAt;

}





