package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private By PersonalButton = By.xpath("//*[@id=\"root\"]/div/header/nav/a/p");
    private By InputButton = By.xpath("//*[@id=\"root\"]/div/main/section[2]/div/button");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickPersonalButton() {
        webDriver.findElement(PersonalButton).click();
    }

    public void clickInputButton() {
        webDriver.findElement(InputButton).click();
    }

}
