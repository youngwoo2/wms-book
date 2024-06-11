package com.sh.order.view;

import com.sh.order.controller.OrderController;
import com.sh.order.model.OrderStatus;
import com.sh.order.model.dto.OrderDto;
import com.sh.order.model.dto.OrderItemDto;
import com.sh.user.view.MainMenuView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderMenuView {
    private Scanner sc = new Scanner(System.in);
    private OrderController orderController = new OrderController();
    public void orderMenu(){
        String orderMenu = """
                ===================================================
                📄 주문관리 메뉴 📄
                ===================================================
                1. 주문 등록
                2. 주문 상태별 조회
                0. 돌아가기
                ===================================================
                입력 : """;
        while (true) {
            System.out.print(orderMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" : orderController.createOrder(order()); break;
                case "2" : orderController.findByStatus(insertStatus()); break;
                case "0" : return;
                default :
                    System.out.println("잘못 입력하셨습니다...");
            }
        }
    }

    private OrderStatus insertStatus() {
        System.out.print("조회하실 주문 상태를 입력해주세요 : ");
        System.out.println("""
                ------------------------------------------
                1 : 주문확인중
                2 : 배송준비중
                3 : 발송완료
                4 : 배송중
                5 : 배송완료
                6 : 주문취소
                ------------------------------------------
                """);
        String choice = sc.next();

        switch (choice) {
            case "1" : return OrderStatus.주문확인중;
            case "2" : return OrderStatus.배송준비중;
            case "3" : return OrderStatus.발송완료;
            case "4" : return OrderStatus.배송중;
            case "5" : return OrderStatus.배송완료;
            case "6" : return OrderStatus.주문취소;
            default:
                System.out.println("잘못 입력하셨습니다...");
                return null;
        }
    }

    private OrderDto order() {
        System.out.println("✏ 주문 등록 ✏");
        List<OrderItemDto> orderItemList = new ArrayList<>();
        orderController.findAll();
        // 반복처리
        while (true) {
            System.out.print("도서 번호 입력 : ");
            int bookId = sc.nextInt();

            System.out.print("수량 입력 : ");
            int quantity = sc.nextInt();

            // OrderItemDto 객체 처리
//            OrderItemDto orderItemDto = new OrderItemDto(0, 0, bookId, quantity, null);
            OrderItemDto orderItemDto = new OrderItemDto(bookId, quantity);
            orderItemList.add(orderItemDto);

            // 추가주문 등록 여부 선택
            System.out.print("추가 주문하시겠습니까? (y/n) : ");
            if (sc.next().toLowerCase().charAt(0) != 'y')
                break;
        }

        System.out.println("✏ 주문자 정보 등록 ✏");
        System.out.print("주문자 입력 : ");
        String ordererName = sc.next();
        sc.nextLine();

        System.out.print("배송지 입력 : ");
        String ordererAddress = sc.nextLine();

        LocalDateTime orderDate = LocalDateTime.now();
        OrderDto orderDto = new OrderDto(0, ordererName, ordererAddress, orderDate, OrderStatus.주문확인중, orderItemList);
        System.out.println(orderDto);

        System.out.println("주문 정상 등록 완료!!");
        return orderDto;
    }
}
