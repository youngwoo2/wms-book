package com.sh.account.model.dto;

public enum Role {
    // DB에 소문자로 되어있어서 소문자로 수정
    admin("관리자"),
    manager("도서관리자"),
    employee("직원");
    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
