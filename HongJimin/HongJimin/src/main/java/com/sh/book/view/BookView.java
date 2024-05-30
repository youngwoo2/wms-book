package com.sh.book.view;

import com.sh.book.controller.BookController;

import java.awt.print.Book;
import java.util.Scanner;

public class BookView {
    Scanner sc = new Scanner(System.in);
    BookController bookController = new BookController();

    public void bookMenu() {
        String bookMenu = """
                ==============================
                 📖도서 관리 메뉴를 선택해주세요📖
                        1. 도서 등록
                        2. 도서 조회
                        3. 도서 수정
                        4. 도서 삭제
                        5. 뒤로 가기
                ==============================
                """;
        System.out.println(bookMenu);
        String choice = sc.next();
        switch (choice) {
            case "1" :
                // 1. 도서 등록
                bookController.insertBook();
                break;
            case "2" :
                // 2. 도서 조회
                bookController.findBook();
                break;
            case "3" :
                // 3. 도서 수정
                bookController.updateBook();
                break;
            case "4" :
                // 4. 도서 삭제
                bookController.deleteBook();
                break;
            case "5" :
                // 5. 뒤로 가기
                return;
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요😥");
        }
    }
}
