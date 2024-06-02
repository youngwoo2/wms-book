package com.sh.book.view;

import com.sh.book.controller.BookController;

import java.util.Scanner;

// 1. (도서 등록) 도서 정보 등록 2. (도서 수정)도서 정보 수정 (도서 코드, 제목, 저자, 설명, 가격, 카테고리 등)
// 3. (도서조회) 도서 목록 조회 4. (도서검색) 도서 검색 (도서명, 저자, 카테고리, 가격 등 기준)"
public class BookView {
    private BookController bookController = new BookController();

    private Scanner sc = new Scanner(System.in);

    public void mainBookMenu() {
        String bookMenu = """
                =====================
                1.도서 등록
                2.도서 정보 수정
                3.도서 조회
                4.도서 검색
                0.종료
                =====================
                입력:""";
        System.out.println("도서관리를 선택하셨습니다.");
        while (true) {
            System.out.print(bookMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    System.out.println("도서 등록합니다.");
                    break;
                case "2" :
                    System.out.println("도서정보 수정합니다.");
                    break;
                case "3" :
                    System.out.println("도서 조회합니다.");
                    break;
                case "4" :
                    System.out.println("도서 검색합니다.");
                    break;
                case "0" :
                    return;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }

}
