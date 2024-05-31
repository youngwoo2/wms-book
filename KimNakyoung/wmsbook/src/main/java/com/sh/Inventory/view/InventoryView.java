package com.sh.Inventory.view;

import com.sh.Inventory.controller.InventoryController;

import java.util.Scanner;

// 1. 재고 조회 실시간 재고 현황 조회 (도서별, 창고별 재고량)
// 2. 재고 입고 (새로운 도서 입고 처리 (입고량, 입고 날짜, 공급업체 등 정보 입력))
// 3. 재고 출고 (출고 처리 (출고량, 출고 날짜, 출고 목적 등 정보 입력))
// 4. 재고 이동 (창고 간 재고 이동 처리 (이동량, 이동 날짜 등 정보 입력))
public class InventoryView {
    private InventoryController inventoryController = new InventoryController();

    private Scanner sc = new Scanner(System.in);

    public void mainInventoryMenu() {
        String InventoryMenu = """
                =====================
                1.재고 조회
                2.재고 입고
                3.재고 출고
                4.재고 이동
                0.종료
                =====================
                입력:""";
        System.out.println("재고관리를 선택하셨습니다.");
        while (true) {
            System.out.print(InventoryMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    System.out.println("재고 조회합니다.");
                    break;
                case "2" :
                    System.out.println("재고 입고합니다.");
                    break;
                case "3" :
                    System.out.println("재고 출고합니다.");
                    break;
                case "4" :
                    System.out.println("재고 이동합니다.");
                    break;
                case "0" :
                    return;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }
}
