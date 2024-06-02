package com.sh.book.view;

import com.sh.book.model.entity.Book;

import java.util.List;

public class BookResultview {
    public static void displayBookList(List<Book> bookList) {
        if(bookList.isEmpty()) {
            System.out.println("😅 조회된 책이 없습니다. 😅");
        }
    }

    public static void displayBook(Book book) {
        if(book == null) {
            System.out.println("😅 조회된 책이 없습니다. 😅");
        }
        else {
            System.out.println("============================");
            System.out.println("BookId : " + book.getBookId());
            System.out.println("BookTitle : " + book.getBookTitle());
            System.out.println("Author : " + book.getAuthor());
            System.out.println("Description : " + book.getDescription());
            System.out.println("Price : " + book.getPrice());
            System.out.println("Category : " + book.getCategory());
            System.out.println("BookCreatedAt : " + book.getBookCreatedAt());
            System.out.println("============================");
        }
    }
}
