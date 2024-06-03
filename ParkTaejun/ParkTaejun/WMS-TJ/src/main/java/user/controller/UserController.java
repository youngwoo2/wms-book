package user.controller;

import com.sh.common.AuthManager;
import user.model.entity.User;
import user.model.service.UserService;

public class UserController {
    AuthManager authManager = new AuthManager();
    UserService userService = new UserService();

    public User login(int userId, String password) {
        return userService.login(userId, password);
    }


}
