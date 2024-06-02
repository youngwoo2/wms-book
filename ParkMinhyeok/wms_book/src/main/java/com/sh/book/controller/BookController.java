package com.sh.book.controller;

import com.sh.book.model.dto.BookDto;
import com.sh.book.model.service.BookService;

import java.util.List;

public class BookController {
    private BookService bookService = new BookService();

    public List<BookDto> findAll() {
        return bookService.findAll();
    }
    public BookDto findByBookId(int bookId) {
        return bookService.findByBookId(bookId);
    }
    // 도서명, 저자, 카테고리, 가격 등을 기준으로 검색할수 있습니다.
    public BookDto findByBookTitle(String title) {
        return bookService.findByBookTitle(title);
    }
    public BookDto findByAuthor(String author) {
        return bookService.findByAuthor(author);
    }
}
