package com.sh.user.view;


import com.sh.book.view.BookView;
import com.sh.inventory.view.InventoryView;
import com.sh.order.view.OrderView;

import java.util.Scanner;

public class UserView {
    private Scanner sc = new Scanner(System.in);
    private BookView bookView = new BookView();
    private InventoryView inventoryView = new InventoryView();
    private OrderView orderView = new OrderView();


    public void loginMenu(){
        System.out.println("🎈🎈로그인을 해주세요🎈🎈");
        System.out.println("========================");
        System.out.print("▶ ID 입력해주세요 : ");
        String id = sc.next();
        System.out.print("▶ Password 입력해주세요 : ");
        String password = sc.next();
        System.out.println("========================");
        System.out.println("    ✅로그인 성공!✅");
        System.out.println("========================");

        while(true) {
            String mainMenu = """
                 ✅메뉴를 선택해주세요✅
                    1. 도서 관리
                    2. 재고 관리
                    3. 주문 관리
                    4. 프로그램 종료
                ======================
                """;
            System.out.println(mainMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" :  // 1. 도서관리
                    bookView.bookMenu();
                    break;
                case "2" : // 2. 재고관리
                    inventoryView.inventoryMenu();
                    break;
                case "3" : // 3. 주문관리
                    orderView.orderMenu();
                    break;
                case "4" :
                    return;
                default :
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요😥");
                break;
            }
        }
        







    } 
}
