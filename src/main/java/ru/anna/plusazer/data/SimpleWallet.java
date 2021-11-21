package ru.anna.plusazer.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.anna.plusazer.Users;
import ru.anna.plusazer.controller.dto.Balance;

@AllArgsConstructor
@Getter
public class SimpleWallet {

    Wallet wallet1 = new Wallet() {
        @Override
        public long getWalletNumber() {
            return 1;
        }

        @Override
        public Balance getBalance() {
            return null;
        }

        @Override
        public Balance plus() {
            return null;
        }

        @Override
        public Balance minus() {
            return null;
        }
    };

    Wallet wallet2 = new Wallet() {
        @Override
        public long getWalletNumber() {
            return 1;
        }

        @Override
        public Balance getBalance() {
            return null;
        }

        @Override
        public Balance plus() {
            return null;
        }

        @Override
        public Balance minus() {
            return null;
        }
    };

    public SimpleWallet() {   //это нужно убрать, но тогда не получается привязать к юзеру
    }
}
