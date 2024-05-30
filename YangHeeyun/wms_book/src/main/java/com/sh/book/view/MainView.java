package com.sh.book.view;

import java.util.Scanner;

public class MainView {
    private Scanner sc = new Scanner(System.in);

    private BookView bookView = new BookView();
    private OrderView orderView =  new OrderView();
    private InventoryView inventoryMenu = new InventoryView();

    public void mainMenu() {
        String menu = """
            ======================
            1. 도서 관리
            2. 재고 관리
            3. 주문 관리
            0. 종료
            ======================
            입력 : """;

        while(true){
            System.out.println("[로그인 성공]");
            System.out.print(menu);
            String choice = sc.next();
            switch(choice){
                case "1" : bookView.bookMenu(); break;
                case "2" : inventoryMenu.inventoryMenu(); break;
                case "3" : orderView.orderMenu(); break;
                case "0" : return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
