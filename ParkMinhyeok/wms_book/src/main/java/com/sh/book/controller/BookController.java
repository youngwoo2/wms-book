package com.sh.book.controller;

import com.sh.book.model.dto.BookDto;
import com.sh.book.model.service.BookService;

import java.util.List;

public class BookController {
    private BookService bookService = new BookService();

    public List<BookDto> findAll() {
        //Todo
        List<BookDto> bookList = bookService.findAll();
        return bookList;
    }
}
