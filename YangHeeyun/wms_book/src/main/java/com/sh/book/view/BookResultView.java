package com.sh.book.view;

import com.sh.book.model.dto.BookDto;

import java.util.List;

public class BookResultView {
    public static void displayBookList(List<BookDto> bookList){
        if(!bookList.isEmpty())
            System.out.println(bookList);
        else
            System.out.println("❌조건에 맞는 도서가 없습니다❌");
    }
}
