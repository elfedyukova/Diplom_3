package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseUiTest {

    @Test
    public void registerShortPassword() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickRegisterButton();

        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.enterName("Елена");
        registerPage.enterEmail("test@yandex.ru");
        registerPage.enterPassword("test");
        registerPage.clickRegistersButton();

        boolean isDisplayed = webDriver.findElement(By.xpath("/html/body/div/div/main/div/form/fieldset[3]/div/p")).isDisplayed();
        String expected = "Некорректный пароль";
        String actual = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/fieldset[3]/div/p")).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void registerUserExist() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickRegisterButton();

        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.enterName("Елена");
        registerPage.enterEmail("test@yandex.ru");
        registerPage.enterPassword("tester");
        registerPage.clickRegistersButton();

        String expected = "Такой пользователь уже существует";
        String actual = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/p")).getText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void registerSuccess() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickRegisterButton();

        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.enterName("Елена");
        registerPage.enterEmail("test88@yandex.ru");
        registerPage.enterPassword("tester");
        registerPage.clickRegistersButton();

        boolean isDisplayed = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/button")).isDisplayed();
    }

}