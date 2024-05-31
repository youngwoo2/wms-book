package menu.view;


import book.view.BookView;
import inventory.view.InventoryView;
import order.view.OrderView;

import java.util.Scanner;

public class UserView {
    public void login() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("====로그인이 필요합니다.====");
        System.out.println(">> 아이디 입력");
        String userId = scanner.next();
        System.out.println(">> 비밀번호 입력");
        String password = scanner.next();
        System.out.println("!! 로그인 성공 !!");
        mainMenu();

    }

    public void mainMenu(){
        OrderView orderView = new OrderView();
        InventoryView inventoryView = new InventoryView();
        BookView bookView = new BookView();
        Scanner scanner = new Scanner(System.in);


        String mainMenu = """
                                 🤗🤗🤗
                        ==========================
                        어떤 관리를 진행 하시겠습니까?  
                        1. 재고 관리  
                        2. 도서 관리  
                        3. 주문 관리
                        0. 종료하기
                        ==========================
                        입력 : """;

        System.out.println(mainMenu);
        String choice = scanner.next();
        while (true){
            switch (choice){

                // 재고 관리
                case "1":
                    inventoryView.inventoryManageView();
                    break;

                // 도서 관리
                case "2":
                    bookView.bookManageView();
                    break;

                // 주문 관리
                case "3":
                    orderView.orderManageView();
                    break;

                // 종료하기
                case "0":
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해 주세요");
            }
        }

    }
}
