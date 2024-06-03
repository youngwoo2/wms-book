package com.sh.book.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDto {
    private int bookId; // 도서 코드
    private String title; // 도서 제목
    private String author; // 저자
    private String description; // 설명
    private int price; // 도서 가격
    private String category; // 도서 카테고리
    private LocalDateTime createdAt; // 생성일시
}
