package com.sh.user.model.dao;

import com.sh.user.model.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public interface UserMapper {
    User loginCheck(@Param("userName") String username,@Param("userPassword")  String password);
}
