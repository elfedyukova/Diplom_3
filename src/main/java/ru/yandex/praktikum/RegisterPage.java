package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    private By NameButton = By.xpath("(//input[@name='name'])[1]");
    private By EmailButton = By.xpath("(//input[@name='name'])[2]");
    private By PasswordButton = By.xpath("//input[@name='Пароль']");
    private By RegistersButton = By.xpath("//button[contains(text(),'Зарегистрироваться')]");
    private By ErrorText = By.xpath("//p[@class='input__error text_type_main-default']");
    private By InputButton = By.xpath("//a[contains(text(),'Войти')]");

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
        webDriver.findElement(InputButton).click();
    }

    public String getErrorText() {
        webDriver.findElement(ErrorText).getText();
        String text = webDriver.findElement(ErrorText).getText();
        return text;
    }

    public boolean findElement() {
        return webDriver.findElement(ErrorText).isDisplayed();
    }
}