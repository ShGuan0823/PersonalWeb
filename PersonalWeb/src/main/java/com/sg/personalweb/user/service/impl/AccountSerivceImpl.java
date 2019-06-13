package com.sg.personalweb.user.service.impl;

import com.sg.personalweb.common.service.impl.BaseServiceImpl;
import com.sg.personalweb.user.dao.AccountRepository;
import com.sg.personalweb.user.domain.Account;
import com.sg.personalweb.user.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @Description service 帐号实现
 * @Author ShGuan
 * @Date 2019/6/12 22:28
 **/
@Service
public class AccountSerivceImpl extends BaseServiceImpl<Account, AccountRepository> implements AccountService{

    public AccountSerivceImpl(AccountRepository dao) {
        super(dao);
    }
}