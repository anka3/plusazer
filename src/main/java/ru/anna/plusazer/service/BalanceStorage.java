package ru.anna.plusazer.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BalanceStorage {

    private Long balance;
    public Long minus(long amount) {
        balance = balance - amount;
        return balance;
    }

    public Long plus(long amount) {
        balance = balance + amount;
        return balance;
    }

    public Long getBalance() {
        return balance;
    }

    @PostConstruct
    public void init(){
        balance = 0L;
    }
}
