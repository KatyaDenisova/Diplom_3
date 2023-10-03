package model.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;
    // локатор для поля "Имя"
    private final By nameField = By.xpath(".//form/fieldset[1]/div/div/input");
    // локатор для поля "Email"
    private final By emailField = By.xpath(".//form/fieldset[2]/div/div/input");
    // локатор для поля "пароль"
    private final By passwordField = By.xpath(".//form/fieldset[3]/div/div/input");
    // локатор для кнопки "Зарегистрироваться"
    private final By registrationButton = By.xpath(".//button[text()='Зарегистрироваться']");
    // локатор текста ошибки "Некорректный пароль"
    private final By incorrectPassword = By.xpath(".//p[text()='Некорректный пароль']");
    // локатор для кнопки "Войти"
    private final By signInButton = By.xpath(".//a[text()='Войти']");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // метод кликает на поле "Имя" и вводит новое значение
    @Step("Клик на поле Имя и ввод нового значения")
    public void setNameField(String name) {
        driver.findElement(nameField).click();
        driver.findElement(nameField).sendKeys(name);
    }

    // метод кликает на поле "Email" и вводит новое значение
    @Step("Клик на поле Email и вводит новое значения из параметра")
    public void setEmailField(String email) {
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(email);
    }

    // метод кликает на поле "Пароль" и вводит новое значение
    @Step("Клик на поле Пароль и вводит новое значения из параметра")
    public void setPasswordField(String password) {
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(password);
    }

    // метод кликает на кнопку "Зарегистрироваться"
    @Step("Клик на кнопку Зарегистрироваться")
    public void clickOnRegistrationButton() {
        driver.findElement(registrationButton).click();
    }

    // метод регистрации нового пользователя
    @Step("Регистрация нового пользователя")
    public void registrationUser(String name, String email, String password) {
        setNameField(name);
        setEmailField(email);
        setPasswordField(password);
        clickOnRegistrationButton();
    }

    // метод кликает на кнопку "Войти" на странице регистрации
    @Step("Клик на кнопку Войти на странице регистрации")
    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    // метод получить текст ошибки "Некорректный пароль"
    @Step("Получить текст ошибки Некорректный пароль")
    public By getIncorrectPassword() {
        return incorrectPassword;
    }
}
