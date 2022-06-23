package ElementsTest;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {
    @BeforeMethod
    public void pageSetup() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void radioButtonTest() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        radioButtonPage.getRadioButton().click();
        radioButtonPage.clickOnYesButton();
        radioButtonPage.clickOnImpresiveButton();
        Assert.assertTrue(radioButtonPage.message().isDisplayed());

    }
}
