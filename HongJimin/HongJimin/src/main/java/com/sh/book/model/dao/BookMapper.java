package com.sh.book.model.dao;

import com.sh.book.model.entity.Book;

import java.util.List;

public interface BookMapper {
    List<Book> findAllBook();

    Book findBookById(int bookId);

    Book findByTitle(String title);

    Book findByAuthor(String author);

    List<Book> findByCategory(String category);

    List<Book> findBookByPrice(int price);
}
