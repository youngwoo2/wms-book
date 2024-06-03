package com.sh.user.model.service;

import com.sh.common.AuthManager;
import com.sh.user.model.dao.UserMapper;
import com.sh.user.model.dto.UserDto;
import org.apache.ibatis.session.SqlSession;

import static com.sh.common.MyBatisTemplate.getSqlSession;

    public class UserService {
        public UserDto authenticateUser(UserDto user) {
            SqlSession sqlSession = getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            UserDto userDto = userMapper.authenticateUser(user.getUserId(), user.getPassword(), user.getRole());
            sqlSession.close();

            if (userDto != null) {
                AuthManager.login(userDto);
            }

            return userDto;
        }
    }