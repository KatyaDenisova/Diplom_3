import io.qameta.allure.junit4.DisplayName;
import model.pages.HomePage;
import model.pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogoutTest extends BaseTest {
    @Before
    public void registrationUser() {
        getUserPage().createUser(getUser());
    }

    @Test
    @DisplayName("Выход по кнопке «Выйти» в личном кабинете")
    public void logoutFromPersonalArea() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnPersonalAreaLink();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(getUser().getEmail(), getUser().getPassword());
        homePage.clickOnPersonalAreaLink();
        loginPage.clickLogoutButton();
        Assert.assertTrue(getDriver().findElement(loginPage.getLogo()).isDisplayed());
    }
}
