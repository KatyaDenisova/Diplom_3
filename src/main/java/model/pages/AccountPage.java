package model.pages;

import io.qameta.allure.Step;
import model.user.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    private WebDriver driver;
    private User user = new User();
    private final By nameField = By.xpath(".//ul/li[1]/div/div/input");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Вернуть заголовок Имя")
    public By getNameField() {
        return nameField;
    }
}
