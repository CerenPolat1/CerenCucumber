
package renastech.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //icine cucumber.class yazdik, bununla calisiyoruz dedii yani
@CucumberOptions(
        features ="src/test/resources",
        glue = "renastech.Steps_Definitions", //step definition
        tags = "@Scenario_Outline", // "@Hook and @Candidate"     "@Hook or @Candidate"         "@Hook, @Candidate"
                     //ikisini run eder                //iksiinden birini run eder    //ikisini run eder

        //senaryolara verdigin isimler oluyor feature'a yazdigin, istedigin ismi verebilirsin
                                       //ve ayni isim eklenmis birden fazla senarho oldugunda onlarin hepsini run eder
        dryRun=false,
        // true will check if there is undefined steps definition
        // true yaptiginda run eder ama sayfayi acmaz, false olarak kaldiginda sayfa acilir

        plugin={ "pretty", //plugin name, oyle isimlendirdik
                 "html:target/default-cucumber-reports.html", //bunun sonuna html yazmassan html oldugunu recognise etmez
                 "json:target/cucumber.json",
                "rerun:target/rerun.txt"

        },
        publish = true, //bu sana testingi internette gosterir bu yolla senin calisman herkese acik olur cunku public
        //linki copy yapip manager'a gonderebilirsin gostermek icin ama cogu company tercih etmez guvenlik nedeniyle
//it will share your html report in cucumber server, you can see your report online


     monochrome = true // bu, sana yaptigin testing ile ilgili bircok detay sunar concole'da
        //sana detyali bilgi verir
        //it will provide more details in the console




         //report typelari:
        //default-cucumber-reports.html'yi yukari yazinca solda targetlarin icinde kendiliginden olusuyor ve sen de
       // onun usutune sag click yaptiginda OPEN IN de sonra Browser->Chrome dediginde senin elinde olan feature'lari sana verecek
        //tabii yukarida hangi tag varsa ona gore verecek
        // "json:target/cucumber.json" sonradan ekledik, o da sana yine test sonucunu rakli bir yontemle veriyor
        //eger tum target'da ne var gormek istersen yine target'in ustune gel sag click open in finder dersen sana
        //bilgisayarinda dosya olarak gosterecek
        //"rerun:target/rerun.txt"  ile eger fail verirsen sana failin nerede oldugunun raporunu verir yani
        //target'in ustune gel sag click open in finder dersen sana
        //bilgisayarinda dosya olarak gosterecek, feature'daki senaryonun neresinde fail verdigini goreceksin


)
public class TestRunner {
}


/*
most of time all scenarious will be in the regresision,  but there is some exception because
sometimes we test 1 scenarious for specifik cases, in that case you dont have to add it to regression suit
but usally all scenarous are included regresion
after our smoke or regression testing is done, we will move on reporting phase, in thise phase we need use plugin









 */




//Regression== 183 features - 674 scenarios - 7092 steps - 3h 21 min
//Smoke == 43 Features - 117 scenarios - 1066 steps - 43 minutes
//mesela yukarida yazan Smoke == 43 Feature'dan belki sen 4-5'ini handle etmissindir,
// Regression== 183 features, bundan 50'ini siizn team yapmistir
//yani hepsini senin teaminin yapmasi imkansiz, tum team'lerin toplam sayilaridir bunlar

//sen SMOKE VEYA REGRESSION testing yaptiginda sonucu report etmen gerekir
//bunu kime report ederiz??? QA lead'e ya da manager--it depends on company
//diyelim testlerin bir kismi passed bir kismi failed verdi naparsinn??/
//geri donup bu 5 test case'i tekrar run edersin, diyelim bunlardan 3'u gecti 2 si gecmedi yine run edersin report degil
//kalan stepleri manual olarak kontrol etmelisin app'de, bug oldugundan ,
// coding hatasi olmadigindan bug oldugundan emin oldugunda report edeceksin

//sometimes we can face changing locators or sencronization issue ( senc issue da denir)
//sencronization issue:sometimes app can loading very fast/slow, thats' why element can be unclickable
//failed olan test case'lari tekrar kontrol edilmeden onlarin bug olaudugndan emin olmadan report edilmez

//eger test case'sinden 100/100 emin degilsen,  coworkers are not sure bug mu degil mi diye
//o zaman manager'ina bildirmen gerekir: i found this one but my cowrkers, my team and i not sure, can you escalate it?
//then if manager says if it is bug, i can create bug ticket




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



list dublicate things---
set u need to define wrapper class---unique collection



JUnit is for unit testing, developers use it, but we also use it because it works with selenium as a default
 */