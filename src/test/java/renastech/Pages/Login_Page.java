package renastech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.CommonUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

public class Login_Page {


    public Login_Page(){ //to be able to use Page Object Factory, we need to use Constructor********
        PageFactory.initElements(Driver.getDriver(),this); //initelements'i tikladiginda sana secenek sunar
                                //biz Webdriver driver, Object page'i kullandik
    }


    @FindBy(id = "txtUsername")
    private WebElement username;

    @FindBy(id = "txtPassword")
    private WebElement password;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;


    //WHY ARE WE USING POM(PAGE OBJECT MODEL)?




    public void setUsername(){
        username.sendKeys(ConfigurationsReader.getProperty("username"));
    }
    public void setPassword(){
        password.sendKeys(ConfigurationsReader.getProperty("password"));
    }

public void setLoginButton(){
        CommonUtils.clickWithWait(loginButton);
    }


}
