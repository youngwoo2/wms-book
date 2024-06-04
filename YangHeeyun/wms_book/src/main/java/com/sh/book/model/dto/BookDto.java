package com.sh.book.model.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 매개인자 생성자
@Getter
@Setter
//@ToString

public class BookDto {
    private int bookId;
    private String title;
    private String author;
    private String description;
    private int price;
    private String category;
    private LocalDateTime createdAt;

    @Override
    public String toString() {
        return "[" +
                "도서 id = " + bookId +
                ", 도서명 = '" + title + '\'' +
                ", 저자 = '" + author + '\'' +
                ", 설명 = '" + description + '\'' +
                ", 가격 = " + price +
                ", 카테고리 ='" + category + '\'' +
                ", 등록일자 = " + createdAt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) +
                ']';
    }
}



