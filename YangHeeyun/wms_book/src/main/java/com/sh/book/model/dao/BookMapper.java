package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    // 모든 도서 목록 가져오기
    List<BookDto> findAllBook();

    List<BookDto> findBookByChoice(@Param("bookId") int bookId,
                                   @Param("title") String title,
                                   @Param("author") String author,
                                   @Param("price") int price,
                                   @Param("category") String category);
}
