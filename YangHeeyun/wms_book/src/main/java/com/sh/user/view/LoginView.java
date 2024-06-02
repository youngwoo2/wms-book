package com.sh.user.view;

import com.sh.common.AuthManager;
import com.sh.user.controller.UserController;
import com.sh.user.model.dto.Role;
import com.sh.user.model.dto.UserDto;

import java.util.Scanner;

public class LoginView {
    private Scanner sc = new Scanner(System.in);
    private UserController userController = new UserController();
    private UserDto userDto = null;


    public void loginMenu(){
        System.out.println("🔥도서 창고 관리 프로그램 시작🔥");
        String menu = """
            ======================
            1. 로그인
            2. 회원가입
            0. 종료
            ======================
            입력 : """;

        while(true){
            System.out.print(menu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    loginCheck(); // id,pw,role 검증
                    break;
                case "2" :
                    // signUp();
                case "0" : return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void loginCheck() {
        // DB의 회원정보 검증
        // DB에 id,pw가 일치하는 정보가 없거나, Role이 manager가 아닌 경우 로그인 실패
        do{
            System.out.print("> ID 입력 : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("> Password 입력 : ");
            String password = sc.next();
            userDto = userController.login(id,password);
        } while(AuthManager.islogin());
//        while (userDto == null || userDto.getRole() != Role.manager);

        // 로그인 성공시 메인메뉴 호출
        System.out.println();
        new MainView().mainMenu();
    }
}
