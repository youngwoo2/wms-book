package com.sh.user.model.dao;

import com.sh.user.model.dto.UserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginMapper {
    UserDto login(@Param("userId") int userId, @Param("password") String password);
}
