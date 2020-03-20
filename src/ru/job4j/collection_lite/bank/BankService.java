package ru.job4j.collection_lite.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс реализует функционал работы банка
 *
 * @author Денис Висков
 * @version 1.0
 * @since 06.01.2020
 */
public class BankService {
    /**
     * Карта пользователей системы с привязкой аккаунтов
     */
    private Map<User, List<ru.job4j.bank.Account>> users = new HashMap<>();

    /**
     * Метод реализует функционал добавления нового пользователя в систему
     * Осуществляет проверку наличия пользователя в системе
     *
     * @param user - новый пользователь
     */
    public void addUser(User user) {
        if (!this.users.containsKey(user)) {
            this.users.put(user, new ArrayList<>());
        }
    }

    /**
     * Метод реализует функционал добавления счёта пользователю
     * Осуществляет поиск пользователя по данным паспорта
     * Выполняет проверку на наличие данного счёта у пользователя
     *
     * @param passport - паспорт
     * @param account  - счёт
     */
    public void addAccount(String passport, ru.job4j.bank.Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<ru.job4j.bank.Account> accounts = this.users.get(user);
            if (!accounts.contains(account)) {
                this.users.get(user).add(account);
            }
        }
    }

    /**
     * Метод выполняет поиск пользователя по данным его паспорта
     *
     * @param passport - паспорт
     * @return - пользователь
     */
    public User findByPassport(String passport) {
        return this.users.keySet()
                .stream()
                .filter(x -> x.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод выполняет поиск счёта по реквезитам
     *
     * @param passport  - паспорт
     * @param requisite - реквизиты
     * @return - счёт
     */
    public ru.job4j.bank.Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        return this.users.get(user).stream()
                .filter(x -> x.getRequisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод выполняет перевод средств с одного счёта на другой
     * Выполняет проверку на наличие денежных средств и наличие счёта
     *
     * @param srcPassport   - паспорт пользователя который осуществляет перевод
     * @param srcRequisite  - реквизиты счёта списания
     * @param destPassport  - паспорт пользователя зачисления денежных средств
     * @param destRequisite - реквизиты пользователя зачисления денежных средств
     * @param amount        - сумма перевода
     * @return - true или false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        boolean validation = findByRequisite(srcPassport, srcRequisite) != null
                && findByRequisite(destPassport, destRequisite) != null;
        if (validation) {
            ru.job4j.bank.Account first = findByRequisite(srcPassport, srcRequisite);
            ru.job4j.bank.Account second = findByRequisite(destPassport, destRequisite);
            rsl = first.transferCash(first, second, amount);
        }
        return rsl;
    }
}
