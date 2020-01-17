package com.qf.spring.web;

import com.qf.spring.domain.Account;
import com.qf.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    public void transfer(Account account){
        System.out.println("转账接口");
        accountService.transfer(account.getFrom(),account.getTo(),account.getMoney());
    }
}
