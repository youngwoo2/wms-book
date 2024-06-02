package com.sh.account.model.service;

import com.sh.account.model.dao.AccountMapper;
import com.sh.account.model.dto.AccountDto;
import org.apache.ibatis.session.SqlSession;

import static com.sh.common.MyBatisTemplate.getSqlSession;

public class AccountService {

    public AccountDto login(int userId, String password) {
        SqlSession sqlSession = getSqlSession();
        try {
            AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
            return accountMapper.login(userId, password);
        } finally {
            sqlSession.close();
        }
    }
}
