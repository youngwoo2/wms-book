package com.sh.book.model.service;

import com.sh.book.model.dao.BookMapper;
import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class BookService {

    public List<BookDto> findAll() {
        // Todo
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDto> bookList = bookMapper.findAll();
        sqlSession.close();
        return bookList;
    }

    public BookDto findByBookId(int bookId) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookDto book = bookMapper.findByBookId(bookId);
        sqlSession.close();
        return book;
    }

    public BookDto findByBookTitle(String title) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookDto book = bookMapper.findByBookTitle(title);
        sqlSession.close();
        return book;
    }

    public BookDto findByAuthor(String author) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookDto book = bookMapper.findByBookAuthor(author);
        return book;
    }
}
