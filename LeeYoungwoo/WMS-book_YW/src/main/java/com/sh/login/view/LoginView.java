package com.sh.login.view;

import java.util.Scanner;

public class LoginView {
    private Scanner sc = new Scanner(System.in);
    public void loginMenu(){
        System.out.println("🔥 지옥의 도서창고관리 프로그램입니다. 🔥");
        System.out.print("> ID를 입력해주세요 : ");
        String Id = sc.next();
        System.out.print("> 비밀번호를 입력해주세요 : ");
        String password = sc.next();

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.mainMenu();
    }
}
