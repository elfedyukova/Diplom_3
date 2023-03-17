package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class LogOtTest extends BaseUiTest {

    private String email = "elfedyukova@yandex.ru";
    private String password = "testerqa";

    @Test
    @DisplayName("Выход по кнопке Выйти из личного кабинета")
    public void LogOt() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickInputButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickInputButton();

        mainPage.clickPersonalButton();

        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.clickLogOtButton();

        boolean isDisplayed = loginPage.findElement();
        assertEquals(isDisplayed, true);

        String expected = "Войти";
        String actual = loginPage.getInputText();
        assertEquals(expected, actual);

    }

}
