package com.sh.order.view;

import com.sh.order.controller.OrderController;
import com.sh.order.model.dto.OrderDto;
import com.sh.order.model.dto.OrderItemDto;
import com.sh.order.model.dto.OrderableStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderView {
    private Scanner sc = new Scanner(System.in);
    private OrderController orderController = new OrderController();

    public void orderMenu() {
        String orderMenu = """
                [주문 관리 메뉴 선택]
                1. 주문 생성
                2. 주문 처리
                0. 뒤로 가기
                """;
        while (true) {
            System.out.println(orderMenu);
            String choice = sc.next();
            switch (choice) {
                case "1":
                    createOrder();
                    break;
                case "2":
                    System.out.println("주문 처리");
                    break;
                case "0":
                    return;
                default:
                    System.out.println("❌잘못된 입력.. 다시 입력해주세요.❌");
            }
        }
    }

    private void createOrder() {
        System.out.println("--[주문 생성]--");
        System.out.print("> 주문자 이름: ");
        sc.nextLine(); // Consume newline
        String ordererName = sc.nextLine();
        System.out.print("> 배송지: ");
        String ordererAddress = sc.nextLine();

        List<OrderItemDto> orderItems = new ArrayList<>();

        while (true) {
            System.out.print("> 도서 번호: ");
            int bookId = sc.nextInt();
            System.out.print("> 수량: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // Consume newline

            orderItems.add(new OrderItemDto(0, 0, bookId, quantity));

            System.out.print("> 더 추가하시겠습니까? (y/n): ");
            String choice = sc.nextLine();
            if ("n".equalsIgnoreCase(choice)) {
                break;
            }
        }

        OrderDto order = new OrderDto(0, ordererName, ordererAddress, null, OrderableStatus.주문확인중, orderItems);
        orderController.registerOrder(order);

        System.out.println("✅ 주문이 등록되었습니다.");
    }
}
