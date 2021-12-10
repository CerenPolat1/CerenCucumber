package renastech.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.CommonUtils;
import renastech.utils.Driver;

import java.util.List;

public class Admin_Page {

    public Admin_Page() {

        PageFactory.initElements(Driver.getDriver(), this); //buradaki this ne???
        //bu page'i yani bu class icinde dondur demek
    }

    @FindBy(id = "menu_admin_nationality")
    private WebElement nationality;

    @FindBy(id = "btnAdd")
    private WebElement addButton;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement nationalityName;

    @FindBy(id = "btnSave")
    private WebElement saveButton;


    public void setSaveButton() {
        CommonUtils.clickWithWait(saveButton);
    }

    public void setNationality() {
        CommonUtils.clickWithWait(nationality);
    }

    public void setAddButton() {
        CommonUtils.clickWithWait(addButton);
    }

    public void setNationalityName(String name) {
        CommonUtils.enterText(nationalityName, name);
    }


    public void verifyNationality(String name) {

        CommonUtils.hardWait(3000);
        WebElement element = Driver.getDriver().findElement(
                By.xpath("//table[@id='resultTable']//a[contains(text(),'" + name + "')]"));
                                                       //normalde bu locator default idi 'American' yaziyordu
                              // onu kaldirip name ekledik bizimkisi name ve + kullandik

        Assert.assertTrue(element.isDisplayed());

    }

/*
neden yukaridaki method'a webelementi yerlestirdik??? cunku bu webelement yukaridakiler gibi static degil dynamic
olmasini istiyoruz belki daha sonra degistirmek istiycez diye
 */


    //bu sana tum table'daki check box'lari verecek

    public void clickAllCheckBoxes() {

        List<WebElement> allCheckBoxes = Driver.getDriver().findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_') and @type='checkbox']"));

        for (WebElement each : allCheckBoxes) {

            if (!each.isSelected()) { //eger secili degilse click yap diyor
                CommonUtils.clickWithWait(each);
            }

        }

    }
}
