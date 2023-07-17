package POM;

//import com.sun.xml.internal.ws.resources.UtilMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebElements {
    WebDriver driver;

    public WebElements(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    By ID = By.xpath("(//input)[1]");
    By Pass = By.xpath("(//input)[2]");
    By login = By.xpath("//button");
    By Project = By.xpath("//span[@class=\"mat-content ng-tns-c125-112\"]");
    By Project_list = By.xpath("(//span[@class=\"mat-list-item-content\"])[4]");
    By AddProject = By.xpath("//button[@class=\"mat-focus-indicator mat-icon-button mat-button-base\"]");
    By TitleBangla = By.xpath("(//input)[1]");
    By TitleEnglish = By.xpath("(//input)[2]");
    By Description = By.xpath("//textarea");
    By Submit = By.xpath("//button[@class=\"mat-focus-indicator btn-app mat-flat-button mat-button-base mat-primary\"]");
    By CheckList = By.xpath("//button[@class=\"mat-focus-indicator btn-app mat-flat-button mat-button-base mat-warn\"]");
    By SearchBox = By.xpath("//input[@class=\"form-control ng-pristine ng-valid ng-touched\"]");
    By Edit = By.xpath("(//button[@class=\"mat-focus-indicator mat-tooltip-trigger button-margin mat-stroked-button mat-button-base mat-basic ng-star-inserted\"])[2]");
    By EditedDescription = By.xpath("//textarea");
    By Resubmit = By.xpath("//button[@class=\"mat-focus-indicator btn-app mat-flat-button mat-button-base mat-primary\"]");
    By ReChecklist = By.xpath("//button[@class=\"mat-focus-indicator btn-app mat-flat-button mat-button-base mat-warn\"]");
public void Verifications(String uID, String Ps ) throws InterruptedException {
    driver.findElement(ID).sendKeys(uID);
    driver.findElement(Pass).sendKeys(Ps);
    Thread.sleep(2000);
    driver.findElement(login).click();
}
public void ProjectList() throws InterruptedException {
    driver.findElement(Project).click();
    Thread.sleep(2000);
    driver.findElement(Project_list).click();
}
public void setAddProject() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(AddProject).click();
}
public void FillUp(String b, String e, String d) throws InterruptedException{
    driver.findElement(TitleBangla).sendKeys(b);
    Thread.sleep(2000);
    driver.findElement(TitleEnglish).sendKeys(e);
    Thread.sleep(2000);
    driver.findElement(Description).sendKeys(d);
    Thread.sleep(4000);
    driver.findElement(Submit).click();
}
public void Checklist() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(CheckList).click();
}
public void Search(String e) throws InterruptedException {
    driver.findElement(SearchBox).sendKeys(e);
    Thread.sleep(2000);
    driver.findElement(SearchBox).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
}
public void Edition() throws InterruptedException {
    driver.findElement(Edit).click();
    Thread.sleep(2000);
}
public void DescriptionEdit(String d) throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //Scroll down till the bottom of the page
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    Thread.sleep(2000);
    driver.findElement(EditedDescription).sendKeys(d);
    Thread.sleep(2000);
    driver.findElement(Resubmit).click();
}
public void Recheck() throws InterruptedException {
    Thread.sleep(2000);
    driver.findElement(ReChecklist).click();
}
}

