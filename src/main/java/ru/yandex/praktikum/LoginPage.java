package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By RegisterButton = By.xpath("//a[contains(text(),'Зарегистрироваться')]");
    private By EmailButton = By.xpath("//input[@name='name']");
    private By PasswordButton = By.xpath("//input[@name='Пароль']");
    private By InputButton = By.xpath("//button[contains(text(),'Войти')]");
    private By ResetButton = By.xpath("//a[contains(text(),'Восстановить пароль')]");
    private By ConstructorButton = By.xpath("//p[contains(text(),'Конструктор')]");
    private By ConstructorText = By.xpath("//h1[contains(text(),'Соберите бургер')]");
    private By LogoButton = By.cssSelector("svg");

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

    public String getInputText() {
        String text = webDriver.findElement(InputButton).getText();
        return text;
    }

    public boolean findElement() {
        return webDriver.findElement(InputButton).isDisplayed();
    }

    public boolean constructorPage() {
        return webDriver.findElement(ConstructorText).isDisplayed();
    }

    public void clickConstructorButton() {
        webDriver.findElement(ConstructorButton).click();
    }

    public String getConstructorText() {
        String text = webDriver.findElement(ConstructorText).getText();
        return text;
    }

    public void clickLogoButton() {
        webDriver.findElement(LogoButton).click();
    }
}
