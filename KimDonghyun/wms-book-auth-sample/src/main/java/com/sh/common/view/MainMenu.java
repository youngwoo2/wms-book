package com.sh.common.view;

import com.sh.common.AuthManager;
import com.sh.user.controller.UserController;

import java.util.Scanner;

public class MainMenu {
    private Scanner sc = new Scanner(System.in);
    private UserController userController = new UserController();

    /**
     * 앱의 주요기능을 이용하기전 제공 메뉴
     */
    public void landingMenu() {
        String menu = """
                1.로그인 2.회원가입 0.종료
                ✏️ """;
        while(true){
            System.out.print(menu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    System.out.print("회원번호 : ✏️");
                    int id = sc.nextInt();
                    System.out.print("비밀번호 : ✏️");
                    String password = sc.next();
                    userController.login(id, password); // 로그인처리
                    // 로그인에 성공한 경우, 메인메뉴를 시작한다.
                    if(AuthManager.islogin())
                        mainMenu();
                case "2" :
                    break;
                case "0" :
                    System.out.println("🗣️ 앱을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 누르셨습니다.");
            }
        }
    }

    public void mainMenu() {
        String menu = """
            1.도서관리 2.재고관리 3.주문관리 0.로그아웃
            ✏️ """;
        while(true) {
            System.out.print(menu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    // 도서관리 시작
                    break;
                case "2" :
                    // 재고관리 시작
                    break;
                case "3" :
                    // 주문관리 시작
                    break;
                case "0" :
                    // 로그아웃 처리
                    System.out.println("🗣️ 로그아웃합니다.");
                    AuthManager.logout();
                    return; // 시작메뉴로 돌아간다.
                default:
                    System.out.println("잘못 누르셨습니다.");
            }
        }
    }

}
