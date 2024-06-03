package com.sh.book.controller;

import com.sh.book.model.entity.Book;
import com.sh.book.model.service.BookService;
import com.sh.book.view.BookResultview;
import com.sh.common.ErrorView;
import com.sh.common.error.ErrorCode;

import java.util.List;

public class BookController {
    BookService bookService = new BookService();
    public void insertBook() {
        bookService.insertBook();
    }

    public void updateBook() {
        bookService.updateBook();
    }

    public void deleteBook() {
        bookService.deleteBook();
    }

    public void findAllBook() {
        try{
            List<Book> bookList = bookService.findAllBook();
            BookResultview.displayBookList(bookList);
        } catch (Exception e) {
            e.printStackTrace();
            ErrorView.displayError((ErrorCode.FIND_All_BOOK_ERROR));
        }
    }

    public void findBookByBookId(int bookId) {
        try{
            //0 ~ 1개의 Book 반환 : Book
            Book book = bookService.findBookById(bookId);
            BookResultview.displayBook(book);
        } catch (Exception e) {
            e.printStackTrace();
            ErrorView.displayError(ErrorCode.FIND_A_BOOK_ERROR);
        }
    }

//    public void findBookByCategory() {
//        bookService.findBookByCategory();
//    }

}
