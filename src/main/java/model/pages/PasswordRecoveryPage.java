package model.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage {
    private WebDriver driver;
    // локатор для "Вспомнили пароль?"
    private final By enterLink = By.xpath(".//p[text()='Вспомнили пароль?']/a[text()='Войти']");

    public PasswordRecoveryPage(WebDriver driver) {
        this.driver = driver;
    }

    // метод кликнуть на ссылку "Вспомнили пароль?"
    @Step("Клик на ссылку Вспомнили пароль?")
    public void clickOnEnterLinkOnForgotPasswordPage() {
        driver.findElement(enterLink).click();
    }

}
