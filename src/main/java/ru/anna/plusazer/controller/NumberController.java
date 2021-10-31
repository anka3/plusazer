package ru.anna.plusazer.controller;

import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.web.bind.annotation.*;
import ru.anna.plusazer.controller.dto.Amount;
import ru.anna.plusazer.controller.dto.Balance;
import ru.anna.plusazer.service.BalanceStorage;

@RestController
public class NumberController {

    BalanceStorage balanceStorage;

    public NumberController(BalanceStorage balanceStorage) {
        this.balanceStorage = balanceStorage;
    }

    @PostMapping("/plus")
    public Balance plus(@RequestBody Amount amount){
        System.out.println(amount.getAmount());
        Balance balancePlus = new Balance(balanceStorage.plus(amount.getAmount()));
        return balancePlus;
    }

    @PostMapping("/minus")
    public Balance minus( @RequestBody Amount amount){
        System.out.println(amount.getAmount());
        Balance balanceMinus = new Balance(balanceStorage.minus(amount.getAmount()));
        return balanceMinus;
    }

    @GetMapping("/balance")
    public Balance getBalance() {
        return new Balance(balanceStorage.getBalance());
    }


}

//https://www.gcreddy.com/2021/08/writing-selenium-test-cases.html

//реализовать остальные методы по такому же сценарию minus и balance
//подумать как сделать что нужно сделать чтобы было несколько счетов (сейчас один) - как нужно преобразить и что добавить. каие методы если много счетов
//как создавать новые счета и может ли иметь пользователь несколько счетов (hashcode)
//написать селениум тест на все методы - создать проект(или можно в этом) в котором будет хочу тестировтаь все методы/
// отправляю по урлу и сравниваю результат с ожидаемым  можно одним тестов
//___________________________________________
//31/10/2021
// использовать rest-assured с негативными и положительными кейсами - написать тесты (протестировать валидность значений и если нет то нужно правильно проверять значения)
//если я попробую прислать туда строку то вернетс неправильный ответ
//расшарить проект в гитхабе
//примерно сделали: id в базе - идентификатор - создать хештаблицу ключ это идентификатор пользователя а значение это счет, и создать лист из счетов чтобы использоать несколько
//мне нужно придумать как его усовершеноствовать чтобы он мог работать с множеством счетов и пльзователей, добавить в методы - +
//мне нужно реализовать метод трансфер чтобы переводить с одного счета на другой
//и ПОДУМАТЬ какие проблемы это может привлечь
// и почитать про 1) race condition
// и 2) https://habr.com/ru/post/164487/
//прочитать про многопоточность