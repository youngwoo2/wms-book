package com.sh.user.view;

import com.sh.book.view.BookView;
import com.sh.common.AuthManager;
import com.sh.inventory.view.InventoryView;
import com.sh.order.view.OrderView;
import com.sh.user.controller.UserController;

import java.util.Scanner;

public class MainView {
    private Scanner sc = new Scanner(System.in);
    private UserController userController = new UserController();
    private BookView bookView = new BookView();
    private OrderView orderView =  new OrderView();
    private InventoryView inventoryMenu = new InventoryView();

    public void loginMenu(){
        System.out.println("🔥도서 창고 관리 프로그램 시작🔥");
        String menu = """
            ======================
            <로그인 메뉴>
            1. 로그인
            2. 회원가입
            0. 종료
            ======================
            입력 : """;

        while(true){
            System.out.print(menu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    System.out.print("> ID 입력 : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("> Password 입력 : ");
                    String password = sc.next();
                    userController.login(id, password); // 로그인처리
                    // 로그인에 성공한 경우, 메인메뉴를 시작한다.
                    if(AuthManager.islogin()){
                        mainMenu();
                        break; // logout하면 이리로 와서 break해야 로그인 메뉴를 다시 보여주나?
                    }else //
                        break;
                case "2" :
                    System.out.println("2번회원가입 중..."); //왜 main에서 로그아웃하면 이게 출력?
                    // signUp();
                case "0" : return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }


    // 메인 메뉴
    public void mainMenu() {
        String menu = """
            ======================
            <메인 메뉴>
            1. 도서 관리
            2. 재고 관리
            3. 주문 관리
            0. 로그아웃
            ======================
            입력 : """;

        while(true){
            System.out.print(menu);
            String choice = sc.next();
            switch(choice){
                case "1" :
                    // 도서 관리
                    bookView.bookMenu(); break;
                case "2" :
                    // 재고 관리
                    inventoryMenu.inventoryMenu(); break;
                case "3" :
                    // 주문 관리
                    orderView.orderMenu(); break;
                case "0" :
                    System.out.println("로그아웃 중...");
                    AuthManager.logout(); // 로그아웃
                    return; // LoginView로 돌아가기
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
