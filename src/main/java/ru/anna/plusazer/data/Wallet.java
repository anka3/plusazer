package ru.anna.plusazer.data;

import ru.anna.plusazer.controller.dto.Balance;

public interface Wallet {
    long getWalletNumber();
    Balance getBalance();
    Balance plus();
    Balance minus();
}
