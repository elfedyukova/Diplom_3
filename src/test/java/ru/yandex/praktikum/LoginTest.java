package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseUiTest {

    private String email = "elfedyukova@yandex.ru";
    private String password = "testerqa";

    @Test
    @DisplayName("Авторизация пользователя через кнопку Войти с главной")
    public void LoginInMainPage() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickInputButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickInputButton();

        boolean isDisplayed = mainPage.findElement();
        assertEquals(isDisplayed, true);

        String expected = "Оформить заказ";
        String actual = mainPage.getInputText();
        assertEquals(expected, actual);
    }

    @DisplayName("Авторизация пользователя через личный кабинет на главной странице")
    @Test
    public void LoginInLoginPage() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickInputButton();

        boolean isDisplayed = mainPage.findElement();
        assertEquals(isDisplayed, true);

        String expected = "Оформить заказ";
        String actual = mainPage.getInputText();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Авторизация пользователя через форму регистрации")
    public void LoginInRegisterPage() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickRegisterButton();

        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickInputButton();

        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickInputButton();

        boolean isDisplayed = mainPage.findElement();
        assertEquals(isDisplayed, true);

        String expected = "Оформить заказ";
        String actual = mainPage.getInputText();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Авторизация пользователя через форму восстановления пароля")
    public void LoginInResetPasswordPage() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickInputButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickResetButton();

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(webDriver);
        forgotPasswordPage.clickInputButton();

        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickInputButton();

        boolean isDisplayed = mainPage.findElement();
        assertEquals(isDisplayed, true);

        String expected = "Оформить заказ";
        String actual = mainPage.getInputText();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Переход из Личного кабинета в конструктор")
    public void goConstructor() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickConstructorButton();

        boolean isDisplayed = loginPage.constructorPage();
        assertEquals(isDisplayed, true);

        String expected = "Соберите бургер";
        String actual = loginPage.getConstructorText();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Переход из Личного кабинета по логотипу")
    public void goLogo() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLogoButton();

        boolean isDisplayed = mainPage.findInputElement();
        assertEquals(isDisplayed, true);

        String expected = "Войти в аккаунт";
        String actual = mainPage.getInputButtonText();
        assertEquals(expected, actual);

    }

}
