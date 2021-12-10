package renastech.Steps_Definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import renastech.utils.CommonUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {



    //BeforeMethod
    // BeforeClass
    //Suite

/*
    ALTTAKI ADIMLARIN HEPSI HOOK CLASS'A EKLENIR
    // Before method
    // Setup the Driver
    // Max The Browser
    // implicit wait
    // we get the url

    // After Method
    // TearDown --- Close the driver --- Quite the driver
    // ScrrenShot
    // Report
*/

  private static final Logger logger=Logger.getLogger(Hooks.class); //bunu kullanmak istedigin her class'da
    //declera etmen lazim yoksa calismaz bu sekilde yani

  //bunu kullanmak icin once resources altina log4j icin properties olusturuyorsun
    //icine gerekli bilgileri ekliyorsun sonra buraya gelip apatche' olanini import ediyorsun
  //bu sana console'da detayli bilgi sunuyor, ayrica solda projenin altinda
    // sen bunu kurup uygulamay baslayinca klasoru aciliyor
    //ve nerelerde kullandigini gormek istersen o dosyadan bulabilirsin

    //bu jog4j sadece senin daha fazla bilgi sahibi olman icin baska bi nedenle kullanilmiyor


   @Before
   public void setup(Scenario scenario) {
   logger.info("Logger expample");
    Driver.getDriver().manage().window().maximize();
    Driver.getDriver().get(ConfigurationsReader.getProperty("url"));
    Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}


    @After
    public void tearDown(Scenario scenario){

    //if condition sana screenshot almani saglar

        if(scenario.isFailed()){
            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }

//fail aldiginda target-right click-open in-finder dediginde cikan sayfadaki target'i tikladiginda default-cucumber-report cikacak
// bu ismi de biz verdik, report'u actidiginda orada attached image goreceksin boylelikle sikintili yer eklenmis olacak

 // rerun yaptigin her sefer report yeniden yazilip kaydolur

        Driver.closeDriver();

    }

}
