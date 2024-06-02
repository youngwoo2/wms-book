package com.sh.user.model.dao;

import com.sh.book.model.dao.BookMapper;
import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import java.util.List;
import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.junit.jupiter.api.Assertions.*;

public class BookMapperTest {
    @Test
    public void testSelectAllBooks() {
        try (SqlSession sqlSession = getSqlSession()) {
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            List<BookDto> books = bookMapper.selectAllBooks();
            assertNotNull(books);
            assertFalse(books.isEmpty());

            System.out.println("--[testSelectAllBooks]--");
            for (BookDto book : books) {
                System.out.println(book);
            }
            System.out.println();
        }
    }

    @Test
    public void testSelectBookById() {
        try (SqlSession sqlSession = getSqlSession()) {
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            BookDto book = bookMapper.selectBookById(1);
            assertNotNull(book);
            assertEquals(1, book.getBookId());

            System.out.println("--[testSelectBookById]--");
            System.out.println(book);
            System.out.println();
        }
    }

    @Test
    public void testSearchBookByCriteria() {
        try (SqlSession sqlSession = getSqlSession()) {
            BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
            List<BookDto> books = bookMapper.searchBookByCriteria("데이터베이스 관리", "홍길동", "컴퓨터", null);
            assertNotNull(books);
            assertFalse(books.isEmpty());

            System.out.println("--[testSearchBooks]--");
            for (BookDto book : books) {
                System.out.println(book);
            }
            System.out.println();
        }
    }

}
