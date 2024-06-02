package com.sh.book.model.dto;

import lombok.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {
    private int bookId;
    private String title;
    private String author;
    private String description;
    private int price;
    private String category;
    private Timestamp createdAt;
}
