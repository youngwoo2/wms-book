package com.sh.user.model.dao;

import com.sh.user.model.dto.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LoginMapperTest {
    SqlSession sqlSession;
    LoginMapper loginMapper;

    @BeforeEach
    void setUp() {
        this.sqlSession = getSqlSession();
        this.loginMapper = this.sqlSession.getMapper(LoginMapper.class);
    }

    @AfterEach
    void tearDown() {
        this.sqlSession.close();
    }

    @DisplayName("Id/password를 비교하여 사용자 확인")
    @Test
    void login() {
        // given
        int userId = 1;
        String password = "password123";

        // when
        UserDto user = loginMapper.login(userId, password);

        // then
        assertThat(user).isNotNull();
        assertThat(user.getUserId()).isEqualTo(userId);
        assertThat(user.getPassword()).isEqualTo(password);
    }
}