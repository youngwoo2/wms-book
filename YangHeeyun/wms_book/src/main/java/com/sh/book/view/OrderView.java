package com.sh.book.view;

import java.util.Scanner;

public class OrderView {
    private Scanner sc = new Scanner(System.in);
//    private MainView mainview = new MainView();

    public void orderMenu(){
        String menu = """
        =====================
        1. 주문 생성
        2. 주문 처리
        0. 뒤로가기
        =====================
        입력 : """;

        while(true){
            System.out.println(menu);
            String choice = sc.next();
            switch(choice){
                case "1" :  createOrder(); break;
                case "2" :  break;
                case "0" :  return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    private void createOrder() {
        System.out.println("주문 생성중...");
    }
}
