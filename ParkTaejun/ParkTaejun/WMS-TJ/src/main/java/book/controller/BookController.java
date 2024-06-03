package book.controller;

import book.model.entity.Book;
import book.model.service.BookService;
import user.view.ResultView;

import java.util.List;

public class BookController {



    BookService bookService = new BookService();

    public void findAll() {
        List<Book> list = bookService.findAll();
        ResultView.displayBookList(list);

    }

    public Book findByBookId(int bookId) {

    return  bookService.findByBookId(bookId);

    }


    public void findByAuthor(String author){
        List<Book> list = bookService.findByAuthor(author);
        ResultView.displayBookByAuthor(list);

    }

    public void findByCategry(String category) {
        List<Book>list = bookService.findByCategory(category);
        ResultView.displayBookByCategory(list);
    }
}
