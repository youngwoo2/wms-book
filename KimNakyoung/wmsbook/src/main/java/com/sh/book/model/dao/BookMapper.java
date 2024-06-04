package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;

import java.util.List;

public interface BookMapper {
    List<BookDto> findAll(); // 전체조회
    BookDto findByBookId(int bookId); // 도서코드로 한개의 도서정보 조회
    List<BookDto> findByTitle(String title); // 상세검색중 도서명으로 검색
    List<BookDto> findByAuthor(String author); // 상세검색중 저자로 검색
    List<BookDto> findByCategory(String category); // 상세검색중 카테고리로 검색
    List<BookDto> findByPrice(int price); // 상세검색중 카테고리로 검색

}
