package book.view;


import book.controller.BookController;
import book.model.entity.Book;
import user.view.ResultView;

import java.util.Scanner;

public class BookView {
    Book book = new Book();

    BookController bookController = new BookController();
    Scanner scanner = new Scanner(System.in);


    public void bookMenuView() {

        String menu = """
                                🤗🤗🤗
                =========================================
                도서 관리 입니다. 원하시는 메뉴를 선택해주세요
                1. 도서 등록 및 수정
                2. 도서 조회
                0. 뒤로 가기
                =========================================
                입력:""";

        while (true) {
            System.out.println(menu);
            String choice = scanner.next();
            switch (choice) {
                // 도서 등록 및 수정
                case "1":
                    break;

                // 도서 조회
                case "2":
                    bookSearch();
                    break;

                // 뒤로 가기
                case "0":
                    return;

                default:
                    System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
            }
        }


    }

    // 도서 조회 뷰
    public void bookSearch() {

        String searchMenu = """         
                =====================
                1. 전체 조회
                                
                2. 원하는 조건으로 검색
                                
                0. 뒤로 가기
                =====================
                """;

        while (true) {
            System.out.println(searchMenu);
            String choice = scanner.next();

            switch (choice) {

                case "1":
                    bookController.findAll();
                    break;


                case "2":
                    findByConditions();
                    break;


                case "0":
                    return;

                default:
                    System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해 주세요.");


            }


        }

    }


    // 조건 도서 검색 뷰
    public void findByConditions() {

        String findByConditionMenu = """
                                
                ================================               
                1. 도서 아이디로 검색
                                
                2. 저자로 검색
                                
                3. 카테고리로 검색 
                                
                0. 뒤로 가기
                ================================
                """;

        while (true) {
            System.out.println(findByConditionMenu);
            String choice = scanner.next();
            switch (choice) {
                case "1":
                     System.out.println("검색하실 책의 ID를 입력해주세요.");
                     int bookId = scanner.nextInt();
                     book = bookController.findByBookId(bookId);
                     ResultView.displayBook(book);


                    break;

                case "2":
                    System.out.println("작가 이름을 입력해주세요.");
                    String author = scanner.next();
                    bookController.findByAuthor(author);
                    break;

                case "3":
                    System.out.println("검색하실 카테고리 입력해주세요");
                    String category = scanner.next();
                    bookController.findByCategry(category);
                    break;

                case "0":
                    return;

                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }
        }


    }
}
