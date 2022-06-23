package ElementsTest;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    @BeforeMethod
    public void pageSetup() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }
    @Test
    public void testElements () throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        checkBoxPage.clickOnTextBox();
        checkBoxPage.clickOnHomeButton();
        Assert.assertTrue(checkBoxPage.getResult().isDisplayed());
}
    }
