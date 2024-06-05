package com.sh.order.model.dto;

import com.sh.book.model.dto.BookDto;
import lombok.*;
@Data // @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
    private int orderItemId; // 주문항목 아이디
    private int orderId; // 주문 아이디
    private int bookId; // 도서 아이디
    private int quantity; // 수량

    private BookDto bookDto; // 사용자가 주문한 정보를 확인할 때 책 제목을 넣기 위해서 필요함.
}
