package com.sh.order.view;

import com.sh.book.model.dto.BookDto;
import com.sh.order.model.dto.OrderDto;

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
}
