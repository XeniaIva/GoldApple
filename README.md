# Проект по автоматизации тестирования интернет-магазина "Золотое яблоко" 
<p align="center"><img width="50%" title="Gold Apple" src="images/zya-1920-1.png"></p>

## Содержание
- [Использованный стек технологий](#computer-использованный-стек-технологий)
- [Реализованные проверки](#scroll-реализованные-проверки)
- [Запуск тестов](#running_woman-запуск-тестов)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
- [Видео пример прохождения теста](#-видео-пример-прохождения-таста)

## Использованный стек технологий

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/Java.svg">
<img width="6%" title="Selenide" src="images/Selenide.svg">
<img width="6%" title="Selenoid" src="images/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/Gradle.svg">
<img width="6%" title="JUnit5" src="images/JUnit5.svg">
<img width="6%" title="GitHub" src="images/GitHub.svg">
<img width="6%" title="Jenkins" src="images/Jenkins.svg">
<img width="6%" title="Telegram" src="images/Telegram.svg">
</p>

## Реализованные проверки

- Проверка смены текущего города на Екатеринбург.
- Проверка заголовка пустой корзины.
- Проверка открытия формы авторизации при открытии вкладки вишлист.
- Проверка открытия формы авторизации при открытии вкладки профиля.
- Проверка видимости строки поиска.

## Запуск тестов

### Локальный запуск тестов
С параметрами по умолчанию
```
gradle clean test
```

### Запуск тестов удаленно

```
clean test
-Dbrowser_name=${BROWSER_NAME}
-Dbrowser_version=${BROWSER_VERSION}
-Dbrowser_size=${BROWSER_SIZE}
-Dselenide.remote=${REMOTE_BROWSER_URL}
```
## <img width="4%" style="vertical-align:middle" title="Jenkins" src="images/Jenkins.svg"> Сборка в Jenkins
Ссылка на сборку https://jenkins.autotests.cloud/job/GoldApple
<p align="center">
<img title="Jenkins Build" src="images/jenkins.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="images/Allure_Report.svg"> Пример Allure-отчета
<p align="center">
<img title="Allure" src="images/allure.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Telegram" src="images/Telegram.svg"> Уведомления в Telegram с использованием бота
<p align="center">
<img title="Telegram" src="images/tg.png">
</p>

## Видео пример прохождения теста

<p align="center">
  <img title="Video" src="images/1.gif">
</p>
