package com.sh.user.view;

import com.sh.user.model.dto.Role;
import com.sh.user.model.dto.UserDto;

public class ResultView {

    public static void checkUser(UserDto userDto) {
        if(userDto == null)
            System.out.println("❎등록된 회원정보가 없습니다❎");
        else if(userDto.getRole() != Role.manager)
            System.out.println("❎매니저만 이용가능 합니다❎");
        else
            System.out.println("✅" + userDto.getUserName() + "님 환영합니다✅");
    }
}
