package com.sh.book.model.service;

import com.sh.book.model.dao.BookMapper;
import com.sh.book.model.entity.Book;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class BookService {
    public void insertBook() {
    }

    public void updateBook() {

    }

    public void deleteBook() {
    }

    public List<Book> findAllBook() {
        SqlSession sqlSession = getSqlSession();;
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        List<Book> bookList = bookMapper.findAllBook();
        sqlSession.close();
        return bookList;
    }

    public Book findBookById(int bookId) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        Book book = bookMapper.findBookById(bookId);
        sqlSession.close();
        return book;
    }

//    public List<Book> findBookByCategory() {
//        List<Book> bookList = b
//    }
}
