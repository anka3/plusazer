package ru.anna.plusazer.service;

import ru.anna.plusazer.controller.dto.Amount;
import ru.anna.plusazer.controller.dto.Balance;

public interface BankService {
    void transfer(long userIdFrom, long userIdTo, Amount amount);
    Balance plus(long userId, Amount amount);
    Balance minus(long userId, Amount amount);
    Balance getBalance(long userId);
}
