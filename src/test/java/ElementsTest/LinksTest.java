package ElementsTest;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {
    @BeforeMethod
    public void pageSetup() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    /*@Test
    public void testLinks() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        linksPage.clickOnLinksButton();
        linksPage.clickOnHomeButton();
        linksPage.clickOnHomeytxOfButton();
        linksPage.clickOnCreatedButton();
        linksPage.clickOnNoContentButton();
        linksPage.clickOnMovedButton();
        linksPage.clickOnBadRequestButton();
        linksPage.clickOnUnauthorizedButton();
        linksPage.clickOnForbiddenButton();
        linksPage.clickOnNotFoundButton();
    }*/

    @Test
    public void clickOnCreatedButonTest() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        linksPage.clickOnLinksButton();
        linksPage.clickOnCreatedButton();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.message().isDisplayed());
        Assert.assertEquals(linksPage.message().getText(), "Link has responded with staus 201 and status text Created");
    }

    @Test
    public void clickOnNoContentButtonTes() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        linksPage.clickOnLinksButton();
        linksPage.clickOnNoContentButton();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.message().isDisplayed());
        Assert.assertEquals(linksPage.message().getText(), "Link has responded with staus 204 and status text No Content");
    }

    @Test
    public void clickOnMovedButtonTest() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        linksPage.clickOnLinksButton();
        linksPage.clickOnMovedButton();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.message().isDisplayed());
        Assert.assertEquals(linksPage.message().getText(), "Link has responded with staus 301 and status text Moved Permanently");
    }

    @Test
    public void clickOnBadRequestButtonTest() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        linksPage.clickOnLinksButton();
        linksPage.clickOnBadRequestButton();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.message().isDisplayed());
        Assert.assertEquals(linksPage.message().getText(), "Link has responded with staus 400 and status text Bad Request");
    }

    @Test
    public void clickOnUnauthorizedButtonTest() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        linksPage.clickOnLinksButton();
        linksPage.clickOnUnauthorizedButton();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.message().isDisplayed());
        Assert.assertEquals(linksPage.message().getText(), "Link has responded with staus 401 and status text Unauthorized");
    }

    @Test
    public void clickOnForbiddendButtonTest() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        linksPage.clickOnLinksButton();
        linksPage.clickOnForbiddenButton();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.message().isDisplayed());
        Assert.assertEquals(linksPage.message().getText(), "Link has responded with staus 403 and status text Forbidden");
    }

    @Test
    public void clickOnNotFoundButtonTest() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        linksPage.clickOnLinksButton();
        linksPage.clickOnNotFoundButton();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.message().isDisplayed());
        Assert.assertEquals(linksPage.message().getText(), "Link has responded with staus 404 and status text Not Found");
    }
}
