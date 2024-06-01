package com.sh.account.controller;

import com.sh.account.model.dto.AccountDto;
import com.sh.account.model.service.AccountService;
import com.sh.account.view.AccountView;
import com.sh.account.view.ResultView;

public class AccountController {
    private AccountService userService = new AccountService();

    public AccountDto login(int userId, String password) {
        try {
            AccountDto accountDto = userService.login(userId, password);
            ResultView.displayLoginMenu(accountDto);
            return accountDto;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }




}
