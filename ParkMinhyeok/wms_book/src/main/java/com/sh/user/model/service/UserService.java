package com.sh.user.model.service;

import com.sh.user.model.dao.UserMapper;
import com.sh.user.model.dto.UserDto;
import org.apache.ibatis.session.SqlSession;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class UserService {
    public UserDto handleLogin(UserDto user) {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserDto userDto = userMapper.handleLogin(user.getUserId(), user.getPassword());
        sqlSession.close();
        return userDto;
    }
}
