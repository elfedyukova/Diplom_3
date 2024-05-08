package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class ConstructorTest extends BaseUiTest {

    @Test
    @DisplayName("Переход к разделу Булки")
    public void goBuns() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickConstructorLink();

        boolean isDisplayed = mainPage.constructorBuns();
        assertEquals(isDisplayed, true);

        String expected = "Булки";
        String actual = mainPage.getBunsText();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Переход к разделу Соусы")
    public void goSauces() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickConstructorLink();

        boolean isDisplayed = mainPage.constructorSauces();
        assertEquals(isDisplayed, true);

        String expected = "Соусы";
        String actual = mainPage.getSaucesText();
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Переход к разделу Начинки")
    public void goIngredients() {

        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickConstructorLink();

        boolean isDisplayed = mainPage.constructorIngredients();
        assertEquals(isDisplayed, true);

        String expected = "Начинки";
        String actual = mainPage.getIngredientsText();
        assertEquals(expected, actual);

    }
}
