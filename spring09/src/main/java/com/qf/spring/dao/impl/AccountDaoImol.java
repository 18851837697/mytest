package com.qf.spring.dao.impl;

import com.qf.spring.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class AccountDaoImol implements AccountDao {
    @Autowired
    private JdbcTemplate template;
    @Override
    public void subMoney(Integer id, Double money) {
        System.out.println("减钱了");
        String sql = "update tb_account set money = money - ? where id =?";
        template.update(sql,money,id);
    }

    @Override
    public void addMoney(Integer id, Double money) {
        System.out.println("加钱了");
        String sql = "update tb_account set money = money + ? where id =?";
        template.update(sql,money,id);

    }
}
