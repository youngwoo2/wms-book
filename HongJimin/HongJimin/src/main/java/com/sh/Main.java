package com.sh;

import com.sh.user.view.UserView;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
        ======================================
        📖📖📖📖WMS 프로그램 시작합니다📖📖📖📖
        ======================================""");
        UserView userView = new UserView();
        userView.loginCheck();
        System.out.println("📢프로그램을 종료합니다📢");
    }
}
