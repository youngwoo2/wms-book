package com.sh.order.model.dao;

import com.sh.order.model.dto.OrderDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderMapperTest {
    SqlSession sqlSession;
    OrderMapper orderMapper;

    @BeforeEach
    void setUp() {
        this.sqlSession = getSqlSession();
        this.orderMapper = this.sqlSession.getMapper(OrderMapper.class);
    }

    @AfterEach
    void tearDown() {
        this.sqlSession.close();
    }

    @DisplayName("도서 주문을 받는다.")
    @Test
    void insertOrder() {
        // given
        int orderId = 1;
        // when
        OrderDto orderDto = orderMapper.findByOrderId(orderId);
        System.out.println(orderDto);
        // then
        assertThat(orderDto).isNotNull();
        assertThat(orderDto.getOrdererName()).isEqualTo("김철수");
        assertThat(orderDto.getOrdererAddress()).isEqualTo("서울시 강남구 역삼동 123-45");
        assertThat(orderDto.getOrderDate()).isEqualTo("2024-05-29 14:05:10");
        assertThat(orderDto.getOrderItemList()).isNotNull().isNotEmpty();
    }

    @DisplayName("주문한 도서 목록을 보여준다.")
    @Test
    void insertOrderItem() {
    }
}