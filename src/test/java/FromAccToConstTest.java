import io.qameta.allure.junit4.DisplayName;
import model.pages.HomePage;
import model.pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FromAccToConstTest extends BaseTest {
    @Before
    public void registrationUser() {
        getUserPage().createUser(getUser());
    }

    @Test
    @DisplayName("Переход по клику на «Конструктор»")
    public void checkTransitionFromPersonalAccountToConstructorByClickOnConstructor() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnPersonalAreaLink();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(getUser().getEmail(), getUser().getPassword());
        homePage.clickOnPersonalAreaLink();
        homePage.clickOnConstructorLink();
        Assert.assertTrue(getDriver().findElement(homePage.getConstructBurgerHeader()).isDisplayed());
    }

    @Test
    @DisplayName("Ппереход по клику на Stellar Burgers")
    public void checkTransitionFromPersonalAccountToConstructorByClickOnStellarBurgers() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnPersonalAreaLink();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(getUser().getEmail(), getUser().getPassword());
        homePage.clickOnPersonalAreaLink();
        homePage.clickOnStellarBurgersLogoLink();
        Assert.assertTrue(getDriver().findElement(homePage.getConstructBurgerHeader()).isDisplayed());
    }

}
