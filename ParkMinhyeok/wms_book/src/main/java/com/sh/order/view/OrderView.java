package com.sh.order.view;

import java.util.Scanner;

public class OrderView {
    Scanner sc = new Scanner(System.in);
    public void orderMenu() {
        String menu =
                """
                ===========================================
                메뉴를 선택해주세요.
                1. 주문 생성
                2. 주문 처리
                0. 뒤로가기
                ===========================================
                """;
        System.out.println(menu);
        String choice = sc.next();
        switch (choice) {
            case "1" :
                System.out.println("주문 생성");
                break;
            case "2" :
                System.out.println("주문 처리");
                break;
            case "0" :
                return;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
