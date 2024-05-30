package com.sh.book.view;

import java.util.Scanner;

public class OrderView {
    private Scanner sc = new Scanner(System.in);
    private MainView mainview = new MainView();

    public void bookMenu(){
        String menu = """
        =====================
        1. 주문 생성
        2. 주문 처리
        =====================
        입력 : """;

        while(true){
            System.out.println(menu);
            String choice = sc.next();
            switch(choice){
                case "1" :  break;
                case "2" :  break;
                case "0" :  return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
