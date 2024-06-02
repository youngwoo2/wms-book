package com.sh.book.model.service;

import com.sh.book.model.dao.BookMapper;
import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class BookService {
    SqlSession sqlSession = getSqlSession();
    BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

    public List<BookDto> findAll() {
        List<BookDto> bookList = bookMapper.findAll();
        sqlSession.close();
        return bookList;
    }

    public BookDto findByBookId(int bookId) {
        BookDto book = bookMapper.findByBookId(bookId);
        sqlSession.close();
        return book;
    }

    public BookDto findByBookTitle(String title) {
        BookDto book = bookMapper.findByBookTitle(title);
        sqlSession.close();
        return book;
    }

    public BookDto findByAuthor(String author) {
        BookDto book = bookMapper.findByBookAuthor(author);
        return book;
    }
}
