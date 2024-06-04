package com.sh.book.controller;

import com.sh.book.model.dto.BookDto;
import com.sh.book.service.BookService;
import com.sh.book.view.BookResultView;
import com.sh.common.SearchCriteria;

import java.util.List;

public class BookController {

    static BookService bookService = new BookService();

    public void insertBook(BookDto bookDto) {
        bookService.insertBook(bookDto);
    }

    public void updateBook(BookDto bookDto) {
        bookService.updateBook(bookDto);
    }

    public void deleteBook(int bookId) {
        bookService.deleteBook(bookId);
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
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}