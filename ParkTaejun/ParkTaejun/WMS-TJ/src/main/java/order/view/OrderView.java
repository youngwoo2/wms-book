package order.view;

import book.controller.BookController;
import book.model.entity.Book;
import order.controller.OrderController;
import order.model.entity.Order;
import order.model.entity.OrderItem;
import order.model.entity.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderView {
    OrderController orderController = new OrderController();
    BookController bookController = new BookController();
    Book book = new Book();
    Scanner scanner = new Scanner(System.in);


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

        while (true) {
            System.out.println(orderMenu);
            String choice = scanner.next();
            switch (choice) {
                // 주문생성
                case "1":
                    makeOrder();
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


    // 주문 생성
    public void makeOrder() {
        List<OrderItem> orderList = new ArrayList<>();

        while (true) {
            System.out.println("=====================================");
            System.out.println("주문 가능하신 책의 정보 입니다. ");
            bookController.findAll();
            System.out.println("=====================================\n");
            System.out.print("주문하고 싶으신 책의 ID를 입력해주세요 ");
            int bookId = scanner.nextInt();

            book = bookController.findByBookId(bookId);
            if (book == null)
                continue;

            // 수량 선택
            System.out.println("===================================");
            System.out.println("수량 선택 : ");
            int quantity = scanner.nextInt();

            OrderItem orderItem = new OrderItem(0, 0, bookId, quantity, null);
            orderList.add(orderItem);

            // 주문 추가
            System.out.println("====================================");
            System.out.println(" 추가 주문 하시겠습니까? (y/n) : ");
            if (scanner.next().toLowerCase().charAt(0) != 'y')
                break;
        }

        System.out.println("====================================================");
        // 주문 사용자 입력 정보 입력 및 요청
        System.out.println(" 주문을 요청 합니다 ");
        System.out.println(" 주문하시는 사용자의 성함을 입력해주세요 ");
        String orderName = scanner.next();
        System.out.println(" 주문하시는 사용자의 주소를 입력해주세요 ");
        String orderaddress = scanner.next();
        Order order = new Order(0, orderName, orderaddress, null, Status.발송완료, orderList);
        orderController.createOrder(order);



    }


}
