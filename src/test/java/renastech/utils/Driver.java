package renastech.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

//singleton pattern design yaratmak icin private constructor ve private variable yaratmak gerekiyor
    //bunu boyle yapmak ne isimize yariyor???
    // you cant create any other object, bu yuzden singleton olmasini istiyoruz

    private static WebDriver driver;  //singleton pattern design

    private Driver(){   //private constructor for singleton design

    }

    public static WebDriver getDriver(){  //neden static olarak olusturduk?? cunku singleton kullaniyoruz ve baska yerde kullanmak istemiyoruz

        if(driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;

    }



}
