package order.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItem {
    private int orderItemId;
    private int orderId;
    private int bookId;
    private int quantity;

    private Order order;
}

