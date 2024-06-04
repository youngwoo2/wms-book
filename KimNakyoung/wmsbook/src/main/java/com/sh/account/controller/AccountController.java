package com.sh.account.controller;

import com.sh.account.model.dto.AccountDto;
import com.sh.account.model.dto.Role;
import com.sh.account.model.service.AccountService;
import com.sh.account.view.ResultView;
import com.sh.common.AuthManager;

public class AccountController {
    private AccountService accountService = new AccountService();

    /**
     * 로그인 처리 메소드
     * - 로그인에 성공하면 AuthManager.login(UserDto)를 통해 메모리상에서 사용자객체를 관리한다.
     * - 로그인에 실패하면 로그인 처리를 하지 않는다.
     *
     * 리턴값은 필요시에 활용할 수 있다.
     * @param userId
     * @param password
     */

    // 강사님 코드 참고
    public AccountDto  login(int userId, String password) {
        // 1. UserService에 로그인을 요청후 UserDto를 반환받는다.
        AccountDto  accountDto = accountService.login(userId, password);
        // 2. 로그인 결과 처리
        // null이 아니고 Role 이 manager 일 때만 로그인 가능
        if(accountDto != null && accountDto.getRole() == Role.manager) {
            //  - 성공시(accountDto객체 반환시) AuthManager.login 처리
            AuthManager.login(accountDto);
        }
        else {
            //  - 실패시(null 반환시) 로그인 처리하지 않는다.
        }
        // 3. 사용자 로그인 결과 출력
        ResultView.displayLoginMenu(accountDto);

        return accountDto;
    }




}
