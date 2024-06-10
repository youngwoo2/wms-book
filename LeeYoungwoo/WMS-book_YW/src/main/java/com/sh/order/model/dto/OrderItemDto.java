package com.sh.order.model.dto;

import com.sh.book.model.dto.BookDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
    private int orderItemId;
    private int orderId;
    private int bookId;
    private int quantity;

    private BookDto book;


}
