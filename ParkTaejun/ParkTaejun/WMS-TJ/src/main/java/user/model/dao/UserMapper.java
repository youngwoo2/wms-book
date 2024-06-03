package user.model.dao;

import org.apache.ibatis.annotations.Param;
import user.model.entity.User;

public interface UserMapper {
    User login (@Param("userId") int userId,@Param("password") String password);
}
