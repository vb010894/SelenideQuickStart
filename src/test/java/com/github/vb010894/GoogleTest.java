package com.github.vb010894;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

/**
 * <h1>Тест поиска Google</h1>
 */
public class GoogleTest {

    /**
     * <h1>Инициализация</h1>
     * <i>
     *     Открытие <a href='https://www.google.com/'>Страницы поиска Google</a>
     * </i>
     */
    @BeforeAll
    public static void init() {
        Selenide.open("https://www.google.com/");
    }

    /**
     * <h1>Поиск Github</h1>
     */
    @Test
    public void testSearch() {
        SelenideElement search = Selenide.$x(".//textarea[@title='Поиск']");
        search.sendKeys("Github");
        search.sendKeys(Keys.ENTER);
    }

}
