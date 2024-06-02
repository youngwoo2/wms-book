package com.sh.common;

import com.sh.account.model.dto.AccountDto;

// 조회한 로그인들을 메모리상에 저장하는 느낌?
// 인증객체 관리
// common 밑에서 하기 왜냐면 여러군데에서 호출 할 꺼니까
// 민혁님꺼 참고

// 검증
public class AuthManager {
//    로그인에 성공하면 AuthManager클래스에서 static필드인 loginUser에서 로그인한 회원객체를 관리합니다.
    private  static AccountDto loginUser = null;

//    isLogin():boolean
    public static boolean isLogin() {
        return loginUser != null;
    }

//    login(User):void
// 로그인된 사용자의 정보를 저장 (accountDto에 저장)
    public static void login(AccountDto accountDto) {
        loginUser = accountDto;
    }

//    인증된 사용 객체를 가져오고 싶다면 사용하는 메서드
//    getLoginUser():User
//     나는 User가 Account라서 AccountDto 타입
    public static AccountDto getLoginUser(){
        return loginUser;
    }

//     로그아웃하면 AuthManager클래스의 static필드인 loginUser를 null로 처리합니다
//    logout():void
    public static  void logout() {
        loginUser = null;
    }
}
