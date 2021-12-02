package renastech.Steps_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import renastech.utils.CommonUtils;
import renastech.utils.Driver;

public class OrangeHRM_homework {

        @Given("The user wants to go to {string} webpage")
        public void the_user_wants_to_go_to_webpage(String hrmPage) {
            Driver.getDriver().get(hrmPage);
            CommonUtils.hardWait(2000);


        }
        @When("The user will enter username as {string} and the password as {string}")
        public void the_user_will_enter_username_as_and_the_password_as(String username1, String password1) {
            System.out.println("Enter your username and Password");
            WebElement username = Driver.getDriver().findElement(By.id("txtUsername"));
            WebElement password = Driver.getDriver().findElement(By.id("txtPassword"));
            username.sendKeys(username1);
            password.sendKeys(password1);

        }
        @When("The user wants to click Login button")
        public void the_user_wants_to_click_login_button() {
            System.out.println("Click Login Button");
            WebElement loginButton = Driver.getDriver().findElement(By.id("btnLogin"));
            loginButton.click();
        }
        @Then("The user wants to click PIM")
        public void the_user_wants_to_click_pim() {
            WebElement pimButton=Driver.getDriver().findElement(By.id("menu_pim_viewPimModule"));
            pimButton.click();


        }
        @Then("The user wants to click Employee List")
        public void the_user_wants_to_click_employee_list() {
            WebElement employeeButton=Driver.getDriver().findElement(By.id("menu_pim_viewEmployeeList"));
            employeeButton.click();

        }
        @Then("The user wants to click on Last Employee")
        public void the_user_wants_to_click_on_last_employee() {
            WebElement lastEmployee=Driver.getDriver().findElement(By.xpath("//a[text()='0075']"));
            lastEmployee.click();

        }
        @Then("The user wants to verify Personal Details is appear on the page")
        public void the_user_wants_to_verify_personal_details_is_appear_on_the_page() {
            WebElement personalDetailsText=Driver.getDriver().findElement(By.xpath("//h1[text()='Personal Details']"));
            Assert.assertTrue(personalDetailsText.isDisplayed());

        }
        @Then("The user wants to click Edit button")
        public void the_user_wants_to_click_edit_button() {
            WebElement editButton=Driver.getDriver().findElement(By.id("btnSave"));
            editButton.click();

        }
        @Then("The user Driver's License Number should be {string}")
        public void the_user_driver_s_license_number_should_be(String driverLicense) {
            WebElement driverLicenseButton=Driver.getDriver().findElement(By.xpath("//input[@id='personal_txtLicenNo']"));
            driverLicenseButton.clear();
            driverLicenseButton.sendKeys(driverLicense);
        }


        @Then("The user License Expiry Date should be {string}")
        public void the_user_license_expiry_date_should_be(String expiryDate) {
            WebElement licenseExpiryDate=Driver.getDriver().findElement(By.id("personal_txtLicExpDate"));
            licenseExpiryDate.clear();
            licenseExpiryDate.sendKeys(expiryDate);


        }
        @Then("The user Marital Status should be {string}")
        public void the_user_marital_status_should_be(String string) {
            WebElement maritalStatusButton=Driver.getDriver().findElement(By.id("personal_cmbMarital"));

            Select maritalStatus=new Select(maritalStatusButton);
            maritalStatus.selectByVisibleText("Married");


        }
        @Then("The user Nationality should be {string}")
        public void the_user_nationality_should_be(String string) {
            WebElement nationalityButton=Driver.getDriver().findElement(By.id("personal_cmbNation"));

            Select nationality=new Select(nationalityButton);
            nationality.selectByVisibleText("American");

        }
        @Then("The user Date of Birth should be {string}")
        public void the_user_date_of_birth_should_be(String dateBirth) {
            WebElement dateOfBirth=Driver.getDriver().findElement(By.id("personal_DOB"));
            dateOfBirth.clear();
            dateOfBirth.sendKeys(dateBirth);


        }
        @Then("The user wants to click Save button")
        public void the_user_wants_to_click_save_button() {
            WebElement saveButton=Driver.getDriver().findElement(By.id("btnSave"));
            saveButton.click();

        }
        @Then("The user wants to verify the edit is done successfully")
        public void the_user_wants_to_verify_the_edit_is_done_successfully() {
            WebElement successMessage=Driver.getDriver().findElement(By.id("successBodyEdit"));
            Assert.assertTrue(successMessage.isEnabled());
        }
        @Then("The user wants to click Add button")
        public void the_user_wants_to_click_add_button() {
            CommonUtils.hardWait(3000);
            WebElement addButton=Driver.getDriver().findElement(By.id("btnAddAttachment"));
            addButton.click();

        }
        @Then("The user wants to choose file")
        public void the_user_wants_to_choose_file() {
            WebElement chooseFileButton=Driver.getDriver().findElement(By.id("ufile"));
            CommonUtils.hardWait(3000);
            chooseFileButton.sendKeys("/Users/cerenpolat/Desktop/screen_shot_2021-11-18_at_10.43.06_pm.png");

        }

        @Then("The user wants to upload the file")
        public void the_user_wants_to_upload_the_file() {
            WebElement uploadButton=Driver.getDriver().findElement(By.id("btnSaveAttachment"));
            uploadButton.click();

        }
        @Then("The user wants to verify the file is uploaded successfully")
        public void the_user_wants_to_verify_the_file_is_uploaded_successfully() {
            WebElement successMessage=Driver.getDriver().findElement(By.id("successBodyEdit"));
            Assert.assertTrue(successMessage.isEnabled());

        }

}
