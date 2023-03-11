package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LogOtTest extends BaseUiTest {

    @Test
    public void LogOt (){
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickInputButton();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.enterEmail("elfedyukova@yandex.ru");
        loginPage.enterPassword("testerqa");
        loginPage.clickInputButton();

        mainPage.clickPersonalButton();

        ProfilePage profilePage = new ProfilePage(webDriver);
        profilePage.clickLogOtButton();

        boolean isDisplayed = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/h2")).isDisplayed();
        String expected = "Вход";
        String actual = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/h2")).getText();
        Assert.assertEquals(expected, actual);


    }

}
