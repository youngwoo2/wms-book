package book.model.service;

import book.model.dao.BookMapper;
import book.model.entity.Book;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class BookService {

    public List<Book> findAll() {
                SqlSession sqlSession = getSqlSession();

                BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
                List<Book> list = bookMapper.findAll();
                sqlSession.close();
                return list;

            }

    public Book findByBookId(int bookId) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        return bookMapper.findByBookId(bookId);


    }

    public List<Book> findByAuthor(String author) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<Book> list = bookMapper.findByAuthor(author);
        return list;
    }

    public List<Book> findByCategory(String category) {
        SqlSession sqlSession = getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<Book> list = bookMapper.findByCategory(category);
        return list;
    }
}
