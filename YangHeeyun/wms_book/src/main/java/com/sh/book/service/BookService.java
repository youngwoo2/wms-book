package com.sh.book.service;

import com.sh.book.model.dao.BookMapper;
import com.sh.book.model.dto.BookDto;
import com.sh.common.SearchCriteria;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class BookService {
    public int insertBook(BookDto bookDto) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        try{
            // 트랜잭션 처리코드
            // 1건의 도서 등록
            int result = bookMapper.insertBook(bookDto);
            sqlSession.commit();
            return result;
        }catch(Exception e){
            sqlSession.rollback();
            throw new RuntimeException(e);
        }finally{
            sqlSession.close();
        }
    }

    public int updateBook(BookDto bookDto) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        try{
            // 트랜잭션 처리코드
            // 1건의 도서 등록
            int result = bookMapper.updateBook(bookDto);
            sqlSession.commit();
            return result;
        }catch(Exception e){
            sqlSession.rollback();
            throw new RuntimeException(e);
        }finally{
            sqlSession.close();
        }
    }

    public int deleteBook(int bookId) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        try{
            // 트랜잭션 처리코드
            // 1건의 도서 등록
            int result = bookMapper.deleteBook(bookId);
            sqlSession.commit();
            return result;
        }catch(Exception e){
            sqlSession.rollback();
            throw new RuntimeException(e);
        }finally{
            sqlSession.close();
        }
    }

    public List<BookDto> findAllBook() {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        return bookMapper.findAllBook();
    }

    public List<BookDto> searchBook(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDto> bookList = bookMapper.searchBook(searchCriteria);
        sqlSession.close();
        return bookList;
    }
}
