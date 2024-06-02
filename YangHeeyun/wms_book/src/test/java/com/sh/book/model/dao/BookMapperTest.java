package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.junit.jupiter.api.Assertions.*;

class BookMapperTest {

    @DisplayName("findAllBook Test")
    @Test
    public void testFindAllBook() {
        try (SqlSession sqlSession = getSqlSession()) {
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            List<BookDto> books = bookMapper.findAllBook();
            assertNotNull(books);
            assertFalse(books.isEmpty());

            for (BookDto book : books) {
                System.out.println(book);
            }
            System.out.println();
        }
    }

    @Test
    public void testFindBookByChoice() {
        try (SqlSession sqlSession = getSqlSession()) {
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            List<BookDto> books = bookMapper.findBookByChoice(0,"자바", null, 0, null);
            assertNotNull(books);
            assertFalse(books.isEmpty());

            for (BookDto book : books) {
                System.out.println(book);
            }
            System.out.println();
        }
    }
}