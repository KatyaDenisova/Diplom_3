package model.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    // добавил поле driver
    private WebDriver webDriver;
    // локатор "Личный кабинет"
    private By personalAreaLink = By.xpath(".//p[text()='Личный Кабинет']");
    // локатор "Войти в аккаунт"
    private By enterAcountButton = By.xpath(".//button[text()='Войти в аккаунт']");
    // локатор "Конструктор"
    private final By constructorLink = By.xpath(".//p[text()='Конструктор']");
    // локатор логотипа Stellar Burgers
    private final By stellarBurgersLogoLink = By.xpath(".//div/header/nav/div/a");
    // локатор раздела Булки
    private final By bunsChapter = By.xpath(".//span[text()='Булки']");
    // локатор раздела Соусы
    private final By saucesChapter = By.xpath(".//span[text()='Соусы']");
    // локатор раздела Ингридиенты
    private final By ingredientsChapter = By.xpath(".//span[text()='Начинки']");
    // локатор заголовка Соберите бургер
    private final By constructBurgerHeader = By.xpath(".//h1[text()='Соберите бургер']");
    // локатор текста элемента
    private final By theChosenElement = By.className("tab_tab_type_current__2BEPc");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    // метод кликает на "Личный кабинет"
    @Step("Клик на Личный кабинет")
    public void clickOnPersonalAreaLink() {
        webDriver.findElement(personalAreaLink).click();
    }

    // метод кликает на кнопку "Войти в аккаунт"
    @Step("Клик на кнопку Войти в аккаунт")
    public void clickOnEnterAcountButton() {
        webDriver.findElement(enterAcountButton).click();
    }

    // метод кликает на "Конструктор"
    @Step("Клик на Конструктор")
    public void clickOnConstructorLink() {
        webDriver.findElement(constructorLink).click();
    }

    // метод кликает на лого Stellar Burgers
    @Step("Клик на лого Stellar Burgers")
    public void clickOnStellarBurgersLogoLink() {
        webDriver.findElement(stellarBurgersLogoLink).click();
    }

    // метод кликает на раздел "Булки"
    @Step("Клик на раздел Булки")
    public void clickOnBunsChapter() {
        webDriver.findElement(bunsChapter).click();
    }

    // метод кликает на раздел "Соусы"
    @Step("Клик на раздел Соусы")
    public void clickOnSaucesChapter() {
        webDriver.findElement(saucesChapter).click();
    }

    // метод кликает на раздел "Начинки"
    @Step("Клик на раздел Начинки")
    public void clickOnIngredientsChapter() {
        webDriver.findElement(ingredientsChapter).click();
    }

    // метод получить заголовок "Соберите бургер"
    @Step("Пполучить заголовок Соберите бургер")
    public By getConstructBurgerHeader() {
        return constructBurgerHeader;
    }

    // метод получить текст элемента
    @Step("Получить текст элемента")
    public String getTextFromTheChosenElement() {
        return webDriver.findElement(theChosenElement).getText();
    }
}
