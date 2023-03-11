package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By RegisterButton = By.xpath("//*[@id=\"root\"]/div/main/div/div/p[1]/a");
    private By EmailButton = By.xpath("//*[@id=\"root\"]/div/main/div/form/fieldset[1]/div/div/input");
    private By PasswordButton = By.xpath("//*[@id=\"root\"]/div/main/div/form/fieldset[2]/div/div/input");
    private By InputButton = By.xpath("//*[@id=\"root\"]/div/main/div/form/button");
    private By ResetButton = By.xpath("//*[@id=\"root\"]/div/main/div/div/p[2]/a");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickRegisterButton() {
        webDriver.findElement(RegisterButton).click();
    }


    public void enterEmail(String text) {
        webDriver.findElement(EmailButton).sendKeys(text);
    }

    public void enterPassword(String text) {
        webDriver.findElement(PasswordButton).sendKeys(text);
    }

    public void clickInputButton() {
        webDriver.findElement(InputButton).click();
    }

    public void clickResetButton() {
        webDriver.findElement(ResetButton).click();
    }
}
