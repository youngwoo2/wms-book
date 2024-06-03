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
                     0. 뒤로가기
                =====================
                입력 : """;
        while (true) {
            System.out.print(menu);
            String choice = sc.next();
            switch (choice) {
                case "1" : break;
                case "2" : break;
                case "3" :
                    displayBookMenu();
                    break;
                case "0" : return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    // 도서 조회 및 검색
    private void displayBookMenu() {
        String menu = """
                    [도서 조회/검색]
                =====================
                1. 전체 도서 조회
                2. 도서 아이디로 조회
                3. 도서 조건 검색
                0. 뒤로 가기
                =====================
                입력 : """;
        while (true) {
            System.out.print(menu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    bookController.findAllBooks();
                    break;
                case "2" :
                    inputBookId();
                    break;
                case "3" :
                    inputFilterBook();
                    break;
                case "4" : return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    // 도서 조건검색
    private void inputFilterBook() {
        String menu = """
                    [도서 조건검색]
                =====================
                    1. 도서명 검색
                    2. 저자 검색
                    3. 카테고리 검색
                    4. 가격 검색
                    0. 뒤로 가기
                =====================
                입력 : """;
        System.out.print(menu);
        String choice = sc.next();
        switch (choice) {
            case "1" -> inputTitle();
            case "2" -> inputAuthor();
            case "3" -> inputCategory();
            case "4" -> inputPrice();
            default -> {
                return;
            }
        };
    }

    private void inputPrice() {
        System.out.println("가격 : ");
        int price = sc.nextInt();
        sc.nextLine();
        bookController.findByPrice(price);
    }

    private void inputCategory() {
        System.out.println("카테고리 : ");
        String category = sc.next();
        sc.nextLine();
        bookController.findByCategory(category);
    }

    private void inputAuthor() {
        System.out.print("저자 : ");
        String author = sc.next();
        sc.nextLine();
        bookController.findByAuthor(author);
    }

    private void inputTitle() {
        System.out.print("제목 : ");
        String title = sc.next();
        sc.nextLine();
        bookController.findByTitle(title);
    }

    private int inputBookId() {
        System.out.print("도서 아이디 조회 : ");
        int bookId = sc.nextInt();
        bookController.findByBookId(bookId);
        return sc.nextInt();
    }

}
