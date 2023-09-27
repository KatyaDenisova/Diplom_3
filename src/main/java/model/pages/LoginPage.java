package model.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    // локатор "Зарегистрироваться"
    private final By registrationLink = By.xpath(".//a[text()='Зарегистрироваться']");
    // локатор ввода имени
    private final By emailField = By.xpath(".//form/fieldset[1]/div/div/input");
    // локатор ввода пароля
    private final By passwordField = By.xpath(".//form/fieldset[2]/div/div/input");
    // локатор для кнопки "Войти"
    private final By enterButton = By.xpath(".//button[text()='Войти']");
    // локатор "Восстановить пароль"
    private final By restorePasswordLink = By.xpath(".//a[text()='Восстановить пароль']");
    // локатор
    private final By logo = By.xpath(".//h2[text()='Вход']");
    // локатор для кнопки "Выход"
    private final By logoutButton = By.xpath(".//button[text()='Выход']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // метод кликает на ссылку "Зарегистрироваться"
    @Step("Клик на ссылку Зарегистрироваться")
    public void clickOnRegistrationLink() {
        driver.findElement(registrationLink).click();
    }

    // метод кликает на поле "Email" и вводит новое значения из параметра
    @Step("Клик на поле Email и вводит новое значения из параметра")
    public void enterEmail(String email) {
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(email);
    }

    // метод кликает на поле "Пароль" и вводит новое значения из параметра
    @Step("Клик на поле Пароль и вводит новое значения из параметра")
    public void enterPassword(String password) {
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(password);
    }

    // метод кликает на кнопку "Войти"
    @Step("Клик на кнопку Войти")
    public void clickOnEnterButton() {
        driver.findElement(enterButton).click();
    }

    // метод кликает на ссылку "Восстановить пароль"
    @Step("Клик на ссылку Восстановить пароль")
    public void clickOnRestorePasswordLink() {
        driver.findElement(restorePasswordLink).click();
    }

    // метод для логина пользователя и клик на кнопку "Войти"
    @Step("Логин пользователя и клик на кнопку Войти")
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickOnEnterButton();
    }

    @Step("Получить заголовок Вход для проверки")
    public By getLogo() {
        return logo;
    }

    // метод для выхода из Личного кабинета
    @Step("Выйти из личного кабинета")
    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }
}
