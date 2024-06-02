package com.sh.user.model.dao;

import com.sh.user.model.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.*;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;


public class UserMapperTest {
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

    @DisplayName("로그인 체크")
    @Test
    void loginCheck() {
        // given
        String username = "도서관리자1";
        String password = "password123";

        // when
        User user = userMapper.loginCheck(username, password);

        // then
        assertThat(user).isNotNull();
        assertThat(user.getUserName()).isEqualTo(username);
        assertThat(user.getPassword()).isEqualTo(password);
    }
}
