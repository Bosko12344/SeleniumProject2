package Base;

import ElementsPage.*;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomePage homePage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        wdwait=new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, wdwait);
        textBoxPage = new TextBoxPage(driver, wdwait);
        checkBoxPage = new CheckBoxPage(driver, wdwait);
        radioButtonPage = new RadioButtonPage(driver,wdwait);
        webTablesPage = new WebTablesPage(driver,wdwait);
        buttonsPage = new ButtonsPage(driver,wdwait);
        linksPage = new LinksPage(driver,wdwait);



    }
    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    @AfterClass
    public void tearDown() {
        /*driver.close();
        driver.quit();*/
    }
}

