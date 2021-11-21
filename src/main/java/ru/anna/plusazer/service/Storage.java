package ru.anna.plusazer.service;

import ru.anna.plusazer.data.Wallet;

public interface Storage {
    Wallet get(long userId);


}
