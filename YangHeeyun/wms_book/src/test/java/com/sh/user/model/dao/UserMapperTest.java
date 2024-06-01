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

    @DisplayName("사용자 로그인 성공 테스트")
    @Test
    void login() {
        // given
        int userId = 2;
        String password = "password123";
        // when
        UserDto userDto = userMapper.login(userId,password);
        // then
        assertNotNull(userDto);
        assertEquals(userId, userDto.getUserId());
        assertEquals(password, userDto.getPassword());

        System.out.println("UserDto result: " + userDto);
    }
}