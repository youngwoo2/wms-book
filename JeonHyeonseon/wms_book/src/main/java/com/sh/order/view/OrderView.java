package com.sh.order.view;

import com.sh.book.controller.BookController;
import com.sh.book.model.dto.BookDto;
import com.sh.order.controller.OrderController;
import com.sh.order.model.dto.OrderDto;
import com.sh.order.model.dto.OrderItemDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderView {
    private OrderController orderController = new OrderController();
    private BookController bookController = new BookController();

    private Scanner sc = new Scanner(System.in);

    public void orderMenu() {
        String menu = """
                    [주문 메뉴 선택]
                =====================
                     1. 주문 생성
                     2. 주문 상태
                     0. 돌아가기
                =====================
                입력 : """;
        System.out.println(menu);
        String choice = sc.next();
        switch (choice) {
            case "1" :
                inputOrderBook();
                break;
            case "2" : break;
            case "0" : return;
            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
    private void inputOrderBook() {
        System.out.println("  [ 주문자 정보 입력 ]");
        System.out.println("---------------------");
        System.out.print("이름 : ");
        String ordererName = sc.nextLine();
        System.out.print("주소 : ");
        String ordererAddress = sc.nextLine();
        OrderDto orderDto = new OrderDto(ordererName, ordererAddress, null);
        orderController.inputOrderBook(orderDto);
        inputOrderBookList();
    }

    private void inputOrderBookList() {
        System.out.println("주문할 도서를 입력해주세요");
        List<OrderItemDto> orderItemList = new ArrayList<>();

        while (true) {
            System.out.println("------------------------------");
            System.out.println("도서 정보를 참고해주세요");
            // 도서 전체 조회
            bookController.findAllBooks();
            System.out.println("------------------------------");

            // 선택한 카테고리의 메뉴 노출
            List<BookDto> bookList = bookController.findByCategory(category);
            if(bookList.isEmpty())
                continue;

            // 도서명 선택
            System.out.print("도서명 : ");
            int bookId = sc.nextInt();
            int price = bookList.stream()
                    .filter((book) -> book.getBookId() == bookId)
                    .findFirst()
                    .get()
                    .getPrice();

            // 수량 선택
            System.out.print("수량 : ");
            int quantity = sc.nextInt();

            // OrderItem객체 처리
            OrderItemDto orderItemDto = new OrderItemDto(0, orderId, bookId, quantity);
            orderItemDto.add(orderItemDto);
            // 결제금액 total
        }

    }

}
