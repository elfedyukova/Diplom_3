package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class MainPageTest extends BaseUiTest {

    @Test
    @DisplayName("Переход по клику на Личный кабинет")
    public void goPersonal() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();

        boolean isDisplayed = mainPage.findEnterElement();
        assertEquals(isDisplayed, true);

        String expected = "Вход";
        String actual = mainPage.getEnterText();
        assertEquals(expected, actual);

    }
}
