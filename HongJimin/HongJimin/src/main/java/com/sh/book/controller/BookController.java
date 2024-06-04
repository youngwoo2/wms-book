package com.sh.book.controller;

import com.sh.book.model.entity.Book;
import com.sh.book.model.service.BookService;
import com.sh.book.view.BookResultview;
import com.sh.common.ErrorView;
import com.sh.common.error.ErrorCode;

import java.util.List;

public class BookController {
    BookService bookService = new BookService();

    public void insertBook(Book book) {
        int result = bookService.insertBook(book);
        BookResultview.displayResult("도서 등록", result);
    }

    public void updateBook(Book book) {
        int result = bookService.updateBook(book);
        BookResultview.displayResult("도서 정보 수정", result);
    }

    public void deleteBook(int bookId) {
        int result = bookService.deleteBook(bookId);
        BookResultview.displayResult("도서 삭제", result);
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

    // ID로 책 조회
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

    // 책 제목으로 책 조회
    public void findByTitle(String title) {
        try {
            Book book = bookService.findByTitle(title);
            BookResultview.displayBook(book);
        } catch (Exception e) {
            e.printStackTrace();
            ErrorView.displayError(ErrorCode.FIND_BOOK_BY_TITLE_ERROR);
        }
    }

    //저자 이름으로 책 조회
    public void findByAuthor(String author) {
        try {
            Book book = bookService.findByAuthor(author);
            BookResultview.displayBook(book);
        } catch (Exception e) {
            e.printStackTrace();
            ErrorView.displayError(ErrorCode.FIND_BOOK_BY_AUTHOR_ERROR);
        }
    }

    // 카테고리로 책 조회
    public void findByCategory(String category) {
        try {
            List<Book> bookList = bookService.findByCategory(category);
            BookResultview.displayBookByCategory(bookList);
        } catch (Exception e) {
            e.printStackTrace();
            ErrorView.displayError(ErrorCode.FIND_BOOK_BY_CATEGORY_ERROR);
        }
    }

    public void findBookByPrice(int price) {
        try{
            List<Book> bookList = bookService.findBookByPrice(price);
            BookResultview.displayBookByPrice(bookList);
        } catch (Exception e) {
            e.printStackTrace();
            ErrorView.displayError(ErrorCode.FIND_BOOK_BY_PRICE_ERROR);
        }
    }
}
