package com.sh.book.controller;

import com.sh.book.model.service.BookService;

public class BookController {
    BookService bookService = new BookService();
    public void insertBook() {
        bookService.insertBook();
    }

    public void findBook() {
        bookService.findBook();
    }

    public void updateBook() {
        bookService.updateBook();
    }

    public void deleteBook() {
        bookService.deleteBook();
    }
}
