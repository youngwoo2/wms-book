package com.sh.book.controller;

import com.sh.book.service.BookService;

public class BookController {

    BookService bookService = new BookService();

    public void insertBook() {
        bookService.insertBook();
    }

    public void updateBook() {
        bookService.updateBook();
    }

    public void findAllBook() {
        bookService.findAllBook();
    }

    public void findBook() {
        bookService.findBook();
    }
}
