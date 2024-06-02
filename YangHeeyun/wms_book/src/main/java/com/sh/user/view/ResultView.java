package com.sh.user.view;

import com.sh.common.AuthManager;
import com.sh.user.model.dto.Role;
import com.sh.user.model.dto.UserDto;

public class ResultView {

    public static void checkUser(UserDto userDto) {
        if(userDto != null) {
//            System.out.println("✅" + userDto.getUserName() + "님 환영합니다✅");
            UserDto loginUser = AuthManager.getLoginUser();
            System.out.printf("✅반갑습니다, %s님✅\n\n", loginUser.getUserName());
        } else
            System.out.println("❎등록된 회원정보가 없습니다❎\n");

    }
}
