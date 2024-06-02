package com.sh.common;

import com.sh.user.controller.UserController;
import com.sh.user.model.dto.UserDto;

public class AuthManager {
    private static UserController userController = new UserController();
    private static UserDto loginUser;
    public static boolean isLogin() {
        return loginUser != null;
    }
    public static void login(UserDto user) {
        if (user != null) {
            loginUser = userController.authenticateUser(user);
        }
    }
    public static UserDto getLoginUser() {
        return loginUser;
    }
    public static void logout() {
        loginUser = null;
    }
}
