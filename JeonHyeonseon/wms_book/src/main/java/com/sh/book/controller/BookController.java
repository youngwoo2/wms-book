package com.sh.book.controller;

import com.sh.book.model.dto.BookDto;
import com.sh.book.model.service.BookService;
import com.sh.book.view.ResultBookView;

import java.util.List;


public class BookController {
    private BookService bookService = new BookService();

    public void findAllBooks() {
        try {
            List<BookDto> list = bookService.findAllBooks();
            ResultBookView.displayBookList(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findByBookId(int bookId) {
        try {
            BookDto bookDto = bookService.findByBookId(bookId);
            ResultBookView.displayBook(bookDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchBooks() {

    }
}
