package com.sh.common;

import com.sh.user.model.dto.UserDto;

public class AuthManager {

    private static UserDto loginUser;

    public static boolean islogin() {
        return loginUser != null;
    }

    /**
     * id, password로 조회한 UserDto객체를 전달받아 로그인 사용자 객체로 설정
     * @param userdto
     */
    public static void login(UserDto userdto) {
        loginUser = userdto;
    }

    public static UserDto getLoginUser() {
        return loginUser;
    }

    public static void logout() {
        loginUser = null;
    }

}