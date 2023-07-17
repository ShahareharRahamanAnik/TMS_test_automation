package StepDefinitions;


import Core.Helper;
import POM.WebElements;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AdditionsStepdefs {
    WebDriver driver;
    WebElements Web;
    @Given("Enter the Website")
    public void enterTheWebsite() {
        Helper hp = new Helper();
        driver = hp.chromeLaunch();
    }

    @When("Input {string} and {string} and log in")
    public void inputUserIDAndPasswordAndLogIn(String UserID,String Password) throws InterruptedException {
        Web.Verifications(UserID,Password);
    }

    @And("check out the Project list")
    public void checkOutTheProjectList() throws InterruptedException {
        Web.ProjectList();
    }

    @And("Click on add project")
    public void clickOnAddProject() throws InterruptedException {
        Web.setAddProject();
    }

    @And("Input Title {string} and {string} and {string} and submit")
    public void inputTitleBanglaAndEnglishAndDescriptionAndSubmit(String Bangla,String English, String Description) throws InterruptedException {
        Web.FillUp(Bangla,English,Description);
    }

    @And("Check list")
    public void checkList() throws InterruptedException {
        Web.Checklist();
    }

    @And("Click on SearchBar and input {string}")
    public void clickOnSearchBarAndInputEnglish(String English) throws InterruptedException {
        Web.Search(English);
    }

    @And("Click on Edit")
    public void clickOnEdit() throws InterruptedException {
        Web.Edition();
    }

    @And("Click on {string} and input something and Submit")
    public void clickOnDescriptionsAndInputSomethingAndSubmit(String Descriptions) throws InterruptedException {
        Web.DescriptionEdit(Descriptions);
    }

    @Then("Go to check list")
    public void goToCheckList() throws InterruptedException {
        Web.Recheck();
    }




}
