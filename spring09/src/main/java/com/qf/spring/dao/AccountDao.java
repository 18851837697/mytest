package com.qf.spring.dao;

public interface AccountDao {
    void subMoney(Integer id,Double money);
    void addMoney(Integer id,Double money);
}
