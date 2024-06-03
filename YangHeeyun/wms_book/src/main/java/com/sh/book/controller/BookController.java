package com.sh.book.controller;

import com.sh.book.model.dto.BookDto;
import com.sh.book.service.BookService;
import com.sh.book.view.BookResultView;
import com.sh.common.SearchCriteria;

import java.util.List;

public class BookController {

    static BookService bookService = new BookService();

    public void insertBook() {
        bookService.insertBook();
    }

    public void updateBook() {
        bookService.updateBook();
    }

    public void findAllBook() {
       List<BookDto> bookList =  bookService.findAllBook();
       for(BookDto bookDto : bookList){
           System.out.println(bookDto);
       }
    }

    public List<BookDto> searchBook(SearchCriteria searchCriteria) {
        try{
            List<BookDto> bookList = bookService.searchBook(searchCriteria);
            BookResultView.displayBookList(bookList);
//            for(BookDto bookDto : bookList){
//                System.out.println(bookDto);
//            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}