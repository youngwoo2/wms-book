package com.sh.user.controller;

import com.sh.common.AuthManager;
import com.sh.user.model.dto.UserDto;
import com.sh.user.model.service.UserService;
import com.sh.user.view.ResultView;

public class UserController {
    private UserService userService = new UserService();

    public UserDto login(int userId, String password) {
        UserDto userDto = userService.login(userId, password);
        if (userDto != null) {
            AuthManager.login(userDto);
        }
        ResultView.displayLoginResult(userDto);
        return userDto;
    }

}
