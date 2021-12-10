package renastech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.CommonUtils;
import renastech.utils.Driver;

public class Home_Page {

public Home_Page(){
    PageFactory.initElements(Driver.getDriver(), this);
}

//how do you implement page object model??? **************
// when i declare the page, i create PAGE OBJECT CONSTRUCTOR, I CALL INITELEMENTS METHOD THAT WILL INCLUDE MY DRIVER



    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    private WebElement dashboard;

    @FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']/b") //buradaki b demek child bun bi bak
    private WebElement admin;


    public WebElement getDashboard(){  //neden WebElement OLDU? CUNKU zaten locatorla ilgili oldugundan webelement olmali
        return dashboard;
    }


    public void setAdmin(){
        CommonUtils.clickWithWait(admin);
    }

//    public String getDashboard(){
//        String dash=dashboard.getText().trim();  //trim yazidaki spaceleri kaldiracak bu yuzden isine yarar
//        return dash;
//    }














}
