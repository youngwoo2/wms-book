package com.sh.book.service;

import com.sh.book.model.dao.BookMapper;
import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.session.SqlSession;

import java.awt.print.Book;
import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class BookService {
    public void insertBook() {
    }

    public void updateBook() {
    }

    public List<BookDto> findAllBook() {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        return bookMapper.findAllBook();
    }

    public List<BookDto> findBookByChoice(int bookId, String title, String author, int price, String category) {
       SqlSession sqlSession = getSqlSession();
       BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
       return bookMapper.findBookByChoice(bookId, title,author,price,category);
    }
}
