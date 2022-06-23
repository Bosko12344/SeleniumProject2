package ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTablesPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement webTables;
    WebElement addButton;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    WebElement age;
    WebElement salary;
    WebElement department;
    WebElement submit;
    WebElement data;
    WebElement delete;
    List<WebElement> lista;
    WebElement edit;
    WebElement lastNameRenamed;
    WebElement ciera;
    WebElement lastNameEdit;




    public WebTablesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getWebTables() {
        return driver.findElement(By.id("item-3"));
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.xpath("//input[@id='firstName']"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.xpath("//input[@id='lastName']"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.xpath("//input[@id='userEmail']"));
    }

    public WebElement getAge() {
        return driver.findElement(By.xpath("//input[@id='age']"));
    }

    public WebElement getSalary() {
        return driver.findElement(By.xpath("//input[@id='salary']"));
    }

    public WebElement getDepartment() {
        return driver.findElement(By.xpath("//input[@id='department']"));
    }

    public WebElement getSubmit() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getData() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div"));
    }

    public WebElement getDelete(String firstName) {
        String id= "delete-record-";
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals(firstName)) {
                int indeks=i+1;
                id=id+indeks;
                break;

            }}
        return driver.findElement(By.id(id)) ;
    }
    public List<WebElement> getLista() {

        return driver.findElements(By.xpath("//div[@class='rt-td'][1]"));
    }

    public WebElement getEdit(String firstName) {
        String id = "edit-record-";
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals(firstName)) {
                int indeks=i+1;
                id=id+indeks;
                break;

            }}
        return driver.findElement(By.id(id)) ;
    }
    public WebElement getLastNameRenamed(String firstName) {

        String lastName2="//div[contains(text(), " + "'" + firstName +"')]/following-sibling::div[1]";
        return driver.findElement(By.xpath(lastName2));
    }

    public WebElement getCiera() {
        return driver.findElement(By.className("//*[contains(text(), 'Cierra')]"));
    }

    public WebElement getLastNameEdit() {
    return   driver.findElement(By.id("lastName"));
    }
public void editLastName(String lastName1){
        getLastNameEdit().sendKeys(lastName1);
}
    public void clickOnWebTables(){
        getWebTables().click();
    }
    public void clickOnAdd(){
        getAddButton().click();
    }
    public void insertFirstName(String firstName){
        getFirstName().sendKeys(firstName);
    }
    public void inserLastName(String lastName){
        getLastName().sendKeys(lastName);
    }
    public void insertEmail(String email){
        getEmail().sendKeys(email);
    }
    public void insertAge(String age){
        getAge().sendKeys(age);
    }
    public void insertSalary(String salary){
        getSalary().sendKeys(salary);
    }
    public void insertDepartment(String department){
        getDepartment().sendKeys(department);
    }
    public void clickOnSubmit(){
        getSubmit().click();
    }

}
