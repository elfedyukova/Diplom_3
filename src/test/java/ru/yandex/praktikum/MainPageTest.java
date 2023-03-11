package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class MainPageTest extends BaseUiTest {

    @Test
    public void goPersonal() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickPersonalButton();

        LoginPage loginPage = new LoginPage(webDriver);

        boolean isDisplayed = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/h2")).isDisplayed();
        String expected = "Вход";
        String actual = webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/h2")).getText();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void goConstructor() {

    }

    @Test
    public void goLogo() {

    }
}
