package book.view;

import menu.view.UserView;

import java.util.Scanner;

public class BookView {
     Scanner scanner = new Scanner(System.in);
     UserView userView = new UserView();
    public void bookManageView() {

        String bookMenu ="""
                        =========================================
                        도서 관리 입니다. 원하시는 메뉴를 선택해주세요
                        1. 도서 등록 및 수정
                        2. 도서 조회
                        0. 뒤로 가기
                        =========================================
                        입력:""";
                System.out.println(bookMenu);
                String choice = scanner.next();
                while (true) {
                    switch (choice) {

                        // 도서 등록 및 수정
                        case "1":
                            break;

                        // 도서 조회
                        case "2":
                            break;

                        // 뒤로 가기
                        case "0":
                            userView.mainMenu();

                        default:
                            System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");


                    }
                }


    }
}
