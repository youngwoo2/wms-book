package com.sh.book.view;

import java.util.Scanner;

public class BookView {
    Scanner sc = new Scanner(System.in);
    public void bookMenu() {
        String menu = """
                ===========================================
                도서 관리 메뉴
                1. 도서 등록
                2. 도서 조회
                3. 도서 수정
                4. 도서 삭제
                0. 뒤로가기
                ===========================================
                """;
        System.out.println(menu);
        String choice = sc.next();
        switch (choice) {
            case "1" :
                System.out.println("도서 등록");
                break;
            case "2" :
                System.out.println("도서 조회");
                break;
            case "3" :
                System.out.println("도서 수정");
                break;
            case "4" :
                System.out.println("도서 삭제");
                break;
            case "0" :
                return;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
