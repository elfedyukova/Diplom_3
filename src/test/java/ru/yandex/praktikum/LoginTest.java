package ru.yandex.praktikum;

import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseUiTest {

    @Test
    public void LoginInMainPage (){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickInputButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.enterEmail("elfedyukova@yandex.ru");
        loginPage.enterPassword("testerqa");
        loginPage.clickInputButton();

        boolean isDisplayed = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/header/nav/a/p")).isDisplayed();
    }

    @Test
    public void LoginInLoginPage (){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.enterEmail("elfedyukova@yandex.ru");
        loginPage.enterPassword("testerqa");
        loginPage.clickInputButton();

        boolean isDisplayed = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/header/nav/a/p")).isDisplayed();
    }

    @Test
    public void LoginInRegisterPage (){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickRegisterButton();

        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickInputButton();

        loginPage.enterEmail("elfedyukova@yandex.ru");
        loginPage.enterPassword("testerqa");
        loginPage.clickInputButton();

        boolean isDisplayed = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/header/nav/a/p")).isDisplayed();
    }

    @Test
    public void LoginInResetPasswordPage (){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickInputButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickResetButton();

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(webDriver);
        forgotPasswordPage.clickInputButton();

        loginPage.enterEmail("elfedyukova@yandex.ru");
        loginPage.enterPassword("testerqa");
        loginPage.clickInputButton();

        boolean isDisplayed = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/header/nav/a/p")).isDisplayed();
    }

}
