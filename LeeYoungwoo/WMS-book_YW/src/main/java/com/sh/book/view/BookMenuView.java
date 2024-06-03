package com.sh.book.view;

import com.sh.book.controller.BookController;
import com.sh.common.SearchCriteria;
import com.sh.user.view.MainMenuView;

import java.util.Scanner;

public class BookMenuView {
    private Scanner sc = new Scanner(System.in);
    private BookController bookController = new BookController();

    public void bookMenu(){
        String bookMenu = """
                ===================================================
                📖 도서관리 메뉴 📖
                ===================================================
                1. 도서 정보 등록
                2. 도서 정보 수정
                3. 도서 전체 목록 조회
                4. 도서 아이디별 목록 조회
                5. 도서 검색
                0. 돌아가기
                ===================================================
                입력 : """;
        while (true) {
            System.out.println(bookMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" : break;
                case "2" : break;
                case "3" : bookController.findAll(); break;
                case "4" : bookController.findByBookId(inputBookId()); break;
                case "5" : searchMenu(); break;
                case "0" : return;
                default :
                    System.out.println("잘못 입력하셨습니다...");
            }
        }
    }

    public void searchMenu() {
        String searchMenu = """
                ===================================================
                📖 도서 검색 메뉴 📖
                ===================================================
                1. 도서명 검색
                2. 저자 검색
                3. 카테고리 검색
                4. 가격 검색
                0. 돌아가기
                ===================================================
                입력 : """;
        while (true) {
            System.out.println(searchMenu);
            String choice = sc.next();
            SearchCriteria searchCriteria = switch (choice) {
                case "1" -> inputTitle();
                case "2" -> inputAuthor();
                case "3" -> inputCategory();
                case "4" -> inputPriceRange();
                default -> null;
            };
            if (searchCriteria != null) {
                bookController.searchMenu(searchCriteria);
            } else if (choice.equals("0")) {
                return;
            } else {
                System.out.println("> 잘못 입력하셨습니다.");
            }
        }
    }

    private SearchCriteria bookMenuReturn() {
        return new SearchCriteria("return", null, null, null);
    }

    private SearchCriteria inputPriceRange() {
        System.out.println("검색할 가격 범위 입력");
        System.out.println("최소값 입력 : ");
        int start = sc.nextInt();
        System.out.println("최대값 입력 : ");
        int end = sc.nextInt();
        return new SearchCriteria("price", null, start, end);
    }

    private SearchCriteria inputCategory() {
        System.out.println("검색할 카테고리 입력 : ");
        return new SearchCriteria("category", sc.next(), null, null);
    }

    private SearchCriteria inputAuthor() {
        System.out.println("검색할 저자명 입력 : ");
        return new SearchCriteria("author", sc.next(), null, null);
    }

    private SearchCriteria inputTitle() {
        System.out.println("검색할 도서명 : ");
        return new SearchCriteria("title", sc.next(), null, null);
    }

    private int inputBookId() {
        System.out.print("조회할 book_id : ");
        return sc.nextInt();
    }
}
