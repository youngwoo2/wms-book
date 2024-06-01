package com.sh.user.controller;

import com.sh.user.model.dto.Roles;
import com.sh.user.model.dto.UserDto;
import com.sh.user.model.service.UserService;

public class UserController {
    private UserService userService = new UserService();

    public UserDto authenticateUser(UserDto user) {
        return userService.authenticateUser(user);
    }

    public boolean authenticateUser(int id, String password, Roles role) {
        UserDto userDto = new UserDto();
        userDto.setUserId(id);
        userDto.setPassword(password);
        userDto.setRole(role);
        UserDto authenticatedUser = userService.authenticateUser(userDto);
        return authenticatedUser != null;
    }
}