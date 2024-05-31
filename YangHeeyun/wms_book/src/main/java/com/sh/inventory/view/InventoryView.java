package com.sh.inventory.view;

import com.sh.inventory.controller.InventoryController;

import java.util.Scanner;

public class InventoryView {
    private Scanner sc = new Scanner(System.in);
    InventoryController inventoryController = new InventoryController();

    public void inventoryMenu(){
        String menu = """
        =====================
        <재고 관리 메뉴 선택>
        1. 재고 조회
        2. 재고 입고
        3. 재고 출고
        4. 재고 이동
        0. 뒤로가기
        =====================
        입력 : """;

        while(true){
            System.out.println(menu);
            String choice = sc.next();
            switch(choice){
                case "1" :  inventoryController.findInventory(); break;
                case "2" :  inventoryController.inboundInventory(); break;
                case "3" :  inventoryController.outboundInventory(); break;
                case "4" :  inventoryController.moveInventory(); ;break;
                case "0" :  return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
