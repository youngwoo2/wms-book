package com.sh.user.view;

import com.sh.book.view.BookView;
import com.sh.inventory.view.InventoryView;
import com.sh.order.view.OrderView;

import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);

    public void loginMenu() {
        /**
         * Todo
         * loginCheck()
         * siguUp()
         */
        while (true) {
            String menu =
                    """
                            ===========================================
                            메뉴를 선택해주세요.
                            1. 도서관리
                            2. 재고관리
                            3. 주문관리
                            0. 프로그램 종료
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
                case "3":
                    OrderView orderView = new OrderView();
                    orderView.orderMenu();
                case "0":
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
