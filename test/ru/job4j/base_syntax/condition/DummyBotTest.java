package ru.job4j.base_syntax.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        assertThat(
                ru.job4j.condition.DummyBot.answer("Привет, Бот."),
                is("Привет, умник.")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                ru.job4j.condition.DummyBot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                ru.job4j.condition.DummyBot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}

