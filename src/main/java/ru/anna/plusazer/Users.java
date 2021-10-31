package ru.anna.plusazer;

import ru.anna.plusazer.controller.NumberController;
import ru.anna.plusazer.controller.dto.Balance;
import ru.anna.plusazer.service.BalanceStorage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class Users{

    public static void main (String[] args)  {

        HashMap<Integer, Balance> numberCheck = new HashMap<>();
        Balance balance = new Balance(55L); //вызвали конструктор с параметрам 55 l - потому что  l это лонг
        numberCheck.put(22222, balance); //номер счета, а значением счет

        HashMap<Integer, HashMap<Integer, Balance>> users = new HashMap<>(); // идентификатор + тип переменной numberCheck
        users.put(7, numberCheck);
         //получаем из коллекции пользователя и его счет
    }


}


