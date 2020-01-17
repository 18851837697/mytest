package com.qf.spring.service.impl;

import com.qf.spring.dao.AccountDao;
import com.qf.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public void transfer(Integer from, Integer to, Double money) {
        System.out.println("转账业务");
        accountDao.subMoney(from,money);
        accountDao.addMoney(to,money);
    }
}
