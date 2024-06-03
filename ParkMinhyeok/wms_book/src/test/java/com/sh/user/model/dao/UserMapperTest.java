package com.sh.user.model.dao;

import com.sh.user.model.dto.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {
    SqlSession sqlSession;
    UserMapper userMapper;

    @BeforeEach
    void setUp() {
        this.sqlSession = getSqlSession();
        this.userMapper = this.sqlSession.getMapper(UserMapper.class);
    }

    @AfterEach
    void tearDown() {
        this.sqlSession.close();
    }
    @DisplayName("test handleLogin()")
    @Test
    void handleLogin() {
        // given
        int userId = 1;
        String password = "password123";
        // when
        UserDto result = userMapper.handleLogin(userId, password);
        // then
        assertNotNull(result);
        assertEquals(userId, result.getUserId());
        assertEquals("관리자", result.getUserName());
        assertEquals(password, result.getPassword());
        }
}