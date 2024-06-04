package com.sh.book.view;

import com.sh.book.model.dto.BookDto;

import java.util.List;

public class ResultBookView {
    public static void displayBookList(List<BookDto> list) {
        if (list.isEmpty()) {
            System.out.println("도서 목록에 해당되지 않습니다.");
        } else {
            System.out.println("------------------------------------------");
            System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t",
                    "BookID", "Title", "Author", "Description", "Price", "Category", "CreatedAt");
            System.out.println("------------------------------------------");
            for (BookDto bookDto : list) {
                System.out.printf("%d\t %s\t %s\t %s\t %d\t %s\t",
                        bookDto.getBookId(),
                        bookDto.getTitle(),
                        bookDto.getAuthor(),
                        bookDto.getDescription(),
                        bookDto.getPrice(),
                        bookDto.getCategory(),
                        bookDto.getCreatedAt());
            }
            System.out.println("------------------------------------------");
        }
    }

    public static void displayBook(BookDto bookDto) {
        if (bookDto == null) {
            System.out.println("도서 목록에 해당되지 않습니다.");
        } else {
            System.out.println("------------------------------------------");
            System.out.println("BookID : " + bookDto.getBookId());
            System.out.println("Title : " + bookDto.getTitle());
            System.out.println("Author : " + bookDto.getAuthor());
            System.out.println("Description : " + bookDto.getDescription());
            System.out.println("Price : " + bookDto.getPrice());
            System.out.println("Category : " + bookDto.getCategory());
            System.out.println("CreatedAt : " + bookDto.getCreatedAt());
            System.out.println("------------------------------------------");
        }
    }
}
