package ElementsTest;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {
    @BeforeMethod
    public void pageSetup() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void clickDoubleClick() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        buttonsPage.clickOnButtons();
        Thread.sleep(2000);
        buttonsPage.clickOnDoubleClick();
        Assert.assertTrue(buttonsPage.getDoubleClickMessage().isDisplayed());
    }
    @Test
    public void clickOnRightClick() throws InterruptedException {
        //Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        buttonsPage.clickOnButtons();
        Thread.sleep(2000);
        buttonsPage.clickOnRightClick();
        Assert.assertTrue(buttonsPage.getRightClickMessage().isDisplayed());
    }
    @Test
    public void clickOnClickMeTest() throws InterruptedException {
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        buttonsPage.clickOnButtons();
        Thread.sleep(2000);
        buttonsPage.clickOnClickMe();
        Assert.assertTrue(buttonsPage.getClickMeMessage().isDisplayed());
    }
}