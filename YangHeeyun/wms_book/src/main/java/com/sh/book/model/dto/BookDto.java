package com.sh.book.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 매개인자 생성자
@Getter
@Setter
@ToString

public class BookDto {
    private int bookId;
    private String title;
    private String author;
    private String description;
    private double price;
    private String category;
    private LocalDateTime bookcreatedAt;
}
