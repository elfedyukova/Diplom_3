package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private By PersonalButton = By.xpath("//p[contains(text(),'Личный Кабинет')]");
    private By InputButton = By.xpath("//button[contains(text(),'Войти в аккаунт')]");
    private By OrderButton = By.xpath("//button[contains(text(),'Оформить заказ')]");
    private By EnterButton = By.xpath("//h2[contains(text(),'Вход')]");
    private By ConstructorButton = By.xpath("//p[contains(text(),'Конструктор')]");
    private By BunsText = By.xpath("//h2[contains(text(),'Булки')]");
    private By SaucesButton = By.xpath("//span[contains(text(),'Соусы')]");
    private By SaucesText = By.xpath("//h2[contains(text(),'Соусы')]");
    private By IngredientsText = By.xpath("//h2[contains(text(),'Начинки')]");
    private By IngredientsButton = By.xpath("(//div)[4]");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickPersonalButton() {
        webDriver.findElement(PersonalButton).click();
    }

    public void clickInputButton() {
        webDriver.findElement(InputButton).click();
    }

    public boolean findElement() {
        return webDriver.findElement(OrderButton).isDisplayed();
    }

    public boolean findEnterElement() {
        return webDriver.findElement(EnterButton).isDisplayed();
    }

    public boolean findInputElement() {
        return webDriver.findElement(InputButton).isDisplayed();
    }

    public String getInputText() {
        String text = webDriver.findElement(OrderButton).getText();
        return text;
    }

    public String getEnterText() {
        String text = webDriver.findElement(EnterButton).getText();
        return text;
    }

    public String getInputButtonText() {
        String text = webDriver.findElement(InputButton).getText();
        return text;
    }

    public void clickConstructorLink() {
        webDriver.findElement(ConstructorButton).click();
    }

    public boolean constructorBuns() {
        return webDriver.findElement(BunsText).isDisplayed();
    }

    public String getBunsText() {
        String text = webDriver.findElement(BunsText).getText();
        return text;
    }

    public boolean constructorSauces() {
        return webDriver.findElement(SaucesButton).isDisplayed();
    }

    public String getSaucesText() {
        String text = webDriver.findElement(SaucesText).getText();
        return text;
    }

    public boolean constructorIngredients() {
        return webDriver.findElement(IngredientsButton).isDisplayed();
    }

    public String getIngredientsText() {
        String text = webDriver.findElement(IngredientsText).getText();
        return text;
    }
}