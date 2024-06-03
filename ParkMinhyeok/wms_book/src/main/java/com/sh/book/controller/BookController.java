package com.sh.book.controller;

import com.sh.book.model.dto.BookDto;
import com.sh.book.model.service.BookService;

import java.util.List;

public class BookController {
    private BookService bookService = new BookService();

    public void findAll() {
        List<BookDto> list = bookService.findAll();
        for (BookDto book : list) {
            System.out.println(book);
        }
    }
    public void findByBookId(int bookId) {
        BookDto book = bookService.findByBookId(bookId);
        System.out.println(book);
    }
    // 도서명, 저자, 카테고리, 가격 등을 기준으로 검색할수 있습니다.
    public void findByBookTitle(String title) {
        BookDto book = bookService.findByBookTitle(title);
        System.out.println(book);
    }
    public void findByAuthor(String author) {
        BookDto book = bookService.findByAuthor(author);
        System.out.println(book);
    }
}
