package com.sh.book.model.service;

import com.sh.book.model.dao.BookMapper;
import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.session.SqlSession;

import java.awt.print.Book;
import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class BookService {
    public static BookDto findByTitle(String title) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookDto bookDto = bookMapper.findByTitle(title);
        sqlSession.close();
        return bookDto;
    }

    public static BookDto findByAuthor(String author) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookDto bookDto = bookMapper.findByAuthor(author);
        sqlSession.close();
        return bookDto;
    }

    public static BookDto findByCategory(String category) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookDto bookDto = bookMapper.findByCategory(category);
        sqlSession.close();
        return bookDto;
    }

    public static BookDto findByPrice(int price) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookDto bookDto = bookMapper.findByPrice(price);
        sqlSession.close();
        return bookDto;
    }

    public List<BookDto> findAllBooks() {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDto> books = bookMapper.findAllBooks();
        sqlSession.close();
        return books;
    }

    public BookDto findByBookId(int bookId) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookDto list = bookMapper.findByBookId(bookId);
        sqlSession.close();
        return list;
    }
}
