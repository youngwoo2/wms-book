package com.sh.inventory.view;

import java.util.Scanner;

public class InventoryView {
    Scanner sc = new Scanner(System.in);
    public void inventoryMenu() {
        String inventoryMenu = """
                📦📦재고 관리 메뉴를 선택해주세요📦📦
                        1. 재고 조회
                        2. 재고 입고
                        3. 재고 출고
                        4. 재고 이동
                """;
        System.out.println(inventoryMenu);
        String choice = sc.next();
        switch (choice) {
            case "1" : break;
            case "2" : break;
            case "3" : break;
            case "4" : break;
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요😥");

    }
    }
}
