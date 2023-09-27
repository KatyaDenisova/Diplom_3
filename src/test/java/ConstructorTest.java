import io.qameta.allure.junit4.DisplayName;
import model.pages.HomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorTest extends BaseTest {
    @Before
    public void registrationUser() {
        getUserPage().createUser(getUser());
    }

    @Test
    @DisplayName("Переход к разделу Булки")
    public void checkTransitionToBunsSection() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSaucesChapter();
        homePage.clickOnBunsChapter();
        Assert.assertEquals("Неверный текст! Должны быть Булки", "Булки", homePage.getTextFromTheChosenElement());
    }

    @Test
    @DisplayName("Переход к разделу Соусы")
    public void checkTransitionToSauceSection() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnSaucesChapter();
        Assert.assertEquals("Неверный текст! Должны быть Соусы", "Соусы", homePage.getTextFromTheChosenElement());
    }

    @Test
    @DisplayName("Переход к разделу Начинки")
    public void checkTransitionToIngredientsSection() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnIngredientsChapter();
        Assert.assertEquals("Неверный текст! Должны быть Начинки", "Начинки", homePage.getTextFromTheChosenElement());
    }

}
