package com.sh.book.model.dao;

import com.sh.book.model.entity.Book;
import com.sh.user.model.dao.UserMapper;
import com.sh.user.model.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;

public class BookMaperTest {
    SqlSession sqlSession;
    BookMapper bookMapper;

    @BeforeEach
    void setUp() {
        this.sqlSession = getSqlSession();
        this.bookMapper = this.sqlSession.getMapper(BookMapper.class);
    }

    @AfterEach
    void tearDown() {
        this.sqlSession.close();
    }

    @DisplayName("BookId로 책 한 권 조회")
    @Test
    void findBookByBookId() {
        // given 입력받았을때
        int bookId = 1;

        // when 조회햇을때
        Book book = bookMapper.findBookById(bookId);

        // then 그 값을 조회~
        assertThat(book).isNotNull();
        assertThat(book.getBookId()).isEqualTo(bookId);
    }

    @DisplayName("Book 전체 조회")
    @Test
    void findAllBook() {
        // given 입력받았을때
        int bookId = 1;

        // when 조회햇을때
        Book book = bookMapper.findBookById(bookId);

        // then 그 값을 조회~
        assertThat(book).isNotNull();
        assertThat(book.getBookId()).isEqualTo(bookId);
    }
}
