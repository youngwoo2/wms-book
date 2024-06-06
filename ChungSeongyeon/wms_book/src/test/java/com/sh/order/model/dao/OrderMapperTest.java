package com.sh.order.model.dao;

import com.sh.order.model.dto.OrderDto;
import com.sh.order.model.dto.OrderableStatus;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sh.common.MyBatisTemplate.getSqlSession;
import static org.assertj.core.api.Assertions.assertThat;

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

    @DisplayName("주문을 추가할 수 있다.")
    @Test
    void testInsertOrder() {
        // given
        OrderDto orderDto = new OrderDto();
        orderDto.setOrdererName("John Doe");
        orderDto.setOrdererAddress("123 Main St");
        orderDto.setStatus(OrderableStatus.valueOf("주문확인중"));

        // when
        int result = orderMapper.insertOrder(orderDto);
        sqlSession.commit();

        // then
        assertThat(result).isEqualTo(1);
        assertThat(orderDto.getOrderId()).isNotNull();
    }
}
