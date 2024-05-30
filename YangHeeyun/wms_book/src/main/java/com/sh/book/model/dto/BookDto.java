package com.sh.book.model.dto;

import lombok.*

public class BookDto {
    @NoArgsConstructor // 기본생성자

    @AllArgsConstructor // 모든 매개인자 생성자
    @Getter
    @Setter
    @ToString
}
