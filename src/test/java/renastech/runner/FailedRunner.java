package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="@target/rerun.txt",   //buradaki isim asagidaki rerun yerinden geldi
        glue = "renastech.Steps_Definitions",
        //   tags = "@Smoke_Testing",
        dryRun= false,             // it will check if there is undifianed staps definitions
        plugin ={  "pretty",
                "html:target/default-cucumber-reports.html", //testerlar bunu kullanir report icin
                "json:target/cucumber.json",
                "rerun:target/rerun.txt" //bu report degil bu testerlarin rerun yapmasini saglayana sey
                //rerun bize failed olmus seyi rerun yapmayi saglar
        }


//how can we rerun, if our test cases get failed??
  //we will go to failed runner( we create when we get failed),
        // ve feature kismin locator'ini yani @target/rerun.txt' ini gireceksin sonra da rerun edeceksin





)
public class FailedRunner {
}