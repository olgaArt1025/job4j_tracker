package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковской системы, в которой можно
 * регистрировать пользователя, удалять пользователя из системы,
 * добавлять пользователю банковский счет, переводить деньги.
 *  @author Olga Art
 *  @version 1.0
 */
public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Этот метод добавляет пользователя в систему
     * В методе есть проверка, что такого пользователя еще нет в системе.
     * Если он есть, то нового добавлять не надо.
     * @param user пользователь которого добавляем
     */
    public void addUser(User user) {
        users.putIfAbsent(user,  new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет к пользователю
     * находим пользователя по паспорту и получаем список всех счетов пользователя,
     * проверяем есть ли такой счет у пользователя, если нет добавляем
     * @param passport паспортные данные пользователя
     * @param account список счетов пользователя
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> usersAccount = users.get(user.get());
            if (!usersAccount.contains(account)) {
                usersAccount.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport паспортные данные пользователя
     * @return  метод возвращает пользователя, или null, если данные не найдены
     */
    public Optional<User> findByPassport(String passport) {
        return  users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * находим пользователя по паспорту и получаем список всех счетов пользователя,
     * находим нужный счет
     * @param passport паспортные данные пользователя
     * @param requisite реквизиты счета
     * @return – счет пользователя, или null, если данные не найдены (пользователь, счет)
     */
    public  Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(s -> s.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт,
     * находим счета пользователя по реквизитам, проверяем баланс,
     * если денег достаточно совершаем перевод
     * @param srcPassport паспортные данные пользователя со счёта, которого переводят
     * @param srcRequisite  реквизиты счёта с которого переводят
     * @param destPassport паспортные данные пользователя на счёт, которого переводят
     * @param destRequisite реквизиты счёта на который переводят
     * @param amount сумма перевода
     * @return возвращает true, если счета найдены и денег хватает на перевод,
     * или false если счёт не найден или не хватает денег
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
