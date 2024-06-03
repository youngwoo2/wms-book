package com.sh.user.model.dao;

import com.sh.common.AuthManager;
import com.sh.user.model.dto.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;

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

    @DisplayName("로그인")
    @Test
    void login() {
        // given
        int userId = 1;
        String password = "password123";
        //when
        UserDto userDto = userMapper.login(userId, password);
        // then
        assertThat(userDto).isNotNull();
        assertThat(userDto.getUserId()).isEqualTo(userId);
        assertThat(userDto.getUserName()).isEqualTo("관리자");
        assertThat(userDto.getPassword()).isEqualTo(password);
    }
}