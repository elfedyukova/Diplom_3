package ru.yandex.praktikum;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class RegisterTest extends BaseRegisterTest {

    private String name = "Елена";
    private String email = "test@yandex.ru";
    private String randomEmail = RandomStringUtils.randomAlphanumeric(6) + "@yandex.ru";
    private String password = "tester";

    @Test
    @DisplayName("Регистрация с паролем менее 6 символов")
    public void registerShortPassword() {

        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.enterName(name);
        registerPage.enterEmail(email);
        registerPage.enterPassword("test");
        registerPage.clickRegistersButton();

        boolean isDisplayed = registerPage.findElement();
        assertEquals(isDisplayed, true);

        String expected = "Некорректный пароль";
        String actual = registerPage.getErrorText();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Регистрация существующего пользователя")
    public void registerUserExist() {

        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.enterName(name);
        registerPage.enterEmail(email);
        registerPage.enterPassword(password);
        registerPage.clickRegistersButton();

        boolean isDisplayed = registerPage.findElement();
        assertEquals(isDisplayed, true);

        String expected = "Такой пользователь уже существует";
        String actual = registerPage.getErrorText();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Успешная регистрация")
    public void registerSuccess() {

        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.enterName(name);
        registerPage.enterEmail(randomEmail);
        registerPage.enterPassword(password);
        registerPage.clickRegistersButton();

        LoginPage loginPage = new LoginPage(webDriver);
        boolean isDisplayed = loginPage.findElement();
        assertEquals(isDisplayed, true);

        String expected = "Войти";
        String actual = loginPage.getInputText();
        assertEquals(expected, actual);
    }

}