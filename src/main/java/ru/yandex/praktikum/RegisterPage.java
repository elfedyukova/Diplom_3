package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    private By NameButton = By.xpath("//fieldset[1]//div[1]//div[1]//input[1]");
    private By EmailButton = By.xpath("//fieldset[2]//div[1]//div[1]//input[1]");
    private By PasswordButton = By.xpath("//input[@name='Пароль']");
    private By RegistersButton = By.xpath("//*[@id=\"root\"]/div/main/div/form/button");

    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterName(String text) {
        webDriver.findElement(NameButton).sendKeys(text);
    }

    public void enterEmail(String text) {
        webDriver.findElement(EmailButton).sendKeys(text);
    }

    public void enterPassword(String text) {
        webDriver.findElement(PasswordButton).sendKeys(text);
    }

    public void clickRegistersButton() {
        webDriver.findElement(RegistersButton).click();
    }

    public void clickInputButton() {
    }
}
