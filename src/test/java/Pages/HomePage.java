package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement Elements;
    List<WebElement> lista;



    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    /*List<WebElement> patientNinja = driver.findElements(By.className("woocommerce-loop-product__title"));
        for (int i = 0 ; i < patientNinja.size(); i++) {
            if (patientNinja.get(i).getText().equals("Patient Ninja")) {
                patientNinja.get(i).click();
                break;
            }
        }*/
   /* public void clickOnElementsBox () {
        List<WebElement> elementsBox = driver.findElements(By.xpath(""));
    for (int i = 0; i<elementsBox.size(); i++){
        if (elementsBox.get(i).getText().equals("Elements")){
            elementsBox.get(i).click();
            break;
        }
    }
    }*/

    public List<WebElement> getLista() {
        return driver.findElements(By.xpath("//div[@class='card-body']//h5"));
    }

    public WebElement getElements() {
       WebElement element = null;
       for (int i = 0; i<getLista().size(); i++){
           if (getLista().get(i).getText().equals("Elements")){
               element=getLista().get(i);
               break;
           }
       }
       return element;
    }
    public void clickOnElements(){
        getElements().click();
    }
}
