package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;

import java.util.List;

public interface BookMapper {
    List<BookDto> findAllBooks();

    BookDto findByBookId(int bookId);

    BookDto findByTitle(String title);

    BookDto findByAuthor(String author);

    BookDto findByCategory(String category);

    BookDto findByPrice(int price);

    int insertBook(BookDto bookDto);

    int updateBook(BookDto bookDto);

    int deleteBook(int bookId);
}
