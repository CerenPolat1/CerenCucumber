
package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //icine cucumber.class yazdik, bununla calisiyoruz dedii yani
@CucumberOptions(
        features ="src/test/resources",
        glue = "renastech.Steps_Definitions", //step definition
        tags = "@Hook", //senaryolara verdigin isimler oluyor feature'a yazdigin, istedigin ismi verebilirsin
                                       //ve ayni isim eklenmis birden fazla senarho oldugunda onlarin hepsini run eder
        dryRun=false            // it will check if there is undefined steps definition
        //dryrun is headless mode, true yaptiginda run eder ama sayfayi acmaz, false olarak kaldiginda sayfa
)
public class TestRunner {
}

//TO RUN SCENARIOS WITH STEP DEFINITION, WE NEED TO HAVE 2 THINGS: FEATURE FILE LOCATION, STEP DEFINITON LOCATION (GLUE)


// 2 things
// 1-RunWith     -- >  comes from JUnit ..JUnit provides running test cases -- Cucumber works with JUnit by default
  //developers create their unit testing with JUnit..Junit is not useful for testers
  //beacuse there is not much annotations for testers, all annototations for developers to run their unit testing

// 2- Cucumber options???? ------Interview question


//there are 4 wait type:
//1-implicit, 2-explicit, 3-thread.sleep, 4-fluent (onemli caliiiis!!!!)


//eger yazilacak yerler varssa app.'te htlm'de kesin input olacaktir bu senin sendkeys kullanmani saglar


//!!!!sometimes we cant categorise some datas, there might be multiple datas, it is not like username, password
//!!!more than 2 things, in this stituation, you need to use list

/*
hangi kosullarda Map hangi kosullarda List kullanilir????????

genelde birbirirle iliskisi olmayan (mesela formlar, anket vbbir suru soru alt alta veya yan yana)
bu durumlarda List kullanilabilir

genelde birbiriyle ilisigi olan seylerde Map kullanmak elverisli olur mesela password username gibi

ama farketmiyor her sey icin Map kullanabilirsin

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