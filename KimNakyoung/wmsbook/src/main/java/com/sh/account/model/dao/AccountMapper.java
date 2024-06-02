package com.sh.account.model.dao;

import com.sh.account.model.dto.AccountDto;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    AccountDto login(@Param("userId") int userId, @Param("password") String password);

}
