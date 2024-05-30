package com.sh.account.view;

import com.sh.Inventory.view.InventoryView;
import com.sh.account.controller.AccountController;
import com.sh.book.view.BookView;
import com.sh.order.view.OrderView;

import java.util.Scanner;

public class AccountView {

    private AccountController accountController = new AccountController();

    private Scanner sc = new Scanner(System.in);
    BookView bookView = new BookView();
    InventoryView inventoryView = new InventoryView();
    OrderView orderView = new OrderView();

    public void mainAccount() {
        System.out.println("🔥도서재고관리에 오신걸 환영합니다🔥");
        login(); // 로그인
        String menu = """
                =====================
                1.도서관리
                2.재고관리
                3.주문관리
                0.종료
                =====================
                입력 : """;

        while(true) {
            System.out.println("원하시는 기능을 선택해주세요");
            System.out.print(menu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    // 도서관리 view 호출
                    bookView.mainBookMenu();
                    break;
                case "2" :
                    // 재고관리 view 호출
                    inventoryView.mainInventoryMenu();
                    break;
                case "3" :
                    // 주문관리 view 호출
                    orderView.mainOrderMenu();
                    break;
                case "0" :
                    System.out.println("프로그램 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        }

    }

    public void login() {
        System.out.println("로그인 해주세요");
        System.out.print("아이디 입력 :");
        String id = sc.next();
        sc.nextLine(); // 개행버리기
        System.out.print("비밀번호 입력 :");
        String password = sc.nextLine();
        System.out.println("로그인 성공!");
    }
}
