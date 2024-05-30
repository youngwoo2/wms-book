package com.sh.book.view;

import java.util.Scanner;

public class BookView {
    Scanner sc = new Scanner(System.in);
    public void bookMenu() {
        String bookmenu = """
                📖도서 관리 메뉴를 선택해주세요📖
                        1. 도서등록
                        2. 도서조회
                        3. 도서수정
                        4. 도서삭제
                """;
        System.out.println(bookmenu);
        String choice = sc.next();
        switch (choice) {
            case "1" : break;
            case "2" : break;
            case "3" : break;
            case "4" : break;
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요😥");
        }
    }
}
