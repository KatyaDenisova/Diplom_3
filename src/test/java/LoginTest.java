import io.qameta.allure.junit4.DisplayName;
import model.pages.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Before
    public void registrationUser() {
        getUserPage().createUser(getUser());
    }

    @Test
    @DisplayName("Вход по кнопке Войти в аккаунт на главной")
    public void loginClickLoginButtonOnMainPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnEnterAcountButton();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(getUser().getEmail(), getUser().getPassword());
        homePage.clickOnPersonalAreaLink();
        AccountPage accountPage = new AccountPage(getDriver());
        Assert.assertTrue(getDriver().findElement(accountPage.getNameField()).isDisplayed());
    }

    @Test
    @DisplayName("Вход через кнопку Личный кабинет")
    public void loginClickPersonalAreaButton() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnPersonalAreaLink();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(getUser().getEmail(), getUser().getPassword());
        homePage.clickOnPersonalAreaLink();
        AccountPage accountPage = new AccountPage(getDriver());
        Assert.assertTrue(getDriver().findElement(accountPage.getNameField()).isDisplayed());
    }

    @Test
    @DisplayName("Вход через кнопку Ввод на странице регистрации")
    public void loginOnClickEnterButtonOnRegistrationPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnPersonalAreaLink();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnRegistrationLink();
        RegistrationPage registrationPage = new RegistrationPage(getDriver());
        registrationPage.clickSignInButton();
        loginPage.login(getUser().getEmail(), getUser().getPassword());
        homePage.clickOnPersonalAreaLink();
        AccountPage accountPage = new AccountPage(getDriver());
        Assert.assertTrue(getDriver().findElement(accountPage.getNameField()).isDisplayed());
    }

    @Test
    @DisplayName("Вход через кнопку в форме восстановления пароля")
    public void loginOnForgotPasswordPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnPersonalAreaLink();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnRestorePasswordLink();
        PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage(getDriver());
        passwordRecoveryPage.clickOnEnterLinkOnForgotPasswordPage();
        loginPage.login(getUser().getEmail(), getUser().getPassword());
        homePage.clickOnPersonalAreaLink();
        AccountPage accountPage = new AccountPage(getDriver());
        Assert.assertTrue(getDriver().findElement(accountPage.getNameField()).isDisplayed());
    }

}