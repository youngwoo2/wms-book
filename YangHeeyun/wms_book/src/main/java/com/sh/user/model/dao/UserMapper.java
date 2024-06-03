package com.sh.user.model.dao;

import com.sh.user.model.dto.UserDto;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    UserDto login(@Param("userId") int userId,
                  @Param("password") String password);
}
