package com.sh.book.model.service;

import com.sh.book.model.dao.BookMapper;
import com.sh.book.model.entity.Book;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

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

    public Book findByTitle(String title) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        Book book = bookMapper.findByTitle(title);
        sqlSession.close();
        return book;
    }

    public Book findByAuthor(String author) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        Book book = bookMapper.findByAuthor(author);
        sqlSession.close();
        return book;
    }

    public List<Book> findByCategory(String category) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        List<Book> bookList = bookMapper.findByCategory(category);
        sqlSession.close();
        return bookList;
    }


    public List<Book> findBookByPrice(int price) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        List<Book> bookList = bookMapper.findBookByPrice(price);
        sqlSession.close();
        return bookList;
    }
}
