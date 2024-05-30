package com.sh.user.view;


import com.sh.book.view.BookView;
import com.sh.inventory.view.InventoryView;
import com.sh.order.view.OrderView;

import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);
    public void loginMenu(){
        System.out.println("🎈🎈로그인을 해주세요🎈🎈");
        System.out.print("▶ ID 입력해주세요 : ");
        System.out.print("▶ Password 입력해주세요 : ");
        String id = sc.next();
        String password = sc.next();
        System.out.println("!⛳⛳로그인 성공!⛳⛳");

        while(true) {
            String mainMenu = """
                🥨메뉴를 선택해주세요🥨
                    1. 도서 관리
                    2. 재고 관리
                    3. 주문 관리
                """;
            System.out.println(mainMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" :  // 1. 도서관리
                    BookView bookView = new BookView();;
                    bookView.bookMenu();
                    break;
                case "2" : // 2. 재고관리
                    InventoryView inventoryView = new InventoryView();
                    inventoryView.inventoryMenu();
                    break;
                case "3" : // 3. 주문관리
                    OrderView orderView = new OrderView();
                    orderView.orderMenu();
                    break;
                default : break;
            }
        }
        







    } 
}
