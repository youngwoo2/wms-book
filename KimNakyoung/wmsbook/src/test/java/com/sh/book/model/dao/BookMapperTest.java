package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.session.SqlSession;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
        this.sqlSession.commit();
        this.sqlSession.close();

    }

    @Test
    void findAll() {
        //given
        // 전체조회

        //when
        List<BookDto> list = bookMapper.findAll();
        //then
        assertThat(list)
                .isNotNull()
                .isNotEmpty();

    }

    @Test
    void findByBookId(){
        //given
        int bookId = 1;

        //when
        BookDto bookDto = bookMapper.findByBookId(bookId);

        //then
        assertThat(bookDto)
                .isNotNull();
    }

    @Test
    void findByTitle(){
        //given
        String title = "수학의 정석";

        //when
        List<BookDto> list = bookMapper.findByTitle(title);

        //then
        assertThat(list)
                .isNotNull()
                .allSatisfy((bookDto) -> {
                    assertThat(bookDto.getTitle()).isEqualTo(title);
                });
    }

    @Test
    void findByAuthor() {
        //given
        String author = "정재훈";
        //when
        List<BookDto> list = bookMapper.findByAuthor(author);
        //then
        assertThat(list)
                .isNotNull()
                .allSatisfy((bookDto) -> {
                    assertThat(bookDto.getAuthor()).isEqualTo(author);
                });

    }

    @Test
    void findByCategory() {
        //given
        String category = "역사";
        //when
        List<BookDto> list = bookMapper.findByCategory(category);
        //then
        assertThat(list)
                .isNotNull()
                .allSatisfy((bookDto) -> {
                    assertThat(bookDto.getCategory()).isEqualTo(category);
                });

    }

    @Test
    void findByPrice() {
        //given
        int price = 25000;
        //when
        List<BookDto> list = bookMapper.findByPrice(price);
        //then
        assertThat(list)
                .isNotNull()
                .allSatisfy((bookDto) -> {
                    assertThat(bookDto.getPrice()).isEqualTo(price);
                });

    }






}