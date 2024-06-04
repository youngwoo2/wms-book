package com.sh.book.model.dao;

import com.sh.book.model.dto.BookDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookMapperTest {
    SqlSession sqlSession;
    BookMapper bookMapper;

    @DisplayName("도서 등록")
    @Test
    void testInsertBook() {
        // given
        String title = "수학의 정석";
        String author = "홍성대";
        String description = "100만부 판매돌파 수학 참고서";
        int price = 17000;
        String category = "수학";
        BookDto bookDto = new BookDto(0, title, author, description, price, category, null);
        // when
        int result = bookMapper.insertBook(bookDto);
        //then
        assertThat(result).isEqualTo(1);
        assertThat(bookDto.getBookId()).isNotZero();
    }
}