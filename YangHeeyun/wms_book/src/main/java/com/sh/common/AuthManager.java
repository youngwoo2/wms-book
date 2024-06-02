package com.sh.common;

// 입력한 id,password가 db와 같은지 인증

import com.sh.user.model.dto.UserDto;

public class AuthManager {

    private static UserDto loginUser;

    public static boolean islogin() {
        return loginUser != null; // 로그인한 전적이 생김

    }

    // 로그인한 유저정보 저장
    public static void login(UserDto userdto) {
        loginUser = userdto;
    }

    // 로그인하고 있는 유저 객체 가져오기
    public static UserDto getLoginUser() {
        return loginUser;
    }

    public static void logout() {
        loginUser = null;
    }

}
