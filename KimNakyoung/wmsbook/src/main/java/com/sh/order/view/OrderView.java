package com.sh.order.view;
// 1. 주문 생성 (고객 주문 생성 (주문 번호, 고객 정보, 주문 도서, 수량, 배송지 정보 등))
// 2. 주문 처리 ("주문 상태 관리 (주문 접수, 처리 중, 배송 중, 완료 등)")

//1. 임의의 고객주문서가 있다고 가정하고, 이를 토대로 도서관리자는 도서관리앱에 주문을 등록합니다.
//2. 하나의 주문에는 여러종류의 책을 포함할 수 있으므로, tbl_order 테이블과 tbl_order_item테이블의 관계를 고려해야 합니다.
//3. 주문 등록시에는 한건의 tbl_order 등록 쿼리와 한건이상의 tbl_order_item 등록쿼리를 함께 트랜잭션처리해야 합니다.
//4. 다음 샘플 도서주문서를 등록할 수 있도록 있도록 합니다.
import com.sh.order.controller.OrderController;

import java.util.Scanner;

public class OrderView {
    private OrderController orderController = new OrderController();

    private Scanner sc = new Scanner(System.in);

    public void mainOrderMenu() {
        String orderMenu = """
                =====================
                1.주문 생성
                2.주문 처리
                0.종료
                =====================
                입력 : """;
        System.out.println("주문관리를 선택하셨습니다.");
        while (true) {
            System.out.print(orderMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    System.out.println("주문 생성합니다.");
                    break;
                case "2" :
                    System.out.println("주문 처리합니다.");
                    break;
                case "0" :
                    return;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }

}
