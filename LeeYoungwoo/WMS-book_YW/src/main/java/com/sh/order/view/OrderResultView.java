package com.sh.order.view;

import com.sh.book.model.dto.BookDto;
import com.sh.order.model.dto.OrderDto;
import com.sh.order.model.dto.OrderItemDto;

import java.util.List;

public class OrderResultView {
    public static void displayResult(int result) {
        if(result > 0) {
            System.out.println("> 🎉🎉🎉" + "주문 등록 성공 🎉🎉🎉");
        }
        else {
            System.out.println("> 😭😭😭" + "주문 등록 실패 😭😭😭");
        }
    }

    public static void displayFindByStatusList(List<OrderDto> list) {
        System.out.println("🛒 주문 정보 🛒");
        if (list.isEmpty()) {
            System.out.println("😅😅😅 조회된 주문 목록이 없습니다. 😅😅😅");
        } else {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.printf("%s\t%s\t%s\t%s\t%s\n", "주문 ID", "주문자 이름", "배송지", "주문 날짜", "주문 상태");
            System.out.println("-------------------------------------------------------------------------------------------");
            for(OrderDto orderDto : list) {
                System.out.printf("%d\t%s\t%s\t%s\t%s\n",
                        orderDto.getOrderId(),
                        orderDto.getOrdererName(),
                        orderDto.getOrdererAddress(),
                        orderDto.getOrderDate(),
                        orderDto.getStatus()

                );
            }
            System.out.println("-------------------------------------------------------------------------------------------");

        }
    }

    public static void displayFindByOrderStatusList(OrderDto orderDto) {
        System.out.println("🛒 주문 정보 🛒");
        System.out.println("---------------------------------------------");
        if (orderDto == null) {
            System.out.println("😅😅😅 조회된 주문 목록이 없습니다. 😅😅😅");
        } else {
            System.out.println("주문번호 : " + orderDto.getOrderId());
            System.out.println("주문자 : " + orderDto.getOrdererName());
            System.out.println("배송지 : " + orderDto.getOrdererAddress());
            System.out.println("주문일 : " + orderDto.getOrderDate());
            System.out.println();

            System.out.println("📄 주문목록 📄");
            System.out.println("---------------------------------------------");
            int i = 1;
            for (OrderItemDto orderItemDto : orderDto.getOrderList()) {
                System.out.printf("%d. %s (도서번호 : %d번) %d권\n",
                        i++,
                        orderItemDto.getBook().getTitle(),
                        orderItemDto.getBook().getBookId(),
                        orderItemDto.getQuantity());
            }
        }



    }
}
