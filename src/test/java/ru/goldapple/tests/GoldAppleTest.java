package ru.goldapple.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.goldapple.pages.MainPageSteps;

public class GoldAppleTest {

    MainPageSteps steps = new MainPageSteps();
    String city = "Екатеринбург";

    @Test
    @DisplayName("Проверка смены текущего города на Екатеринбург")
    void checkCityChange(){
        steps.openMainPage();
        steps.clickCity();
        steps.changeCity(city);
        steps.checkCity(city);
    }

    @Test
    @DisplayName("Проверка заголовка пустой корзины")
    void checkCartTitle(){
        steps.openMainPage();
        steps.clickCart();
        steps.checkCartText();
    }

    @Test
    @DisplayName("Проверка открытия формы авторизации при открытии вкладки вишлист")
    void checkWishListOpen(){
        steps.openMainPage();
        steps.clickWishList();
        steps.checkLoginText();
    }

    @Test
    @DisplayName("Проверка открытия формы авторизации при открытии вкладки профиля")
    void checkProfileOpen(){
        steps.openMainPage();
        steps.clickProfile();
        steps.checkLoginText();
    }

    @Test
    @DisplayName("Проверка видимости строки поиска")
    void checkSearchText(){
        steps.openMainPage();
        steps.clickSearch();
        steps.checkSearchVisible();
    }
}
