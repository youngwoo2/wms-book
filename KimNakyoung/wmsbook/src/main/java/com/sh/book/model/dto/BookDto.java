package com.sh.book.model.dto;

// 1. (도서 등록) 도서 정보 등록 2. (도서 수정)도서 정보 수정 (도서 코드, 제목, 저자, 설명, 가격, 카테고리 등)
// 3. (도서조회) 도서 목록 조회 4. (도서검색) 도서 검색 (도서명, 저자, 카테고리, 가격 등 기준)"

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor // 마이바티스 쓸려면 기본생성자 필수
@AllArgsConstructor
public class BookDto {

    private int bookId; // 도서코드
    private String title; // 도서명

    private String author; // 저자
    private String description; // 설명
    private int price; // 가격
    private String category; // 카테고리

    private Timestamp createdAt; // 생성날짜

    @Override
    public String toString() {
        return String.format(
                "도서코드: %d, 도서명: %s, 저자: %s, 설명: %s, 가격: %d, 카테고리: %s, 생성날짜: %s",
                bookId, title, author, description, price, category, createdAt
        );
    }

}
