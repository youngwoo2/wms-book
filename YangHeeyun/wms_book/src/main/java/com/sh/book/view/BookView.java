package com.sh.book.view;

import com.sh.book.controller.BookController;

import java.util.Scanner;

public class BookView {

    private Scanner sc = new Scanner(System.in);
    BookController bookController = new BookController();

    public void bookMenu(){
        String menu = """
        =====================
        도서 관리 메뉴를 선택하세요
        1. 도서 정보 등록
        2. 도서 정보 수정
        3. 도서 목록 조회
        4. 도서 목록 검색
        0. 뒤로가기
        =====================
        입력 : """;

        while(true){
            System.out.print(menu);
            String choice = sc.next();
            switch(choice){
                case "1" : bookController.insertBook(); break;
                case "2" : bookController.updateBook(); break;
                case "3" : bookController.findAllBook(); break;
                case "4" : bookController.findBook(); break;
                case "0" : return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
