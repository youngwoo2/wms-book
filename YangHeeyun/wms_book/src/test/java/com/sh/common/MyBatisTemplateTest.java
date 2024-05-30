package com.sh.common;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;

class MyBatisTemplateTest {

    @Test
    @DisplayName("SqlSessiom객체를 정상적으로 가져올 수 있다.")
    void test() {
        SqlSession sqlSession = getSqlSession();
        assertThat(sqlSession).isNotNull();
    }
}