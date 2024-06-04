package order.model.service;

import order.model.dao.OrderMapper;
import order.model.entity.Order;
import order.model.entity.OrderItem;
import org.apache.ibatis.session.SqlSession;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class OrderService {

        public int createOrder (Order order){
        SqlSession sqlSession = getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

       try {
        int result = orderMapper.insertOrder(order);
        for (OrderItem orderItem : order.getOrderItems()) {
            orderItem.setOrderId(order.getOrderId());
            result = orderMapper.insertOrderItem(orderItem);
        }
        sqlSession.commit();
        return result;
    }catch (Exception e){
           sqlSession.rollback();
           throw new RuntimeException(e);
       }finally {
           sqlSession.close();
       }
    }
}
