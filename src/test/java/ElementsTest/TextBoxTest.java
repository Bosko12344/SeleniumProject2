package ElementsTest;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {



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
            textBoxPage.clickOnTextBox();
            textBoxPage.insertFullName("Bosko");
            textBoxPage.insertEmail("b@gmail.com");
            textBoxPage.insertCurrentAddress("aa");
            textBoxPage.insertPermanentAddress("sss");
            scrollIntoView(textBoxPage.getSubmit());
            textBoxPage.clickOnSubmit();
    Assert.assertTrue(textBoxPage.getMessage().isDisplayed());

}

}
