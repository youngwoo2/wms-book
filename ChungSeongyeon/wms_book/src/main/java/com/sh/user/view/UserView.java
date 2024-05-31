package com.sh.user.view;

import com.sh.book.view.BookView;
import com.sh.inventory.view.InventoryView;
import com.sh.order.view.OrderView;

import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);

    public void loginMenu(){
        System.out.println("✅로그인 해주세요✅");
        System.out.print("> 아이디 입력 : ");
        String id = sc.next(); // next()로 아이디 입력
        sc.nextLine(); // 남아있는 개행 문자 제거
        System.out.print("> 비밀번호 입력 : ");
        String password = sc.nextLine(); // nextLine()로 비밀번호 입력
        System.out.println("⭕로그인 성공⭕");

            String mainMenu = """
                [전체 메뉴 선택]
                 1. 도서 관리
                 2. 재고 관리
                 3. 주문 관리
                 0. 종료
                """;
        while(true) {
            System.out.println(mainMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    BookView bookView = new BookView();
                    bookView.bookMenu();
                    break;
                case "2" :
                    InventoryView inventoryView = new InventoryView();
                    inventoryView.inventoryMenu();
                    break;
                case "3" :
                    OrderView orderView = new OrderView();
                    orderView.orderMenu();
                    break;
                case "0" : return;
                default : break;
            }
        }
    }
}
