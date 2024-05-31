package com.sh.book.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDto {
    private int bookId;
    private String title;
    private String author;
    private String description;
    private int price;
    private String category;
    private LocalDateTime createdAt;
}
