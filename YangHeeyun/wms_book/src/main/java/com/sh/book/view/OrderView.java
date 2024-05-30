package com.sh.book.view;

import com.sh.book.controller.OrderController;

import java.util.Scanner;

public class OrderView {
    private Scanner sc = new Scanner(System.in);
    private OrderController orderController = new OrderController();

    public void orderMenu(){
        String menu = """
        =====================
        주문 관리 메뉴를 선택하세요
        1. 주문 생성
        2. 주문 처리
        0. 뒤로가기
        =====================
        입력 : """;

        while(true){
            System.out.println(menu);
            String choice = sc.next();
            switch(choice){
                case "1" :  orderController.createOrder(); break;
                case "2" :  orderController.statusOrder(); break;
                case "0" :  return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
