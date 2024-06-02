package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;

import java.util.List;

public interface BookMapper {
    List<BookDto> findAll();

    BookDto findByBookId(int bookId);

    BookDto findByBookTitle(String title);

    BookDto findByBookAuthor(String author);
}
