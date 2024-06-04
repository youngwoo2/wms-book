package com.sh.book.view;

import com.sh.book.controller.BookController;

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
                findBookMenu();
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

    public void findBookMenu(){
        String findBookMenu = """
                ==============================
                📖 도서 조회 메뉴를 선택해주세요 📖
                    1. 도서 전체 목록 조회
                    2. 도서 1권 조회
                    3. 분류(?) 별 조회
                    4. 뒤로 가기
                ==============================
                """;
        System.out.println(findBookMenu);
        String choice = sc.next();
        switch (choice) {
            case "1" : bookController.findAllBook(); break;
            case "2" : findBookById(); break;
//            case "3" : bookController.findBookByCategory(); break;
            case "4" : return;
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }

    }

    public void findBookById(){
        System.out.println("▶️ Book Id 입력 : ");
        int bookId = sc.nextInt();
        bookController.findBookByBookId(bookId);
    }


}
