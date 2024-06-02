package com.sh.user.model.service;

import com.sh.user.model.dto.Role;
import com.sh.user.model.dto.UserDto;

import java.util.Random;

public class UserService {
    public UserDto login(int id, String password) {
        // 테스트를 위해 랜덤하게 UserDto객체 또는 null을 반환한다.
        return new Random().nextBoolean() ? new UserDto(id, "아무개", password, Role.manager, null) : null;
    }
}
