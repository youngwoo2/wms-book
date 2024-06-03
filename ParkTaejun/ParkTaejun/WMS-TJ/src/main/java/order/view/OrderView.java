package order.view;

import java.util.Scanner;

public class OrderView {


    public void orderManageView() {
        Scanner scanner = new Scanner(System.in);


        String orderMenu = """
                ===================================================
                주문 관리 시스템 입니다. 원하시는 메뉴를 선택해주세요.
                1. 주문 생성
                2. 주문 처리
                0. 뒤로 가기
                ===================================================
                 입력:""";

        while(true){
            System.out.println(orderMenu);
            String choice = scanner.next();
            switch (choice) {
                // 주문생성
                case "1":
                    break;


                //주문 처리
                case "2":
                    break;

                //뒤로 가기
                case "0":
                    return;


                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }
        }

    }
}
