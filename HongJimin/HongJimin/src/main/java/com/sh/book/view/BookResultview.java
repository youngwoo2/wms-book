package com.sh.book.view;

import com.sh.book.model.entity.Book;

import java.util.List;

public class BookResultview {
    public static void displayBookList(List<Book> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("😅 조회된 도서가 없습니다. 😅");
        } else {
            System.out.println("==================================");
            System.out.println(" 🔍 조회한 도서의 정보입니다. ");
            System.out.println("==================================");
            System.out.println("도서 ID \t 도서 제목 \t 저자 \t 설명 \t 가격 \t 카테고리 \t 생성 일시 ");
            for (Book book : bookList) {
                System.out.println(
                        book.getBookId() + "\t" +
                                book.getTitle() + "\t\t" +
                                book.getAuthor() + "\t" +
                                book.getDescription() + "\t" +
                                book.getPrice() + "\t" +
                                book.getCategory() + "\t" +
                                book.getBookCreatedAt()
                );
            }
        }
    }

    public static void displayBook(Book book) {
        if (book == null) {
            System.out.println("😅 조회된 도서가 없습니다. 😅");
        } else {
            System.out.println("============================");
            System.out.println(" 🔍 조회한 도서의 정보입니다. ");
            System.out.println("============================");
            System.out.println("BookId : " + book.getBookId());
            System.out.println("BookTitle : " + book.getTitle());
            System.out.println("Author : " + book.getAuthor());
            System.out.println("Description : " + book.getDescription());
            System.out.println("Price : " + book.getPrice());
            System.out.println("Category : " + book.getCategory());
            System.out.println("BookCreatedAt : " + book.getBookCreatedAt());
            System.out.println("============================");
        }
    }

    public static void displayBookByPrice(List<Book> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("😅 조회된 도서가 없습니다. 😅");
        } else {
            System.out.println("==================================");
            System.out.println("🔍 " + bookList.get(0).getPrice() + "원인 도서의 목록입니다.");
            System.out.println("=====================================================================================");
            for (Book book : bookList) {
                System.out.println(
                        book.getBookId() + "\t" +
                                book.getTitle() + "\t\t" +
                                book.getAuthor() + "\t" +
                                book.getDescription() + "\t" +
                                book.getPrice() + "\t" +
                                book.getCategory() + "\t" +
                                book.getBookCreatedAt()
                );
            }
        }
    }

    public static void displayBookByCategory(List<Book> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("😅 조회된 도서가 없습니다. 😅");
        } else {
            System.out.println("==================================");
            System.out.println("🔍 " + bookList.get(0).getCategory() + " 분야의 도서 목록입니다.");
            System.out.println("=====================================================================================");
            for (Book book : bookList) {
                System.out.println(
                        book.getBookId() + "\t" +
                                book.getTitle() + "\t\t" +
                                book.getAuthor() + "\t" +
                                book.getDescription() + "\t" +
                                book.getPrice() + "\t" +
                                book.getCategory() + "\t" +
                                book.getBookCreatedAt()
                );
            }
        }
    }
}
