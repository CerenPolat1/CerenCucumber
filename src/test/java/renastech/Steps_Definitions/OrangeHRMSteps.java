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
import java.util.Map;

public class OrangeHRMSteps {


    @Given("The user wants to go to orangeHRM application")
    public void the_user_wants_to_go_to_orange_hrm_application() {
        System.out.println("This is a Login Step");
        Driver.getDriver().get("https://renastech-osondemand.orangehrm.com/");
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
        CommonUtils.hardWait(2000);
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

    @When("The user wants to login orange HRM")
    public void the_user_wants_to_login_orange_hrm(Map<String, String> dataTable) {

        System.out.println(dataTable.get("This is username: "+ dataTable.get("Username")));
        System.out.println(dataTable.get("This is Password: "+ dataTable.get("Password")));

        WebElement username = Driver.getDriver().findElement(By.id("txtUsername"));
        WebElement password = Driver.getDriver().findElement(By.id("txtPassword"));

        username.sendKeys(dataTable.get("Username"));
        password.sendKeys(dataTable.get("Password"));

    }
    @Then("The user wants to see add employee page")
    public void the_user_wants_to_see_add_employee_page() {
        WebElement addEmployee=Driver.getDriver().findElement(By.xpath("//a[.='Add Employee']"));
        CommonUtils.hardWait(2000);
        addEmployee.click();
        CommonUtils.hardWait(2000);
    }

    @Then("The user wants to add an employee")
    public void the_user_wants_to_add_an_employee(Map<String, String> dataTable) {

        System.out.println("The first name is: "+ dataTable.get("FirstName") );
        System.out.println("The last name is: "+ dataTable.get("LastName") );

        CommonUtils.waitForPageToLoad(10);
        WebElement usernamBox=Driver.getDriver().findElement(By.xpath("//input[@class='formInputText']"));
        usernamBox.sendKeys(dataTable.get("FirstName"));
        CommonUtils.waitForPageToLoad(10);

        WebElement lastName=Driver.getDriver().findElement(By.name("lastName"));
        lastName.sendKeys(dataTable.get("LastName"));

    }

//eger yazilacak yerler varssa app.'te htlm'de kesin input olacaktir bu senin sendkeys kullanmani saglar
    @Then("The user wants to add login details")
    public void the_user_wants_to_add_login_details(Map<String, String> dataTable) {

        WebElement checkbox= Driver.getDriver().findElement(By.id("chkLogin"));
        WebElement username=Driver.getDriver().findElement(By.id("user_name"));
        WebElement password=Driver.getDriver().findElement(By.id("user_password"));
        WebElement repassword=Driver.getDriver().findElement(By.id("re_password"));
        WebElement status=Driver.getDriver().findElement(By.id("status"));

        CommonUtils.clickWithWait(checkbox);
        username.sendKeys(dataTable.get("User Name"));
        password.sendKeys(dataTable.get("Password"));
        repassword.sendKeys(dataTable.get("Password"));

        CommonUtils.selectFromDropDown(status, dataTable.get("Status"));
    }

    @When("the user wants to login in list way")
    public void the_user_wants_to_login_in_list_way(List<List<String>> dataTable) {
                                                  // birinci list:row, ikinci list:colomn
        System.out.println("Username: "+dataTable.get(0).get(0));
        System.out.println("Username: "+dataTable.get(0).get(1));

        WebElement username = Driver.getDriver().findElement(By.id("txtUsername"));
        WebElement password = Driver.getDriver().findElement(By.id("txtPassword"));

        username.sendKeys(dataTable.get(0).get(0));
        password.sendKeys(dataTable.get(0).get(1));

    }

    //!!!!sometimes we cant categorise some datas, there might be multiple datas, it is not like username, password
    //!!!more than 2 things, in this stituation, you need to use list


    @Then("The user wants to add an employee in a list way")
    public void the_user_wants_to_add_an_employee_in_a_list_way(List<List<String>> dataTable) {
        WebElement username= Driver.getDriver().findElement(By.id("firstName"));
        WebElement lastName= Driver.getDriver().findElement(By.id("lastName"));

        username.sendKeys(dataTable.get(0).get(0));
        lastName.sendKeys(dataTable.get(0).get(1));
    }

    @Then("The user wants to add login details in a list way")
    public void the_user_wants_to_add_login_details_in_a_list_way(List<List<String>> dataTable) {

        WebElement username= Driver.getDriver().findElement(By.id("firstName"));
        WebElement middleName=Driver.getDriver().findElement(By.id("middleName"));
        WebElement lastName= Driver.getDriver().findElement(By.id("lastName"));

        username.sendKeys(dataTable.get(0).get(0));
        middleName.sendKeys(dataTable.get(0).get(1));
        lastName.sendKeys(dataTable.get(0).get(2));

    }

    @Given("The user wants to login website")
    public void the_user_wants_to_login_website() {
        System.out.println("Test Test");
    }
    @Then("the user wants to verify that we can login")
    public void the_user_wants_to_verify_that_we_can_login() {
        System.out.println("Test Test");

        //Assert.assertTrue(false); //fail vermesi icin bunu koyduk

        CommonUtils.hardWait(5000);
    }



}


