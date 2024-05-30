package com.sh.book.view;

import java.util.Scanner;

public class InventoryView {
    private Scanner sc = new Scanner(System.in);
    private MainView mainView = new MainView();

    public void bookMenu(){
        String menu = """
        =====================
        1. 재고 조회
        2. 재고 입고
        3. 재고 출고
        4. 재고 이동
        =====================
        입력 : """;

        while(true){
            System.out.println(menu);
            String choice = sc.next();
            switch(choice){
                case "1" :  break;
                case "2" :  break;
                case "3" :  break;
                case "4" :  break;
                case "0" :  return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
