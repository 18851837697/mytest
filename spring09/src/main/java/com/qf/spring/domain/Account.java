package com.qf.spring.domain;

public class Account {
    private  Integer from;
    private  Integer to;
    private  Double money;

    public Account() {
    }

    public Account(Integer from, Integer to, Double money) {
        this.from = from;
        this.to = to;
        this.money = money;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
