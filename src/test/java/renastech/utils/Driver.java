package renastech.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

//singleton pattern design yaratmak icin private constructor ve private variable yaratmak gerekiyor
    //bunu boyle yapmak ne isimize yariyor???
    // you cant create any other object, bu yuzden singleton olmasini istiyoruz


   // private Driver(){   // singleton design

        // HOOK---> if you have more than one scenario, hook will help us to run them with synchronization

        //private static WebDriver driver;// this line is belongs to the singleton design pattern, do not use anymore

        private static ThreadLocal<WebDriver> driverPool=new ThreadLocal<>();//it will create a pool of driver and
        // everytime it will launch a new driver(more than one driver)

    //alttaki method sayesinde birden fazla senaryo ayni anda run edebilecek, birini run edecek kapatacajk digerini run edecek
    private Driver(){
        }

        public static WebDriver getDriver(){// means launch chrome
            if (driverPool.get()==null){//if it is null launch a new one
                synchronized (Driver.class) {//if you do not synchronize, driver will get confused, It coordinates and organize them
                    //Without "synchronized" Driver wants to run all test cases at the same time.
                    //synchronized (Driver.class) is for paralel testing

                    switch (ConfigurationsReader.getProperty("browser")) {
                        case "chrome":
                            WebDriverManager.chromedriver().setup();
                            driverPool.set(new ChromeDriver());
                            break;
                        case "firefox":
                            WebDriverManager.firefoxdriver().setup();
                            driverPool.set(new FirefoxDriver());
                        case "edge":
                            WebDriverManager.edgedriver().setup();
                            driverPool.set(new EdgeDriver());
                        default:
                            System.out.println("The Driver is NOT Found!!!");
                    }
                }
            }
            return driverPool.get();
        }

        public static void closeDriver(){
            if (driverPool.get()!=null){
                driverPool.get().quit();//will close all of them
                driverPool.remove();//destroy the session
            }
        }



/*

    public static WebDriver getDriver(){  //neden static olarak olusturduk?? cunku singleton kullaniyoruz ve baska yerde kullanmak istemiyoruz

        if(driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;

    }

    bu sekildeyken 2 senaryo ayni anda duzgunce run etmez cunku her senaryonun once url'ye gitmesi gerekir
    bunu yazarken henuz before ve after methodlar yoktu yani driver.close'u kullanmadik o yuzden her iki senaryo da
    pes pese run etti bu nasil fix edilecek yukariya yeni ozellikler ekleyecegiz duzgunce calismasi icin
*/

}
