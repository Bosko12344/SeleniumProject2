package ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement textBox;
    WebElement fullName;
    WebElement Email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submit;
    WebElement message;

    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]"));
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmit() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
    }

    public void clickOnTextBox (){
        getTextBox().click();
    }
    public void insertFullName (String fullName) {
        getFullName().sendKeys(fullName);
    }
    public void insertEmail (String email){
        getEmail().sendKeys(email);
    }
    public void insertCurrentAddress(String currentAddres){
        getCurrentAddress().sendKeys(currentAddres);
    }
    public void insertPermanentAddress(String permanentAddress){
        getPermanentAddress().sendKeys(permanentAddress);
    }
    public void clickOnSubmit(){
        getSubmit().click();
    }

}
