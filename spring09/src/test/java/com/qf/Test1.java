package com.qf;

import com.qf.spring.domain.Account;
import com.qf.spring.web.AccountController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class Test1 {
    @Autowired
    private AccountController controller;
    @Test
    public void transTest(){
        Account account =new Account();
        account.setFrom(1);
        account.setTo(2);
        account.setMoney(50.0);
        controller.transfer(account);
    }
}
