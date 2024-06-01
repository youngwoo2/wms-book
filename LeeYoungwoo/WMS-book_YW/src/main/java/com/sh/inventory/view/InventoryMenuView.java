package com.sh.inventory.view;

import com.sh.login.view.MainMenuView;

import java.util.Scanner;

public class InventoryMenuView {
    private Scanner sc = new Scanner(System.in);
    public void inventoryMenu(){
        String inventoryMenu = """
                ===================================================
                📦 재고관리 메뉴 📦
                ===================================================
                1. 재고현황 조회
                2. 도서 입고 처리
                3. 도서 출고 처리
                4. 창고간 재고 이동 처리
                0. 돌아가기
                ===================================================
                입력 : """;
        while (true) {
            System.out.println(inventoryMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" : break;
                case "2" : break;
                case "3" : break;
                case "4" : break;
                case "0" : new MainMenuView().mainMenu(); return;
                default :
                    System.out.println("잘못 입력하셨습니다...");
            }
        }
    }
}
