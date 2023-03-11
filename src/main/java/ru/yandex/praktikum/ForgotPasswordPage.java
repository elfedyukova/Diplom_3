package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePage{

    private By InputButton = By.xpath("//*[@id=\"root\"]/div/main/div/div/p/a");

    public ForgotPasswordPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickInputButton() {
        webDriver.findElement(InputButton).click();
    }
}
