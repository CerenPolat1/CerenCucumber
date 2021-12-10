Feature:  We are creating this feature file to add Orange HRM Scenarios

#  Background: //it will run before everything it is like before bethod
#  Given The user wants to go to login
#  Then The user wants to click login



  @loginWithoutParams  @Regression
  Scenario: Login to Orange HRM
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard


  @LoginWithParams    @Anything  @ForFun @Regression
  Scenario: Login with credentials
    Given The user wants to go to orangeHRM application
    When The user wants to enter username as "Admin" and the password as "Mv@UE0@dR3f@"
    Then The user wants to click login
    And The user should be able to navigate dashboard
    #And The user id should be 1568
    #And The user id number should be 1568.5
    #And The user id number have to be true  ///////bu calismaz yani boolean islemez burada
  ## bunlarin her birine STEP deniyor

  #eger sen surekli ayni seyler yazarsan (And kisminda oldugu gibi, onlar tipa tip ayniydi) icerik olarak sana exception verir:
  #AmbiguousStepDefinitonsException verir o durumda da birinden birini degistir bi kelime falan sorun cozulur


                               #Runner CLass
                #Scenarios  <----------------------------> Step Definition (coding part)
                                  #Cucumber Runner
                #scenerios                                   #Base Page
                #test cases                                  #Pages
                                                             #Test
                                                             #utilities
                                                             #Configuration.properties


  # Parametrization //senaryoya " "  icine yazdigimizi String, sadece rakam yazarsak onu int veya kesirliyse double alir
                                     #boolean kabul etmezzz
      # String
      # integer
      # double

  #proje kisminfda gordugun src:source demekmis


  # Eclipse , NetBeans ,

    # gherkin Language keyword, it is case sensitive --Given, When GIBI SEYLER sadece buyuk harf  kabul ediyor

        # Framework sunlardan olusur -->   JAVA-- Maven -- > Selenium -- Cucumber  -- POM

#what is JUnit??????

  ##   user story is  created by PO
  ##   Groom the story   DEV - QA - BA   -- > 3 Amigos
  ##    - DEV will start to devolop their code
  ##    - QA Will create scenarios, then

  ## QA will start to test/Create coding

  @ForFun   @Anything   @Regression  @Maping
    Scenario:
    Given The user wants to go to orangeHRM application
    When The user wants to enter username as "Admin" and the password as "Mv@UE0@dR3f@"
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wans to see Add Employee page
    Then The user wants to add an user name as "Tom"
    Then The user wants to add last name as "Jerry"
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"

# When The user wants to enter username as "Admin" and the password as "Mv@UE0@dR3f@"
#  bu sekilde "Admin" yazinca parametrization olur
#  hem bu parametrization hem de data table(yani alttaki) DATA DRIVEN TESTING OLUYORRRR
# |Nationalities| ->header
#      #|erk18234da    |    -> table
#      #|erk3129348    |



    #Data Driven Testing=scenario outline ---it works with examples
  #once ilk ornekle run edecek sonra browseri baslatip yeniden run ettiginde ilkini ignore edip 2. ornegi yazdiracak
  #yani 1 senaryo 2 senaryoya donusmus oluyor
  # example koyarak data eklemis oluyorsun
  #"<Nationalities>" yani "< >" icine yazi yaziyorsun
  #"<Nationalities> header oluyor,
      #|Nationalities| ->header
      #|erk18234da    |    -> table
      #|erk3129348    |


#APATCHE POI --1. Apache POI API Based On OPC and OOXML Schemas (MVNREPOSITORY'DEKI ISMI BU) 5.0.0 VERSION
#  APATCHE COMMONS IO- HELPS YOU TO WORK WITH FILES LIKE EXCELL --2.11.0

#  WORKBOOK-WHOLE EXCELL FILE
# SHEET-EXCELLDEKI SAYFALAR
#ROW- EXCELDEKI YATAY SIRA
#  CELL-

#  IN EXCELL WE NEED TO KNOW TO GET DATA FROM EXCELL: ROW NUMBER, SHEET NUMBER AND COLOMN NUMBER




  @excel
Scenario: Verify that we can login with excel data
Given The user wants to login with excel
#Then The user wanst to verify dashboard




#  BDD --------------------FOR CUCUMBER
# KEYWORD DRIVEN TESTING
#  TEST DRIVEN TESTING ----FOR TESTNG
#  DATA DRIVEN TESTING----USING EXTERNAL FILE OR DATA  ---WE TAKE OUR DATAS FROM XML FILES
#  YANI BIZIM BILGIYI ALDIGIMIZ CONF.PROPERTIES BIR INTERNAL FILE ISTEDIGIMIZDE HEMEN DEGISTIRIRIZ
#  YUKARIDAKI ISE EXTERNAL YANI EXEL FILE'A STORE ET SONRA ORDAN KULLAN GIBI


  @Scenario_Outline
  Scenario Outline:
    Given The user wants login as admin
    Then The user wants to verify dashboard
    When The user wants to go to admin
    Then The user wants to go to Nationalities
    Then The user wants to add new Nationalities
    Then The user wants to add Nationalities as "<Nationalities>"

    Examples:
      |Nationalities|
      |erk18234da    |
      |erk3129348    |






         # BDD Framework
       # Maven Project
       # Added Cucumber and Gherkin Plugins
       # Cucumber and Selenium Dependency
       # Create .feature file
          # Create scenario
       # Create Steps Definitions
       # Create config properties
       # Configuration reader
       # Runner Class--- provide connection between feature file and step definitions
             # RunWith
             # CucumberOptions
                  # Feature
                  # Glue
                  # Tags




  @configFile_Scenario   @BackgroundPractice
  Scenario: Login
   And The user should be able to navigate dashboard

  @Candidate  @BackgroundPractice
  Scenario: Verify that we can create a candidate
    Then The user wants to navigate recruitment
    Then The user wants to see candidates
    And The user wants to add a candidate
    Then The user wants to enter first name as "erkan" and last name as "ozclk"
    Then The user wants to enter email as "ozclk@renastech.com"
    Then The user wants to Consent to keep data
    Then The user wants to save
    Then The user wants to verify that the user is created






    # Data tables/ maping
  @Maping
  Scenario:
    Given The user wants to go to orangeHRM application
    When The user wants to login orange HRM
      |Username | Admin      |
      |Password |Mv@UE0@dR3f@|
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add an employee
      |FirstName|Tom123  |
      |LastName |Jerry123|
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"

    #yukaridaki FirstName LastName kisminin oldugu yer sayesinde hem more readable oluyor hem de ufak bir degisiklik
  #oldugunda buraya gelip yeni seyler ekleyebiliyorsun, diger turlusu daha karmasik olabilir o yuzden bu daha kolay
#bunlarin isimine data table denir

  @Mapping_TC2
  Scenario: Verify that add new employee with login credentials
    Given The user wants to go to orangeHRM application
    When The user wants to login orange HRM
      |Username | Admin      |
      |Password |Mv@UE0@dR3f@|
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add an employee
      |FirstName|Tom123122sdfv389  |
      |LastName |Jerry123123123423|
    Then The user wants to add login details
      |User Name   | erkanozclkll123|
      |Password    |Erkann!123  |
      |Status      |Disabled   |
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"

#bundan onceki senaryolar error verirse onemseme cunku artik HOOK kurduk ve ona gore isleyecek her sey
  @List_TC1
  Scenario: verify that add new employee with Login in List way
    Given The user wants to go to orangeHRM application
    When the user wants to login in list way
      |Admin       |Mv@UE0@dR3f@|
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add an employee in a list way
      |Tommm123| Jerryyyyy|
    Then The user wants to add login details in a list way
      |renastech123 | RenasTech2021 |Disabled|
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"





  @Hook
  Scenario: Verify That the Hooks works fine
    Given The user wants to login website
    Then the user wants to verify that we can login

  @Hook
  Scenario: Verify That the Hooks works fine
    Given The user wants to login website
    Then the user wants to verify that we can login

  @Hook
  Scenario: Verify That the Hooks works fine
    Given The user wants to login website
    Then the user wants to verify that we can login



  @PageObjectModel
  Scenario: Verify that the user should be able to add new Nationality
    Given The user wants login as admin
    Then The user wants to verify dashboard
    When The user wants to go to admin
    Then The user wants to go to Nationalities
    Then The user wants to add new Nationalities
    Then The user wants to add Nationalities as "Batman"
    And The user should be able to see "Batman" in Nationality page



  @PageObjectModel2
  Scenario: Verify that we can click all the checkboxes are available
    Given The user wants login as admin
    Then The user wants to verify dashboard
    When The user wants to go to admin
    Then The user wants to go to Nationalities
    Then The user wants to click all checkboxes
