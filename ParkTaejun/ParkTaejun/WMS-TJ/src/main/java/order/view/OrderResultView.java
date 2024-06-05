package order.view;

import order.model.entity.Order;

public class OrderResultView {
    public static void displayCreateOrder(int result) {


        if (result > 0) {
            System.out.println("\t🤗주문 처리 성공🤗\t");
        }
    }
}
