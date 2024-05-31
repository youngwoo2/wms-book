package com.sh.book.model.dto;

// 1. (도서 등록) 도서 정보 등록 2. (도서 수정)도서 정보 수정 (도서 코드, 제목, 저자, 설명, 가격, 카테고리 등)
// 3. (도서조회) 도서 목록 조회 4. (도서검색) 도서 검색 (도서명, 저자, 카테고리, 가격 등 기준)"

import java.math.BigDecimal;

public class BookDto {

    private int bookId; // 도서코드
    private String title; // 도서명

    private String author; // 저자
    private String description; // 설명
    private BigDecimal price; // 가격
    private String category; // 카테고리

    //생성일시는 안 쓸거 같아서 안 넣음

    public BookDto() {
    }

    public BookDto(int bookId, String title, String author, String description, BigDecimal price, String category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.category = category;
    }
}
