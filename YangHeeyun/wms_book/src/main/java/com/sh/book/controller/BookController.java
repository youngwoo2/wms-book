package com.sh.book.controller;

import com.sh.book.model.dto.BookDto;
import com.sh.book.service.BookService;
import java.util.List;

public class BookController {

    BookService bookService = new BookService();

    public void insertBook() {
        bookService.insertBook();
    }

    public void updateBook() {
        bookService.updateBook();
    }

    public void findAllBook() {
       List<BookDto> bookList =  bookService.findAllBook();
       for(BookDto bookDto: bookList){
           System.out.println(bookDto);
       }
    }

    public List<BookDto> findBookByChoice(int bookId, String title, String author, int price, String category){
        return bookService.findBookByChoice(bookId, title,author,price,category);
    }

//    public void findBookByChoice(int bookId, String title, String author, int price, String category){
//        List<BookDto> bookList =  bookService.findBookByChoice(bookId, title,author,price,category);
//        for(BookDto bookDto: bookList){
//            System.out.println(bookDto);
//        }
//    }
}