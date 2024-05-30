package com.sh.book.view;

import java.util.Scanner;

public class BookView {
    Scanner sc = new Scanner(System.in);
    public void bookMenu() {
        String bookmenu = """
                [도서 관리 메뉴 선택]
                 1. 도서 정보 등록
                 2. 도서 정보 수정
                 3. 도서 목록 조회 및 검색
                 0. 뒤로 가기
                """;
        System.out.println(bookmenu);
        String choice = sc.next();
        switch (choice) {
            case "1" :
                System.out.println("도서 정보 등록");
                break;
            case "2" :
                System.out.println("도서 정보 수정");
                break;
            case "3" :
                System.out.println("도서 목록 조회 및 검색");
                break;
            case "0" : return;
            default:
                System.out.println("❌잘못된 입력.. 다시 입력해주세요.❌");
        }
    }
}