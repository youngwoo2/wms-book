package com.sh.user.controller;

import com.sh.common.AuthManager;
import com.sh.user.model.entity.User;
import com.sh.user.model.service.UserService;

public class UserController {
    UserService userService = new UserService();
    public void loginCheck(String id, String password) {
        User user = userService.loginCheck(id, password);
        AuthManager.login(user);
    }
}
