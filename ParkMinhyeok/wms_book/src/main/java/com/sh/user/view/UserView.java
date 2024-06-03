package com.sh.user.view;

import com.sh.book.view.BookView;
import com.sh.inventory.view.InventoryView;
import com.sh.order.view.OrderView;
import com.sh.user.controller.UserController;
import com.sh.user.model.dto.UserDto;

import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);
    private UserController userController = new UserController();

    public void loginMenu() {
        /**
         * Todo
         * loginCheck()
         * siguUp()
         */
        String menu =
                """
                =================
                1. 로그인
                2. 회원가입
                0. 종료
                """;
        try {
            while (true) {
                System.out.println(menu);
                String choice = sc.next();
                switch (choice) {
                    case "1" :
                        loginCheck();
                        break;
                    case "2" :
                        System.out.println("회원가입");
//                        sighUp();
                        break;
                    case "0" :
                        return;
                    default:
                        System.out.println("잘못된 입력입니다.");
                }
            }
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
        }
    }

    private void loginCheck() {
        System.out.println(
                """
                        =================
                        로그인
                        =================
                        """);
        System.out.println("ID 입력 : ");
        String id = sc.next();
        System.out.println("Password 입력 : ");
        String password = sc.next();
        System.out.println();

//        UserDto userDto = userController.loginCheck(id, password);
        managementMenu();
    }

    private void managementMenu() {
        String menu = """
                ===========================================
                메뉴를 선택해주세요.
                1. 도서관리
                2. 재고관리
                3. 주문관리
                0. 뒤로가기
                ===========================================
                                                           
                """;
        System.out.println(menu);
        String choice = sc.next();
        switch (choice) {
            case "1":
                BookView bookView = new BookView();
                bookView.bookMenu();
                break;
            case "2":
                InventoryView inventoryView = new InventoryView();
                inventoryView.inventoryMenu();
                break;
            case "3":
                OrderView orderView = new OrderView();
                orderView.orderMenu();
                break;
            case "0":
                return;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }
    private UserDto sighUp() {
        // Todo
        return null;
    }
}
