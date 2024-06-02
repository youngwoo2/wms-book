package com.sh;

import com.sh.user.view.UserView;

public class Main {
    public static void main(String[] args) {
        mainView();
    }
    public static void mainView() {
        System.out.println(
                """
                ===========================================
                WMS Book 프로그램을 시작합니다.
                ===========================================
                """);
        UserView userView = new UserView();
        userView.loginMenu();
        System.out.println("프로그램을 종료합니다.");
    }
}
