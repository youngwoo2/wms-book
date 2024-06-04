package com.sh.user.model.service;

import com.sh.user.model.dao.UserMapper;
import com.sh.user.model.entity.User;
import org.apache.ibatis.session.SqlSession;

import static com.sh.common.MyBatisTemplate.getSqlSession;


public class UserService {
    public User loginCheck(String id, String password) {
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        try{
            User user = userMapper.loginCheck(id, password);
            sqlSession.commit();
            return user;
        } catch (Exception e) {
            sqlSession.rollback();
            throw new RuntimeException(e);
        } finally {
            sqlSession.close();
        }
    }
}
