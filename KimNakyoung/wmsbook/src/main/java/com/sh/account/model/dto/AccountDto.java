package com.sh.account.model.dto;

import lombok.*;

import java.sql.Timestamp;

@Data
@NoArgsConstructor // 마이바티스 쓸려면 기본생성자 필수
@AllArgsConstructor
public class AccountDto {
    private int userId; // 계정아이디
    private String username; // 계정이름
    private String password; // 계정 비밀번호 // DB에선 char이지만 JDBC는 Char 없음 그래서 String
    private  Role role; // 역할 (enum)
    private Timestamp createdAt; // 생성날짜

}
