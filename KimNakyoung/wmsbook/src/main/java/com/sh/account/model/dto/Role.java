package com.sh.account.model.dto;

public enum Role {
    Admin("관리자"),
    MANAGER("도서관리자"),
    EMPLOYEE("직원");
    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
