package com.sh.book.view;

import com.sh.book.controller.BookController;
import com.sh.book.model.dto.BookDto;
import com.sh.common.SearchCriteria;

import java.awt.print.Book;
import java.util.List;
import java.util.Scanner;

public class BookView {

    public static void main(String[] args) {
        BookView bookView = new BookView();
        bookView.bookMenu();
    }

    private Scanner sc = new Scanner(System.in);
    BookController bookController = new BookController();

    public void bookMenu(){
        String menu = """
        =====================
        <도서 관리 메뉴 선택>
        1. 도서 정보 등록
        2. 도서 정보 수정
        3. 도서 전체 목록 조회
        4. 도서 검색
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
                case "4" : displayBookMenu(); break;
                case "0" : return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
            System.out.println();
        }
    }

    private void displayBookMenu() {
        String menu = """
            🎲 도서 검색 기준을 선택하세요 🎲
            1. 도서ID
            2. 도서명
            3. 저자
            4. 가격
            5. 카테고리
            > 입력 : """;

        while(true) {
            System.out.print(menu);
            String choice = sc.next();
            SearchCriteria searchCriteria  = switch (choice) {
                case "1" -> inputBookId();
                case "2" -> inputTitle();
                case "3" -> inputAuthor();
                case "4" -> inputPrice();
                case "5" -> inputCategory();
                default -> null;
            };
            if(searchCriteria != null)
                bookController.searchBook(searchCriteria);
            else
                System.out.println("❎잘못 입력하셨습니다❎");
        }
    }

    private SearchCriteria inputBookId() {
        System.out.print("> 검색할 도서ID 입력 : ");
        return new SearchCriteria("bookId",sc.nextInt());
    }

    private SearchCriteria inputTitle() {
        System.out.print("> 검색할 도서명 입력 : ");
        return new SearchCriteria("title",sc.next());
    }

    private SearchCriteria inputAuthor() {
        System.out.print("> 검색할 저자 입력 : ");
        return new SearchCriteria("author",sc.next());
    }

    private SearchCriteria inputPrice() {
        System.out.print("> 검색할 가격 입력 : ");
        return new SearchCriteria("price",sc.nextInt());
    }

    private SearchCriteria inputCategory() {
        System.out.print("> 검색할 카테고리 입력 : ");
        return new SearchCriteria("category",sc.next());
    }
}
