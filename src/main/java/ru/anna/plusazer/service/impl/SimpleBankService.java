package ru.anna.plusazer.service.impl;

import org.springframework.stereotype.Service;
import ru.anna.plusazer.service.BalanceStorage;
import ru.anna.plusazer.service.Storage;

@Service
public class SimpleBankService {

    Storage storage;

    public SimpleBankService(Storage storage) {
        this.storage = storage;
    }


}
