package com.sh.inventory.view;

import java.util.Scanner;

public class InventoryView {
    Scanner sc = new Scanner(System.in);
    public void inventoryMenu() {
        String menu = """
                ===========================================
                재고 관리 메뉴
                1. 재고 조회
                2. 재고 입고
                3. 재고 출고
                4. 재고 이동
                0. 뒤로가기
                ===========================================
                """;
        System.out.println(menu);
        String choice = sc.next();
        switch (choice) {
            case "1" :
                System.out.println("재고 조회");
                break;
            case "2" :
                System.out.println("재고 입고");
                break;
            case "3" :
                System.out.println("재고 출고");
                break;
            case "4" :
                System.out.println("재고 이동");
                break;
            case "0" :
                return;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
