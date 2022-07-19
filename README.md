# Проект по автоматизации тестирования API на сайте - reqres.in.
> <a target="_blank" href="https://reqres.in/">Ссылка на страницу сайта</a>

###  Содержание:

- [Технологии и инструменты](#techno-технологии-и-инструменты)
- [Сборка в Jenkins](#jenkins-Jenkins-job)
- [Allure отчет](#report-Allure-отчет)
- [Интеграция с Allure TestOps](#Allure-TestOPS)
- [Отчет в Telegram](#telegram-Уведомление-в-Telegram-при-помощи-бота)

<a name="techno-технологии-и-инструменты"></a>
## Технологии и инструменты:

<p align="center">
<img width="8%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="8%" title="Java" src="images/logo/Java.svg">
<img width="8%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="8%" title="Selenide" src="images/logo/Selenide.svg">
<img width="8%" title="Gradle" src="images/logo/Gradle.svg">
<img width="8%" title="GitHub" src="images/logo/GitHub.svg">
<img width="8%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="8%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="8%" title="Allure Report" src="images/logo/AllureTestOps.svg">
<img width="8%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :arrow_forward: Запуск из терминала
Локальный запуск:
```
gradle clean test
```

<a name="jenkins-Jenkins-job"></a>
###   Сборка в Jenkins
### <img width="6%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/api_tests_diplom/)
*Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать сейчас*</strong></code>*

<p align="center">
  <img src="images/screens/Jenkins.png" alt="job" width="900">
</p>

<a name="report-Allure-отчет"></a>
## <img width="3%" title="Jenkins" src="images/logo/Allure_Report.svg"> Отчёт [Allure Reports](https://jenkins.autotests.cloud/job/api_tests_diplom/5/allure/)
<p align="center">
  <img src="images/screens/AllureReport.png" alt="job" width="900">
</p>

<p align="center">
  <img src="images/screens/AllureReport2.png" alt="job" width="900">
</p>

<a name="Allure-TestOPS"></a>
### <img width="4%" title="Allure TestOPS" src="images/logo/AllureTestOps.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/14588)
<p align="center">
  <img src="images/screens/AllureTestOps.png" alt="job" width="800">
</p>

<p align="center">
  <img src="images/screens/AllureTestOps2.png" alt="job" width="800">
</p>

<a name="telegram-Уведомление-в-Telegram-при-помощи-бота"></a>
### <img width="6%" title="Jenkins" src="images/logo/Telegram.svg"> Отчет в Telegram

<p align="center">
  <img src="images/screens/telegram.png" alt="job" width="600">
</p>