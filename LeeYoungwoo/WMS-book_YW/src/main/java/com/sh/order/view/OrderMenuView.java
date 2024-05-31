package com.sh.order.view;

import com.sh.login.view.MainMenuView;

import java.util.Scanner;

public class OrderMenuView {
    private Scanner sc = new Scanner(System.in);
    public void orderMenu(){
        String orderMenu = """
                ===================================================
                📄 주문관리 메뉴 📄
                ===================================================
                1. 고객 주문 생성
                2. 주문 상태 관리
                0. 돌아가기
                ===================================================
                입력 : """;
        while (true) {
            System.out.println(orderMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" : break;
                case "2" : break;
                case "0" : new MainMenuView().mainMenu(); return;
                default :
                    System.out.println("잘못 입력하셨습니다...");
            }
        }
    }
}
