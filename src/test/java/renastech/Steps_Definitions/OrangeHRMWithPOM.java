package renastech.Steps_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import renastech.Pages.Admin_Page;
import renastech.Pages.Home_Page;
import renastech.Pages.Login_Page;
import renastech.utils.CommonUtils;

public class OrangeHRMWithPOM {

    Home_Page home=new Home_Page(); //niye object'i buraya koyduk cunku her testin icinden cagirabilelim diye
    Admin_Page admin= new Admin_Page();

    @Given("The user wants login as admin")
    public void the_user_wants_login_as_admin() {

     Login_Page loginpage= new Login_Page();
     loginpage.setUsername();
     loginpage.setPassword();
     loginpage.setLoginButton();

    }


    @Then("The user wants to verify dashboard")
    public void the_user_wants_to_verify_dashboard() {


        CommonUtils.hardWait(2000);
        Assert.assertTrue(home.getDashboard().isDisplayed());
    }


    @When("The user wants to go to admin")
    public void the_user_wants_to_go_to_admin() {

        home.setAdmin();
    }

    @Then("The user wants to go to Nationalities")
    public void the_user_wants_to_go_to_nationalities() {

        admin.setNationality();
    }

    @Then("The user wants to add new Nationalities")
    public void the_user_wants_to_add_new_nationalities() {

        admin.setAddButton();

    }

    @Then("The user wants to add Nationalities as {string}")
    public void the_user_wants_to_add_nationalities_as(String name) { //bunun icine name'i biz yazdik, string yaziyordu

        admin.setNationalityName(name);
    }

    @And("The user should be able to see {string} in Nationality page")
    public void the_user_should_be_able_to_see_in_nationality_page(String name) {

        admin.verifyNationality(name);
        admin.setSaveButton();
    }

    @Then("The user wants to click all checkboxes")
    public void the_user_wants_to_click_all_checkboxes() {

        admin.clickAllCheckBoxes();

    }




}
