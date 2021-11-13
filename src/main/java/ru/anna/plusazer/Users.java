package ru.anna.plusazer;

import ru.anna.plusazer.controller.NumberController;
import ru.anna.plusazer.controller.dto.Balance;
import ru.anna.plusazer.service.BalanceStorage;

import java.util.*;



public class Users{

    public static void main (String[] args)  {

        HashMap<Integer, Balance> numberCheck = new HashMap<>();
        Balance balance = new Balance(55L); //вызвали конструктор с параметрам 55 l - потому что  l это лонг
        numberCheck.put(2, balance); //номер счета, а значением счет
        numberCheck.put(3, balance);

        HashMap<Integer, HashMap<Integer, Balance>> users = new HashMap<>(); // идентификатор + тип переменной numberCheck
        users.put(7, numberCheck);
        users.put(8, numberCheck);
         //получаем из коллекции пользователя и его счет

         BalanceStorage balanceStorage = new BalanceStorage().transfer(, 1000);
         numberCheck.get(2).balanceStorage(numberCheck.get(3), 1000);


    }

    }






