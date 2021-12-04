package renastech.Steps_Definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
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

    @Before
    public void setup(Scenario scenario) {

        Driver.getDriver().manage().window().maximize();
        CommonUtils.waitForPageToLoad(1000);
        Driver.getDriver().get(ConfigurationsReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }


    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
