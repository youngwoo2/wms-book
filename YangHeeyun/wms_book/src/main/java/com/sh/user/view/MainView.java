package com.sh.user.view;

import com.sh.book.view.BookView;
//import com.sh.common.AuthManager;
import com.sh.inventory.view.InventoryView;
import com.sh.order.view.OrderView;

import java.util.Scanner;

public class MainView {
    private Scanner sc = new Scanner(System.in);
    private BookView bookView = new BookView();
    private OrderView orderView =  new OrderView();
    private InventoryView inventoryMenu = new InventoryView();

    // 메인 메뉴
    public void mainMenu() {
        String menu = """
            ======================
            <메인메뉴>
            1. 도서 관리
            2. 재고 관리
            3. 주문 관리
            0. 뒤로가기
            ======================
            입력 : """;

        while(true){
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
