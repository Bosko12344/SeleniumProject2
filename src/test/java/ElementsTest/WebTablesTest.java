package ElementsTest;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {
    @BeforeMethod
    public void pageSetup() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void addTest() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        webTablesPage.clickOnWebTables();
        webTablesPage.clickOnAdd();
        webTablesPage.insertFirstName("Bosko");
        webTablesPage.inserLastName("Djeric");
        webTablesPage.insertEmail("b@gmail.com");
        webTablesPage.insertAge("26");
        webTablesPage.insertSalary("1800");
        webTablesPage.insertDepartment("ITB");
        webTablesPage.clickOnSubmit();
        Assert.assertTrue(webTablesPage.getData().isDisplayed());

    }
    String firstNameExample= "Cierra";
    String lastName= "Djeric";
    @Test
    public void VerifyUserCanBeEdited() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        webTablesPage.clickOnWebTables();
        webTablesPage.getEdit(firstNameExample).click();
        webTablesPage.getLastName().clear();
        webTablesPage.editLastName(lastName);
        webTablesPage.clickOnSubmit();
        Assert.assertEquals(webTablesPage.getLastNameRenamed(firstNameExample).getText(),lastName);
    }
    @Test
    public void VerifyUserCanBeDeleted() throws InterruptedException {
        Thread.sleep(2000);
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        webTablesPage.clickOnWebTables();
        webTablesPage.getDelete(firstNameExample).click();
        Thread.sleep(2000);
        boolean check= false;
        Thread.sleep(1000);
        try {
            check=webTablesPage.getCiera().isDisplayed();
        }
        catch (Exception e){}
        Assert.assertFalse(check);
    }
















    /*@Test
    public void deleteTest(){
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
        webTablesPage.clickOnWebTables();
        webTablesPage.clickOnAdd();
        webTablesPage.insertFirstName("Bosko");
        webTablesPage.inserLastName("Djeric");
        webTablesPage.insertEmail("b@gmail.com");
        webTablesPage.insertAge("26");
        webTablesPage.insertSalary("1800");
        webTablesPage.insertDepartment("ITB");
        webTablesPage.clickOnSubmit();
        boolean check1 = false;
        try {
            check1 = webTablesPage.getEmail().isDisplayed();
        } catch (Exception e) {

        }
        Assert.assertFalse(check1);
    }*/

}