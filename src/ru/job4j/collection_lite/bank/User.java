package ru.job4j.collection_lite.bank;

import java.util.Objects;

/**
 * Класс реализует модель данных пользователя
 *
 * @author Денис Висков
 * @version 1.0
 * @since 06.01.2020
 */
public class User {
    /**
     * Паспорт
     */
    private String passport;

    /**
     * ФИО пользователя
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
