package com.sh.user.controller;

import com.sh.user.model.dto.UserDto;
import com.sh.user.service.UserService;
import com.sh.user.view.ResultView;

public class UserController {
    private UserService userService = new UserService();


    public UserDto login(int id, String pw) {
        try {
            UserDto userDto = userService.login(id,pw);
            ResultView.checkUser(userDto);
            return userDto;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
