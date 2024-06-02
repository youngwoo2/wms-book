package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;

import java.util.List;

public interface BookMapper {
    List<BookDto> findAll();
    BookDto findByBookID(int bookId);
    List<BookDto> findByTitle(String title);
    List<BookDto> findByAuthor(String author);
    List<BookDto> findByCategory(String category);
    List<BookDto> findByPrice(int price);

}
