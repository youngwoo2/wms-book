package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;
import com.sh.common.SearchCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    // 도서 추가
    int insertBook(BookDto bookDto);

    // 도서 수정
    int updateBook(BookDto bookDto);

    // 도서 삭제
    int deleteBook(int bookId);

    // 모든 도서 목록 가져오기
    List<BookDto> findAllBook();

    // 기준별 도서 검색하기
    List<BookDto> searchBook(SearchCriteria searchCriteria);


}
