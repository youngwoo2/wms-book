package com.sh.user.model.dao;

import com.sh.user.model.dto.Roles;
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
    @DisplayName("loginUser Test()")
    @Test
    void loginUser() {
        // given
        int userId = 1;
        String password = "password123";
        Roles role = Roles.valueOf("admin");
        // when
        UserDto result = userMapper.authenticateUser(userId, password, role);
        // then
        assertNotNull(result);
        assertEquals(userId, result.getUserId());
        assertEquals(password, result.getPassword());
        assertEquals(role, result.getRole());

        System.out.println("UserDto result: " + result);
    }
}