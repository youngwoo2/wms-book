package com.sh.user.view;

import com.sh.book.view.BookView;
import com.sh.common.AuthManager;
import com.sh.inventory.view.InventoryView;
import com.sh.order.view.OrderView;
import com.sh.user.controller.UserController;
import com.sh.user.model.dto.Roles;
import com.sh.user.model.dto.UserDto;
import com.sh.user.model.service.UserService;

import java.util.Scanner;

public class UserView {
    private Scanner sc = new Scanner(System.in);
    private UserController userController = new UserController();

    public void loginMenu() {
        String menu =
                """
                =================
                1. 로그인
                2. 회원가입
                0. 종료
                =================
                """;
        try {
            while (true) {
                System.out.println(menu);
                String choice = sc.next();
                switch (choice) {
                    case "1":
                        logIn();
                        break;
                    case "2":
                        System.out.println("회원가입");
                        // signUp();
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("❌잘못된 입력입니다.❌");
                }
            }
        } catch (Exception e) {
            System.out.println("❌잘못된 입력입니다.❌");
            System.out.println("🔁다시 입력 해주세요.🔁");
            System.out.println();
            loginMenu();
        }
    }

    private void logIn() {
        boolean loginSuccess = false;
        while (!loginSuccess) {
            System.out.println("✅로그인 해주세요✅");
            System.out.print("> 아이디 입력 : ");
            int id = sc.nextInt(); // next()로 아이디 입력
            sc.nextLine(); // 남아있는 개행 문자 제거
            System.out.print("> 비밀번호 입력 : ");
            String password = sc.nextLine(); // nextLine()로 비밀번호 입력
            System.out.println("> 직책 입력 : ");
            Roles role = Roles.valueOf(sc.next());
            System.out.println("⭕로그인 성공⭕");
            System.out.println(); // 개행 추가

            UserDto userDto = new UserDto();
            userDto.setUserId(id);
            userDto.setPassword(password);
            userDto.setRole(role);

            // 로그인 성공 여부 확인
            loginSuccess = userController.authenticateUser(id, password, role);

            if (loginSuccess) {
                // 로그인 정보를 AuthManager에 등록
                AuthManager.login(userDto);
                mainMenu();
            } else {
                System.out.println("❌로그인 실패❌");
            }
        }
    }


    private void mainMenu() {
        String menu =
                """
                [전체 메뉴 선택]
                 1. 도서 관리
                 2. 재고 관리
                 3. 주문 관리
                 0. 로그인 화면
                """;
        while (true) {
            System.out.println(menu);
            String choice = sc.next();
            switch (choice) {
                case "1":
                    BookView bookView = new BookView();
                    bookView.bookMenu();
                    break;
                case "2":
                    InventoryView inventoryView = new InventoryView();
                    inventoryView.inventoryMenu();
                    break;
                case "3":
                    OrderView orderView = new OrderView();
                    orderView.orderMenu();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("❌잘못된 입력입니다.❌");
            }
        }
    }
}
