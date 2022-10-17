package ru.goldapple.pages;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;

public class MainPageSteps {
    private final static String LOGIN_TITLE_TEXT = "Войти или зарегистрироваться";
    private final static String CART_TITLE_TEXT = "В корзине ничего нет...";

    @Step("Открыть главную страницу")
    public MainPageSteps openMainPage(){
        open("https://goldapple.ru/");
        return this;
    }

    @Step("Кликнуть по городу")
    public void clickCity() {
        $(".header-city").click();
    }

    @Step("Кликнуть по профилю пользователя")
    public void clickProfile() {
        $(".header-tab-button_customer").click();
    }

    @Step("Кликнуть по корзине")
    public void clickCart() {
        $(".header-tab-button_minicart").click();
    }

    @Step("Кликнуть по вишлисту")
    public void clickWishList() {
        $(".header-tab-button_wishlist").click();
    }

    @Step("Кликнуть по поиску")
    public void clickSearch() {
        $(".header-tab-button_search").click();
    }

    @Step("Сменить город")
    public void changeCity(String city) {
        $(".city-selector__list").$(byText(city)).click();
    }

    @Step("Проверка города")
    public void checkCity(String city) {
        $(".header-city").shouldHave(text(city));
    }

    @Step("Проверка заголовка авторизации")
    public void checkLoginText() {
        $(".vertical-content__body").shouldHave(text(LOGIN_TITLE_TEXT));
    }

    @Step("Проверка заголовка пустой корзины")
    public void checkCartText() {
        $(".cart-title").shouldHave(text(CART_TITLE_TEXT));
    }

    @Step("Проверка заголовка поиска")
    public void checkSearchVisible() {
        $(".search-field__textarea-wr").shouldBe(visible);
    }
}
