
package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //icine cucumber.class yazdik, bununla calisiyoruz dedii yani
@CucumberOptions(
        features ="src/test/resources",
        glue = "renastech/Steps_Definitions", //step definition
        tags = "@BackgroundPractice", //senaryolara verdigin isimler oluyor feature'a yazdigin, istedigin ismi verebilirsin
                                       //ve ayni isim eklenmis birden fazla senarho oldugunda onlarin hepsini run eder
        dryRun= false             // it will check if there is undefined steps definition
        //dryrun is headless mode, true yaptiginda run eder ama sayfayi acmaz, false olarak kaldiginda sayfa
)
public class TestRunner {
}

//TO RUN SCENARIOS WITH STEP DEFINITION, WE NEED TO HAVE 2 THINGS: FEATURE FILE LOCATION, STEP DEFINITON LOCATION (GLUE)


// 2 things
// 1-RunWith     -- >  comes from JUnit ..JUnit provides running test cases -- Cucumber works with JUnit by default
  //developers create their unit testing with JUnit..Junit is not useful for testers
  //beacuse there is not much annotations for testers, all annototations for developers to run their unit testing

// 2- Cucumber options