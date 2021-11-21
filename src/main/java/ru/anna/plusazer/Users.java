package ru.anna.plusazer;

import ru.anna.plusazer.controller.NumberController;
import ru.anna.plusazer.controller.dto.Balance;
import ru.anna.plusazer.data.SimpleWallet;
import ru.anna.plusazer.service.BalanceStorage;
import ru.anna.plusazer.service.BalanceStorage.*;

import java.util.*;



public class Users{

    private String accountNumber; // номер счета
    private double balance ; // баланс
    public Users(String acctNum, long initialBalance)
    {
        accountNumber = acctNum;
        balance = initialBalance;
    }

    public static void main (String[] args)  {
        Users first = new Users("1111111", 20000); //первый вариант привязки к номеру счета юзера
        Users second = new Users("2222222", 30000);
        Users tree = (Users) new SimpleWallet().getWallet1(); //второй вариант привязки к номеру счета юзера

        BalanceStorage balanceStorageMinus = new BalanceStorage().transferMinus(null,);
        first.balanceStorageMinus(second, 5000); //манипуляции с трансфером

//        HashMap<Integer, Balance> numberCheck = new HashMap<>();
//        Balance balance = new Balance(55L); //вызвали конструктор с параметрам 55 l - потому что  l это лонг
//        numberCheck.put(2, balance); //номер счета, а значением счет
//        numberCheck.put(3, balance);
//
//        HashMap<Integer, HashMap<Integer, Balance>> users = new HashMap<>(); // идентификатор + тип переменной numberCheck
//        users.put(7, numberCheck);
//        users.put(8, numberCheck);
//         //получаем из коллекции пользователя и его счет

       // numberCheck.get(2).balanceStorage(numberCheck.get(3), 1000);
       // first.transferMinus(second, 5000);



    }

    }






