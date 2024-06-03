package com.sh.book.controller;

import com.sh.book.model.dto.BookDto;
import com.sh.book.model.service.BookService;

import java.util.List;

public class BookController {
    private BookService bookService = new BookService();

    public List<BookDto> getAllBooks() {
        return bookService.getAllBooks();
    }

    public BookDto getBookById(int bookId) {
        return bookService.getBookById(bookId);
    }

    public List<BookDto> searchBookByCriteria(String title, String author, String category, Integer price) {
        return bookService.searchBookByCriteria(title, author, category, price);
    }

}
