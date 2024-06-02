package com.sh.common.view;

import com.sh.common.AuthManager;
import com.sh.user.model.dto.UserDto;

public class ResultView {

    public static void displayLoginResult(UserDto userDto) {
        if(userDto != null) {
            UserDto loginUer = AuthManager.getLoginUser();
            System.out.printf("🗣️ 반갑습니다, %s님 😀\n", loginUer.getUserName());
        }
        else {
            System.out.println("🗣️ 아이디 또는 비밀번호가 일치하지 않습니다 😭");
        }
    }

}
