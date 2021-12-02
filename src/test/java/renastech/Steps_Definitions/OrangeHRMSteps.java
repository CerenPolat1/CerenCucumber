package renastech.Steps_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import renastech.utils.CommonUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.List;

public class OrangeHRMSteps {


    @Given("The user wants to go to orangeHRM application")
    public void the_user_wants_to_go_to_orange_hrm_application() {
        System.out.println("This is a Login Step");
        Driver.getDriver().get("https://renastech-osondemand.orangehrm.com");
        CommonUtils.hardWait(2000);
    }

    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {
        System.out.println("Enter your username and Password");


        WebElement username = Driver.getDriver().findElement(By.id("txtUsername"));
        WebElement password = Driver.getDriver().findElement(By.id("txtPassword"));

        username.sendKeys("Admin");
        password.sendKeys("Mv@UE0@dR3f@");

    }


    @Then("The user wants to click login")
    public void the_user_wants_to_click_login() {
        System.out.println("Click Login Button");

        WebElement loginButton = Driver.getDriver().findElement(By.id("btnLogin"));
        loginButton.click();
    }


    @Then("The user should be able to navigate dashboard")
    public void the_user_should_be_able_to_navigate_dashboard() {
        System.out.println("The user should be able to see dashboard");


        WebElement dashboard = Driver.getDriver().findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));

        CommonUtils.hardWait(5000);
        Assert.assertTrue(dashboard.isDisplayed());

        //Driver.getDriver().close();


    }


    @When("The user wants to enter username as {string} and the password as {string}")
    public void the_user_wants_to_enter_username_as_and_the_password_as(String username, String password) {
        //bu yazilari OrangeHRM.feature'i run ettgiimizde concole'dan aldik parameterlar nasil geldi?
        //When kismina "admin" ve "admin123" yazdigimizda onlari parameter olarak aldi. biz sadece Strinlerin ismini degistik
        //boylelikle (String username, String password) ulasmis olduk
        // double quotation'i String olarak kabul eder

        System.out.println("This is a username:  " + username);
        System.out.println("This is a password:  " + password);
        CommonUtils.hardWait(3000);

        WebElement userNAME = Driver.getDriver().findElement(By.id("txtUsername"));
        WebElement passWORD = Driver.getDriver().findElement(By.id("txtPassword"));

        userNAME.sendKeys(username);
        passWORD.sendKeys(password);
    }

    @And("The user id should be {int}")
    public void the_user_id_should_be(Integer employeeID) { //bunu And The user id number should be 1568.5'dan aldi
        //yani And kisminda yazdigimiz rakimi int olarak aldi

    }

    @Then("The user id number should be {double}")
    public void the_user_id_should_be(Double employeeID) {

    }


    @Then("The user wants to go to PIM page")
    public void the_user_wants_to_go_to_pim_page() {

        WebElement pimpage=Driver.getDriver().findElement(By.xpath("//a[@id='menu_pim_viewPimModule']//b"));
        pimpage.click();
        CommonUtils.hardWait(2000);
    }

    @Then("The user wans to see Add Employee page")
    public void the_user_wans_to_see_add_employee_page() {

        WebElement addEmployee=Driver.getDriver().findElement(By.xpath("//a[.='Add Employee']"));
        addEmployee.click();
        CommonUtils.hardWait(2000);
    }

    @Then("The user wants to add an user name as {string}")
    public void the_user_wants_to_add_an_user_name_as(String name) {
        WebElement usernamBox=Driver.getDriver().findElement(By.id("firstName"));
        usernamBox.sendKeys(name);
        CommonUtils.hardWait(2000);
    }


    @Then("The user wants to add last name as {string}")
    public void the_user_wants_to_add_last_name_as(String lastname) {

        WebElement lastName=Driver.getDriver().findElement(By.name("lastName"));
        lastName.sendKeys(lastname);
        CommonUtils.hardWait(2000);
    }


    @Then("The user wants to save the information")
    public void the_user_wants_to_save_the_information() {

    WebElement saveButton=Driver.getDriver().findElement(By.id("btnSave"));
    saveButton.click();
        CommonUtils.hardWait(2000);
    }


    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String HeaderText) {

        WebElement headerrText=Driver.getDriver().findElement(By.xpath("//h1[.='Personal Details']"));
        Assert.assertEquals(headerrText.getText(),HeaderText);
        Driver.getDriver().close();
    }


    //yukaridaki then, and'lerin sirasi fark etmez onemli olan feature'daki sira

 //bu yazilari OrangeHRM.feature'i run ettgiimizde concole'da cikan stepleri copy paste ettik ve
    //daha sonra buraya paste ettikten sonra and then  when'leri import ettik utlerine tiklayarak


    //ilk package olusturmak istedigimizde ise java'nin usutune geliyoruz -> new-> package
    //renastech'in altindaki package'lari olusturmak icin renasytech'in uzerine gelip -> new-> package
    //2.ve 3. package icin yine renaastech'in ustune gel ayni stepler fakat bu sefer
    //ornegin renastech.runner yaziyor bu cunku ilk pacgake oldugundan boyle, sadece runner yazan yeri sil yeni ismi yaz
    //boylelikle yeni pacgake olusturmus oluyorsun

    @Given("The user wants to go to login")
    public void the_user_wants_to_go_to_login() {

//https://renastech-osondemand.orangehrm.com/symfony/web/index.php/dashboard

        Driver.getDriver().get("https://renastech-osondemand.orangehrm.com/");
        CommonUtils.hardWait(2000);
        WebElement username = Driver.getDriver().findElement(By.id("txtUsername"));
        WebElement password = Driver.getDriver().findElement(By.id("txtPassword"));

        username.sendKeys(ConfigurationsReader.getProperty("username")); //comes from configurationreader's method
        password.sendKeys(ConfigurationsReader.getProperty("password"));
        CommonUtils.hardWait(3000);

//        WebElement loginButton = Driver.getDriver().findElement(By.id("btnLogin"));
//        loginButton.click();

    }

    @Then("The user wants to navigate recruitment")
    public void the_user_wants_to_navigate_recruitment() {
        CommonUtils.hardWait(2000);
        WebElement recruitment = Driver.getDriver().findElement(By.id("menu_recruitment_viewRecruitmentModule"));
        CommonUtils.clickWithWait(recruitment);


    }
    @Then("The user wants to see candidates")
    public void the_user_wants_to_see_candidates() {
        WebElement candidates = Driver.getDriver().findElement(By.id("menu_recruitment_viewCandidates"));
        CommonUtils.clickWithWait(candidates);
    }
    @Then("The user wants to add a candidate")
    public void the_user_wants_to_add_a_candidate() {
        WebElement add = Driver.getDriver().findElement(By.id("btnAdd"));
        CommonUtils.clickWithWait(add);
    }
    @Then("The user wants to enter first name as {string} and last name as {string}")
    public void the_user_wants_to_enter_first_name_as_and_last_name_as(String firstName, String lastName) {
        WebElement name = Driver.getDriver().findElement(By.id("addCandidate_firstName"));
        name.sendKeys(firstName);
        CommonUtils.hardWait(1000);
        WebElement lName = Driver.getDriver().findElement(By.id("addCandidate_lastName"));
        lName.sendKeys(lastName);
        CommonUtils.hardWait(1000);

    }
    @Then("The user wants to enter email as {string}")
    public void the_user_wants_to_enter_email_as(String email) {
        WebElement emailBox=Driver.getDriver().findElement(By.id("addCandidate_email"));
        emailBox.sendKeys(email);
        CommonUtils.hardWait(1000);
    }
    @Then("The user wants to Consent to keep data")
    public void the_user_wants_to_consent_to_keep_data() {
        WebElement consentBox=Driver.getDriver().findElement(By.id("addCandidate_consentToKeepData"));
        CommonUtils.clickWithWait(consentBox);
    }
    @Then("The user wants to save")
    public void the_user_wants_to_save() {
        WebElement saveBox=Driver.getDriver().findElement(By.id("btnSave"));
        CommonUtils.clickWithWait(saveBox);
    }
    @Then("The user wants to verify that the user is created")
    public void the_user_wants_to_verify_that_the_user_is_created() {
        CommonUtils.hardWait(3000);
        WebElement expected = Driver.getDriver().findElement(By.id("resultTable"));
        Assert.assertTrue(expected.isDisplayed());
        Driver.getDriver().close();
    }


    }



