package com.sh.common;

import com.sh.user.model.dto.UserDto;
import com.sh.user.view.ResultView;

public class AuthManager {
    private static UserDto loginUser = null;

    public static boolean isLogin() {
        return loginUser != null;
    }

    public static void login(UserDto userDto) {
        loginUser = userDto;
    }

    public static UserDto getLoginUser() {
        return loginUser;
    }

    public void logout() {
        loginUser = null;
    }
}
