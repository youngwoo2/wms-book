package com.sh.account.view;

import com.sh.Inventory.view.InventoryView;
import com.sh.account.controller.AccountController;
import com.sh.account.model.dto.AccountDto;
import com.sh.account.model.dto.Role;
import com.sh.book.view.BookView;
import com.sh.order.view.OrderView;

import java.util.Scanner;

public class AccountView {

    private AccountController accountController = new AccountController();

    private Scanner sc = new Scanner(System.in);
    BookView bookView = new BookView();
    InventoryView inventoryView = new InventoryView();
    OrderView orderView = new OrderView();
    private AccountDto accountDto = null; // accountDto 객체 선언 이렇게 차이가 뭐지?


    public void loginView() {
        // 사용자는 첫 로그인화면에서 id/password를 입력하고 로그인할 수 있습니다.
        int userId ;
        String password;
        // Role이 enum타입이라서 매니저일때만 로그인 가능
        do {
            System.out.println("🔥도서재고관리에 오신걸 환영합니다🔥");
            System.out.println("로그인 해주세요");
            System.out.print("아이디 입력 :");
            userId = sc.nextInt();
            sc.nextLine(); // 개행버리기
            System.out.print("비밀번호 입력 :");
            password = sc.nextLine();
            accountDto = accountController.login(userId,password);


//            if(accountDto == null) {
//                System.out.println("등록된 회원정보가 없습니다.");
//            } else if (accountDto.getRole() != Role.manager) {
//                System.out.println("관리자만 이용가능 합니다.");
//
//            }else {
//                System.out.println(accountDto.getUserName() + "님 환영합니다." );
//            }

        } while ((accountDto == null || accountDto.getRole() != Role.manager));

        // 로그인 성공시 메인메뉴 호출
        mainMenuView();

    }



    public void mainMenuView() {


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

}
