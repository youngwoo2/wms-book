package com.sh.user.service;

import com.sh.user.model.dao.UserMapper;
import com.sh.user.model.dto.UserDto;
import org.apache.ibatis.session.SqlSession;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class UserService {

    public UserDto login(int id, String password) {
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.login(id,password);
        }finally {
            sqlSession.close();
        }
    }
}
