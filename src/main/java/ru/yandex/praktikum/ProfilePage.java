package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage {

    private By LogOtButton = By.xpath("//button[contains(text(),'Выход')]");

    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickLogOtButton() {
        webDriver.findElement(LogOtButton).click();
    }
}
