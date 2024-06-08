package com.sh.order.view;
// 1. 주문 생성 (고객 주문 생성 (주문 번호, 고객 정보, 주문 도서, 수량, 배송지 정보 등))
// 2. 주문 처리 ("주문 상태 관리 (주문 접수, 처리 중, 배송 중, 완료 등)")

//1. 임의의 고객주문서가 있다고 가정하고, 이를 토대로 도서관리자는 도서관리앱에 주문을 등록합니다.
//2. 하나의 주문에는 여러종류의 책을 포함할 수 있으므로, tbl_order 테이블과 tbl_order_item테이블의 관계를 고려해야 합니다.
//3. 주문 등록시에는 한건의 tbl_order 등록 쿼리와 한건이상의 tbl_order_item 등록쿼리를 함께 트랜잭션처리해야 합니다.
//4. 다음 샘플 도서주문서를 등록할 수 있도록 있도록 합니다.
import com.sh.book.controller.BookController;
import com.sh.book.model.dto.BookDto;
import com.sh.order.controller.OrderController;
import com.sh.order.model.dto.OrderDto;
import com.sh.order.model.dto.OrderItemDto;
import com.sh.order.model.dto.Status;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.sh.order.model.dto.Status.ORDER_CONFIRMING;

public class OrderView {
    private OrderController orderController = new OrderController();
    private BookController bookController = new BookController();

    List<OrderItemDto> orderItemList = new ArrayList<>();

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
                    orderBook();
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

    // 주문처리메소드
    //도서 주문서
    //---------------
    //주문자 : 홍길동
    //배송지 : 서울시 강동구 풍납동 1234-56
    //주문일 : 2024-06-04T13:30
    //
    //-> order dto
    //주문 목록
    //--------------
    //1. 딥러닝 실전 (도서번호 5번) 3권
    //2. 리눅스 커맨드라인 완벽정리(도서번호 8번) 2권

    public void orderBook() {
            System.out.println("주문해주세요 ");
            System.out.print("주문자 : ");
            String orderName = sc.next();
            sc.nextLine(); // 개행버리기
            System.out.print("배송지 : ");
            String orderAddress = sc.nextLine();
            while (true) {
                bookController.findAll();
                System.out.print("주문하고 싶은 도서 코드 :");
                int bookId = sc.nextInt();
                sc.nextLine(); // 개행버리기

                // 선택한 도서코드 도서 목록들
                List<BookDto> bookList = bookController.findByBookIdList(bookId);

                // 없는 도서 코드라면? 다시 도서코드 입력
                if(bookList.isEmpty()) {
                    System.out.println("없는 도서코드입니다. 다시 입력해주세요");
                    continue;
                }
                String title = bookList.stream()
                                .filter((bookDto -> bookDto.getBookId() == bookId))
                                .findFirst()
                                .get()
                                .getTitle();


                System.out.print("주문하고 싶은 수량 : ");
                int quantity = sc.nextInt();
                sc.nextLine(); // 개행버리기

                OrderItemDto orderItem = new OrderItemDto(0, 0,bookId, quantity,null);
                orderItemList.add(orderItem);

                // - 추가주문 여부 선택
                System.out.print("추가 주문하시겠습니까? (y/n) : ");
                if (sc.next().toLowerCase().charAt(0) != 'y')
                    break;

            }


        // 주문요청 (OrderController 메시지 전달) 및 결과확인

        System.out.println("주문을 요청합니다."); // 반복문 탈출하면 실행
        OrderDto orderDto = new OrderDto(0,orderName,orderAddress,new Timestamp(System.currentTimeMillis()), Status.ORDER_CONFIRMING,null);
        System.out.println(orderDto);

        orderController.createOrder(orderDto);
        System.out.println("주문번호 : " + orderDto.getOrderId());
        System.out.println("주문 정상 종료!!!!");

    }

    //주문처리메소드
    //



}
