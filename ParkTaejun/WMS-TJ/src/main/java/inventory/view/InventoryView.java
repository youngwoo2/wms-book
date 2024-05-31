package inventory.view;

import menu.view.UserView;

import java.util.Scanner;

public class InventoryView {
     Scanner scanner = new Scanner(System.in);
     UserView userView = new UserView();
    public void inventoryManageView() {

        String inventoryMenu = """
                        =============================================
                        재고 관리 시스템 입니다. 원하시는 메뉴를 선택해 주세요.
                        1. 재고 조회
                        2. 재고 입고
                        3. 재고 출고
                        4. 재고 이동
                        0. 뒤로가기
                        ==============================================
                        입력:""";

                System.out.println(inventoryMenu);
                String choice = scanner.next();
                    switch (choice){
                        // 재고 조회
                        case "1":
                            break;

                        // 재고 입고
                        case "2":
                            break;

                        // 재고 출고
                        case "3":
                            break;

                        // 재고 이동
                        case "4":
                            break;

                        // 뒤로 가기
                        case "0":
                            userView.mainMenu();
                            break;

                        default:
                            System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
                            break;
                    }

                }
    }
