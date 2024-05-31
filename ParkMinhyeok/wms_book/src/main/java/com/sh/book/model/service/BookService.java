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
        return bookList;
    }
}
