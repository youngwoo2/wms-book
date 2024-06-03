package com.sh.user.model.service;

import com.sh.user.model.dao.LoginMapper;
import com.sh.user.model.dto.UserDto;
import org.apache.ibatis.session.SqlSession;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class UserService {
    public UserDto login(int userId, String password) {
        SqlSession sqlSession = getSqlSession();
        LoginMapper loginMapper = sqlSession.getMapper(LoginMapper.class);
        UserDto userDto = loginMapper.login(userId, password);

        sqlSession.close();
        return userDto;
    }
}
