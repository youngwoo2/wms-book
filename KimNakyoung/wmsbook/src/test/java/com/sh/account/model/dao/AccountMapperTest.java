package com.sh.account.model.dao;

import com.sh.account.model.dto.AccountDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AccountMapperTest {

    SqlSession sqlSession;
    AccountMapper accountMapper;

    @BeforeEach
    void setUp() {
        this.sqlSession = getSqlSession();
        this.accountMapper = this.sqlSession.getMapper(AccountMapper.class);
    }

    @AfterEach
    void tearDown() {
        this.sqlSession.close();
    }

    @DisplayName("사용자 로그인 테스트 ")
    @Test
    void login() {
        //given
        //관리자계정
        int userId = 1;
        String password = "password123";
        //when
        AccountDto accountDto = accountMapper.login(userId,password);
        //then
        //관리자를 넣었으니 null이 아니면 안된다.
        assertThat(accountDto).isNotNull();
        // 아이디 일치하냐? (DB와 입력값)
        assertThat(accountDto.getUserId()).isEqualTo(userId);
        // 비밀번호 일치하냐? (DB와 입력값)
        assertThat(accountDto.getPassword()).isEqualTo(password);
    }
    @DisplayName("계정 존재하지 않을 때 로그인 실패 테스트")
    @Test
    void loginwithoutAccount() {
        //given
        int userId = 999;
        String password = "password123";
        //when
        AccountDto accountDto = accountMapper.login(userId, password);
        //then
        assertThat(accountDto).isNull();
    }

    @DisplayName("role이 manager가 아닐 때 로그인 실패 테스트")
    @Test
    void loginNotManager() {
        //given
        // role admin 계정
        int userId = 1;
        String password = "password123";
        //when
        AccountDto accountDto = accountMapper.login(userId, password);
        //then
        assertThat(accountDto.getRole()).isNotEqualTo("manager");
    }


}