package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;

import java.util.List;

public interface BookMapper {
    List<BookDto> findAllBooks();

    BookDto findByBookId(int bookId);
}
