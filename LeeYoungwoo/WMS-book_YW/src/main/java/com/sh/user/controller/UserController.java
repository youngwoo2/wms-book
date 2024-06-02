package com.sh.user.controller;

import com.sh.user.model.dto.UserDto;
import com.sh.user.model.service.UserService;
import com.sh.user.view.ResultView;

public class UserController {
    private UserService userService = new UserService();

    public UserDto login(int userId, String password) {
        try {
            UserDto userDto = userService.login(userId, password);
            ResultView.displayLoginMenu(userDto);
            return userDto;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
