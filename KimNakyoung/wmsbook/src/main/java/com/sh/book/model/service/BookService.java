package com.sh.book.model.service;

import com.sh.book.model.dao.BookMapper;
import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class BookService {

    //전체 목록을 조회
    public List<BookDto> findAll(){
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDto> list = bookMapper.findAll();
        sqlSession.close();
        return list;
    }
    // 도서 아이디를 입력하고, 해당 도서 1건을 조회
    public BookDto findByBookId(int bookId) {
        SqlSession sqlSession = getSqlSession(); // 일단 세션 가져와
        BookMapper menuMapper = sqlSession.getMapper(BookMapper.class);
        BookDto bookDto = menuMapper.findByBookId(bookId);
        sqlSession.close(); //세션 닫아
        return bookDto;
    }


    //도서명으로 검색
    //도서명으로 조회하면 중복때문에 여러개일 수 도 있을거같아서 리스트로 받음
    public List<BookDto> findByTitle(String title){
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDto> list = bookMapper.findByTitle(title);
        sqlSession.close();
        return list;
    }

//    저자로 검색
public List<BookDto> findByAuthor(String author){
    SqlSession sqlSession = getSqlSession();
    BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
    List<BookDto> list = bookMapper.findByAuthor(author);
    sqlSession.close();
    return list;
}
    //카테고리로 검색
    public List<BookDto> findByCategory(String category){
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDto> list = bookMapper.findByCategory(category);
        sqlSession.close();
        return list;
    }

    // 가격 으로 검색

    public List<BookDto> findByPrice(int price){
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDto> list = bookMapper.findByPrice(price);
        sqlSession.close();
        return list;
    }










}
