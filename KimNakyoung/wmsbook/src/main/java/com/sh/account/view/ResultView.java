package com.sh.account.view;

import com.sh.account.model.dto.AccountDto;
import com.sh.account.model.dto.Role;

public class ResultView {
    public static void displayLoginMenu(AccountDto accountDto){
        if(accountDto == null) {
            System.out.println("등록된 회원정보가 없습니다.");
        } else if (accountDto.getRole() != Role.manager) {
            System.out.println("매니저만 이용가능 합니다.");

        }else {
            System.out.println(accountDto.getUserName() + "님 환영합니다." );
        }
    }
}
