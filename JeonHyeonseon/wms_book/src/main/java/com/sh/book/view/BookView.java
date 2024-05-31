package com.sh.book.view;

import com.sh.book.controller.BookController;

import java.util.Scanner;

public class BookView {
    private BookController bookController = new BookController();
    private Scanner sc = new Scanner(System.in);

    public void bookMenu() {
        String menu = """
                    [도서 메뉴 선택]
                =====================
                     1. 도서 등록
                     2. 도서 수정
                     3. 도서 조회
                     4. 도서 검색
                     0. 돌아가기
                =====================
                입력 : """;
        while (true) {
            System.out.println(menu);
            String choice = sc.next();
            switch (choice) {
                case "1" : break;
                case "2" : break;
                case "3" : break;
                case "4" : break;
                case "0" : return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
