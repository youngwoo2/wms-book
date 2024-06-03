package com.sh.book.model.service;

import com.sh.book.model.dao.BookMapper;
import com.sh.book.model.dto.BookDto;
import com.sh.common.SearchCriteria;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class BookService {
    public List<BookDto> findAll() {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDto> list = bookMapper.findAll();
        return list;
    }

    public BookDto findByBookId(int bookId) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookDto bookDto = bookMapper.findByBookId(bookId);
        return bookDto;
    }

    public List<BookDto> searchMenu(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDto> bookList = bookMapper.searchMenu(searchCriteria);
        return bookList;
    }
}
