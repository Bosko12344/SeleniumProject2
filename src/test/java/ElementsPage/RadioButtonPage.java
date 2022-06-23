package ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement radioButton;
    WebElement yesRadioButton;
    WebElement impresiveRadioButton;
    WebElement messageWhenClickYesOrImpresive;



    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.id("item-2"));
    }

    public WebElement getYesRadioButton() {
        return driver.findElement(By.xpath("//label[@class='custom-control-label']"));
    }

    public WebElement getImpresiveRadioButton() {
        return driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
    }

    public WebElement message() {
        return driver.findElement(By.className("mt-3"));
    }



    public void clickOnYesButton(){
        getYesRadioButton().click();
    }
    public void clickOnImpresiveButton(){
        getImpresiveRadioButton().click();
    }
}
