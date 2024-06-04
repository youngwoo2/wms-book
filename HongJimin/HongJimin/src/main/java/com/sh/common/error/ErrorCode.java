package com.sh.common.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor


public enum ErrorCode {
    FIND_All_BOOK_ERROR("도서 전체 조회 중 오류가 발생했습니다."),
    FIND_A_BOOK_ERROR("한 권의 도서 조회 중 오류가 발생했습니다.");

    @Getter
    final String msg;
}
