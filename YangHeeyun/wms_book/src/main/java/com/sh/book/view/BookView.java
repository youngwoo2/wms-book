package com.sh.book.view;

import com.sh.book.controller.BookController;
import com.sh.book.model.dto.BookDto;

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
            int choice = sc.nextInt();
            int bookId = 0;
            String title = null;
            String author = null;
            int price = 0;
            String category = null;
            switch (choice) {
                case 1:
                    System.out.print("> 도서ID 입력 : ");
                    bookId = sc.nextInt();
                    break;
                case 2:
                    System.out.print("> 도서명 입력 : ");
                    title = sc.next();
                    break;
                case 3:
                    System.out.print("> 저자 입력 : ");
                    author = sc.next();
                    break;
                case 4:
                    System.out.print("> 가격 입력 : ");
                    price = sc.nextInt();
                    break;
                case 5:
                    System.out.print("> 카테고리 입력 : ");
                    category = sc.next();
                    break;
                default:
                    System.out.println("❎잘못된 입력입니다❎");
            }

            List<BookDto> bookList = bookController.findBookByChoice(bookId, title, author, price, category);
            for (BookDto bookDto : bookList) {
                if(bookDto != null)
                    System.out.println(bookDto);
                else
                    System.out.println("조건과 일치하는 도서가 없습니다");
            }
        }
    }
}
