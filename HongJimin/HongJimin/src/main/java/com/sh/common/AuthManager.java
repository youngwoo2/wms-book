package com.sh.common;


import com.sh.user.model.entity.User;

public class AuthManager {
    public static User loginUser;

    // 로그인 되었는지 확인
    public static boolean isLogin() {
        return loginUser != null;
    }

    // 로그인 한 UserDto 받아오기
    public static void login(User user) {
        if(user != null) {
            loginUser = user;
        }
    }

    // 로그인 된 객체 보기
    public static User getLoginUser() {
        return loginUser;
    }

    // 로그아웃
    public static void logout() {
        loginUser = null;
    }
}
