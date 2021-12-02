Feature:  We are creating this feature file to add Orange HRM Scenarios

  Background: //it will run before everything it is like before bethod
  Given The user wants to go to login
  Then The user wants to click login



  @loginWithoutParams
  Scenario: Login to Orange HRM
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard


  @LoginWithParams    @Anything  @ForFun
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


  # Eclipse , NetBeans ,

    # gherkin Language keyword, it is case sensitive --Given, When GIBI SEYLER sadece buyuk harf  kabul ediyor

        # Framework sunlardan olusur -->   JAVA-- Maven -- > Selenium -- Cucumber  -- POM



  ##   user story is  created by PO
  ##   Groom the story   DEV - QA - BA   -- > 3 Amigos
  ##    - DEV will start to devolop their code
  ##    - QA Will create scenarios, then

  ## QA will start to test/Create coding

  @ForFun   @Anything
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




  #@configFile_Scenario   @BackgroundPractice
  #Scenario: Login
    #And The user should be able to navigate dashboard

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


  Scenario: about nothing
    Then the user want to do nothing

/*
  git init
  git commit -m "commit"
  git branch -M main
  git remote add origin .....(url)
  git push -u origin main

*/
