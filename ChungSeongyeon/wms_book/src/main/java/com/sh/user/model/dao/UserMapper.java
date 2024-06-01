package com.sh.user.model.dao;

import com.sh.user.model.dto.Roles;
import com.sh.user.model.dto.UserDto;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    UserDto authenticateUser(@Param("userId") int userId,
                      @Param("password") String password,
                      @Param("role") Roles role);
}
