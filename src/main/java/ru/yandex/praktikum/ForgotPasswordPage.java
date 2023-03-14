package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePage {

    private By InputButton = By.xpath("//a[contains(text(),'Войти')]");

    public ForgotPasswordPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickInputButton() {
        webDriver.findElement(InputButton).click();
    }
}