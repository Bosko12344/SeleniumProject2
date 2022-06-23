package ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement button;
    WebElement doubleClick;
    WebElement rightClick;
    WebElement clickMe;
    WebElement doubleClickMessage;
    WebElement rightClickMessage;
    WebElement clickMeMessage;


    public ButtonsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getButton() {
        return driver.findElement(By.id("item-4"));
    }

    public WebElement getDoubleClick() {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement getRightClick() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public WebElement getClickMe() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
    }

    public WebElement getDoubleClickMessage() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getRightClickMessage() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getClickMeMessage() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    public void clickOnButtons(){
        getButton().click();
    }
    public void clickOnDoubleClick(){
        Actions action = new Actions(driver);
        action.doubleClick(getDoubleClick()).perform();
    }
    public void clickOnRightClick(){
        Actions action1 = new Actions(driver);
        action1.contextClick(getRightClick()).perform();
    }
    public void clickOnClickMe(){
        getClickMe().click();
    }

}
