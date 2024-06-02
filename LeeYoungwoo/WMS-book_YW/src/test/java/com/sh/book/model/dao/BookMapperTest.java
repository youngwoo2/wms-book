package com.sh.book.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.junit.jupiter.api.Assertions.*;

class BookMapperTest {

    private SqlSession sqlSession;
    private BookMapper BookMapper;

    @BeforeEach
    void setUp() {
        this.sqlSession = getSqlSession();
        this.BookMapper = this.sqlSession.getMapper(BookMapper.class);
    }

    @AfterEach
    void tearDown() {
        this.sqlSession.close();
    }

    @DisplayName("도서 전체목록 조회")
    @Test
    void findAll() {
        // given
        
        // when

        // then
    }

    @Test
    void findByBookID() {
    }

    @Test
    void findByTitle() {
    }

    @Test
    void findByAuthor() {
    }

    @Test
    void findByCategory() {
    }

    @Test
    void findByPrice() {
    }
}