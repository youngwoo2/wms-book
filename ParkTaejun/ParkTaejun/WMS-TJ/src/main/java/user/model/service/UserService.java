package user.model.service;

import org.apache.ibatis.session.SqlSession;
import user.model.dao.UserMapper;
import user.model.entity.User;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class UserService {
    public User login(int userId, String password) {
        SqlSession sqlSession = getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.login(userId,password);
        sqlSession.close();
        return  user;
    }
}
