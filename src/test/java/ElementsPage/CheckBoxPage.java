package ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement CheckBox;
    WebElement home;
    WebElement result;



    public CheckBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHome() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.id("item-1"));
    }

    public WebElement getResult() {
        return driver.findElement(By.id("result"));
    }

    public void clickOnTextBox (){
        getCheckBox().click();
    }

    public void clickOnHomeButton(){
        getHome().click();
    }
    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


}
