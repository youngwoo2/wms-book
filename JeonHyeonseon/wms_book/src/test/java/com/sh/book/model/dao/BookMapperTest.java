package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookMapperTest {
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

    @DisplayName("도서 목록 전체 조회")
    @Test
    void findAllBooks() {
        List<BookDto> books = bookMapper.findAllBooks();
        // then
        assertThat(books)
                .isNotNull()
                .isNotEmpty()
                .allMatch((book) -> book != null)
                .allSatisfy((book) -> {
                    assertThat(book.getBookId()).isNotZero().isPositive();
                    assertThat(book.getTitle()).isNotNull();
                    assertThat(book.getAuthor()).isNotNull();
                    assertThat(book.getDescription()).isNotNull();
                    assertThat(book.getPrice()).isNotZero().isPositive();
                    assertThat(book.getCategory()).isNotNull();
                });

    }

    @DisplayName("도서 아이디로 조회")
    @Test
    void findByBookId() {
        // given
        int bookId = 1;
        // when
        BookDto book = bookMapper.findByBookId(bookId);
        // then
        assertThat(book).isNotNull();
        assertThat(book.getBookId()).isEqualTo(bookId);
        assertThat(book.getTitle()).isNotNull();
        assertThat(book.getAuthor()).isNotNull();
        assertThat(book.getDescription()).isNotNull();
        assertThat(book.getPrice()).isNotZero().isPositive();
        assertThat(book.getCategory()).isNotNull();
    }

    @DisplayName("도서명으로 검색")
    @Test
    void findByTitle() {
        // given
        String title = "데이터베이스 관리";
        // when
        BookDto bookDto = bookMapper.findByTitle(title);
        // then
        assertThat(bookDto).isNotNull();
        assertThat(bookDto.getTitle()).isEqualTo(title);
    }

    @DisplayName("저자로 검색")
    @Test
    void findByAuthor() {
        // given
        String author = "김철수";
        // when
        BookDto bookDto = bookMapper.findByAuthor(author);
        // then
        assertThat(bookDto).isNotNull();
        assertThat(bookDto.getAuthor()).isEqualTo(author);
    }

    @DisplayName("카테고리로 검색")
    @Test
    void findByCategory() {
        // given
        String category = "인공지능";
        // when
        BookDto bookDto = bookMapper.findByCategory(category);
        // then
        assertThat(bookDto).isNotNull();
        assertThat(bookDto.getCategory()).isEqualTo(category);
    }

    @DisplayName("가격으로 검색")
    @Test
    void findByPrice() {
        // given
//        int price =
    }
}