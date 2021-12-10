package renastech.Steps_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import renastech.Pages.Admin_Page;
import renastech.Pages.Home_Page;
import renastech.Pages.Login_Page;
import renastech.utils.CommonUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class OrangeHRMWithPOM {

    Home_Page home=new Home_Page(); //niye object'i buraya koyduk cunku her testin icinden cagirabilelim diye
    Admin_Page admin= new Admin_Page();

    private static Logger logger= Logger.getLogger(OrangeHRMWithPOM.class);

    @Given("The user wants login as admin")
    public void the_user_wants_login_as_admin() {


        logger.info("this is log4j");
        logger.debug("this is logger debug");
     Login_Page loginpage= new Login_Page();
     loginpage.setUsername();
     loginpage.setPassword();
     loginpage.setLoginButton();

    }


    @Then("The user wants to verify dashboard")
    public void the_user_wants_to_verify_dashboard() {


        CommonUtils.hardWait(2000);
        Assert.assertTrue(home.getDashboard().isDisplayed());
        logger.info("this isssss log4j");
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

    @Given("The user wants to login with excel")
    public void the_user_wants_to_login_with_excel() throws IOException {

        String filePath="C:\\Users\\Erkan\\ideaproject\\seleniuymcucumbertesting\\src\\test\\resources\\new microsoft excel workseet.xlsx";
        FileInputStream fileinpuut= new FileInputStream(filePath);

        //simdi buraya daha once kaybettigin excel file'ini ekliyorsun nasi yapcaksin
        //masaustundekini tutup resources klasorunun icine ekle, orada ekleyince sol tarafta asagida cikacak
        //sonra o excel sayfasinin ustune sga click yap --> Copy Path/Preference tikla
        //burada cikan Absulate Path'i secmen gerekiyor, sonra onu yukaridaki string'in icine yapistiriyorsun, o kadar

        XSSFWorkbook workbook=new XSSFWorkbook(fileinpuut);
        XSSFSheet sheet=workbook.getSheet("sheet1"); //excelin icindeki sayfa ismi ve numarasi bu

        int rows=sheet.getLastRowNum();

        System.out.println("The row number " +rows);

       int colomn=sheet.getRow(0).getLastCellNum(); //row'un index 0'ini alacak ve sonra hangi colomn'a kadar yazi var sana onu verecek mesela
        //row:2,  colomn:3 //yani buraya kadar dolu demek oluyor

        System.out.println("The colomn number " +colomn);

        XSSFRow row= sheet.getRow(1);
        System.out.println(row.getCell(0)); //1.siradaki row'a gidip 0.indextedeki yaziyi alacak


    }

//    @Then("The user wanst to verify dashboard")
//    public void the_user_wanst_to_verify_dashboard() {
//
//
//    }

}
