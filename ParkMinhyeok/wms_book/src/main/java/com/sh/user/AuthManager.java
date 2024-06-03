package com.sh.user;

import com.sh.user.controller.UserController;
import com.sh.user.model.dto.UserDto;

public class AuthManager {
    private static UserController userController = new UserController();
    private static UserDto loginUser = null;
    public static boolean isLogin() {
        return loginUser != null;
    }
    public static void login(int id,String password) {
        loginUser = userController.handleLogin(id, password);
    }
    public static UserDto getLoginUser() {
        return loginUser;
    }
    public static void logout() {
        loginUser = null;
    }
}
