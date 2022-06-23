package ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage {
    WebDriver driver;
    WebDriverWait wdwait;


    WebElement linksButton;
    WebElement homeButton;
    WebElement homeytxOfButton;
    WebElement created;
    WebElement noContent;
    WebElement moved;
    WebElement badRequest;
    WebElement unauthorized;
    WebElement forbidden;
    WebElement notFound;
    WebElement message;

   /* WebElement noContentMessage;
    WebElement movedMessage;
    WebElement badRequestMessage;
    WebElement unauthorizedMessage;
    WebElement forbiddenMessage;
    WebElement notFoundMessage;*/

    public LinksPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public WebElement getLinksButton() {
        return driver.findElement(By.id("item-5"));
    }

    public WebElement getHomeButton() {
        return driver.findElement(By.id("simpleLink"));
    }

    public WebElement getHomeytxOfButton() {
        return driver.findElement(By.id("dynamicLink"));
    }

    public WebElement getCreated() {
        return driver.findElement(By.id("created"));
    }

    public WebElement getNoContent() {
        return driver.findElement(By.id("no-content"));
    }

    public WebElement getMoved() {
        return driver.findElement(By.id("moved"));
    }

    public WebElement getBadRequest() {
        return driver.findElement(By.id("bad-request"));
    }

    public WebElement getUnauthorized() {
        return driver.findElement(By.id("unauthorized"));
    }

    public WebElement getForbidden() {
        return driver.findElement(By.id("forbidden"));
    }

    public WebElement getNotFound() {
        return driver.findElement(By.id("invalid-url"));
    }

    public WebElement getCreatedMessage() {
        return driver.findElement(By.id("linkResponse"));
    }

    public WebElement message() {
        return driver.findElement(By.id("linkResponse"));
    }

   /* public WebElement getMovedMessage() {
        return movedMessage;
    }

    public WebElement getBadRequestMessage() {
        return badRequestMessage;
    }

    public WebElement getUnauthorizedMessage() {
        return unauthorizedMessage;
    }

    public WebElement getForbiddenMessage() {
        return forbiddenMessage;
    }

    public WebElement getNotFoundMessage() {
        return notFoundMessage;
    }
*/
    public void clickOnLinksButton (){
        getLinksButton().click();
    }
    public void clickOnHomeButton(){
        getHomeButton().click();
    }
    public void clickOnHomeytxOfButton(){
        getHomeytxOfButton().click();
    }
    public void clickOnCreatedButton(){getCreated().click();}
    public void clickOnNoContentButton(){getNoContent().click();}
    public void clickOnMovedButton(){getMoved().click();}
    public void clickOnBadRequestButton(){getBadRequest().click();}
    public void clickOnUnauthorizedButton(){getUnauthorized().click();}
    public void clickOnForbiddenButton(){getForbidden().click();}
    public void clickOnNotFoundButton(){getNotFound().click();}

}
