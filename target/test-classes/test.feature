Feature:
  #yukaridakini yazmadan senaryolarini yazamiyosun
#this is feature file, we are using this feature to demo class.

  # gherkin language comes from Ruby
  #      Ruby- Backend Language
  # Gherkin language has some keywords to write scenario
    #Given -- i wanna start from something. beginning of senaryo
    #When -- burada asil adimlar basliyor asil test etmek istedigimiz yerler
    #Then
    #And
  # BDD-Behavioral Development Driver, reusable

  #in cucumber we call test cases as scenario

   #With cucumber tool we are creating scenario. When we create a scenario, we are getting some benefit from gherkin language
  #We are using Given/ When/Then/And keywords
  #Given means I want do something firstly, like go website
  #We are putting a structure of our scenario in Cucumber
  #Main purpose of cucumber is more understandable scenario languages.It is reusable and the other part is readability.

#what is cucumber testing tool?
  # we can create scenario with playing language
  # we can create collabration--everybody in your team can understand your work
  #we are using Gherkin to use it
  #to start a test case, we need to declarate scenario,
  #it is readable********
  #it is reusable*******

  ## MAIN PURPOSE OF CUCUMBER: you can show your work to non tecnical people, they can unserstanbd your work
  #but in testNG not, bacuse all of them is related to coding


  #Gherkin Language
  #it is plain language driven from Ruby
  #language that testers use to define test cases in cucumber **********
  #this language describe uses cases or scenarios in a way that can be read and understand
  #almost everyone in the team

  Scenario: Login to Matrix LMS
    Given The user wants to go to Matrix
    When The user wants to enter username
    Then The user wants to enter password
    And The user wants to click submit

    #sadece when kismi degisiyor, negatif'de, bu sekilde bi senaryoyu resuable yapmis oluyorsun, hem zaman tasarrufu hem reusable

  #We can test negative way like: wrong email with correct password
  Scenario: Login with incorrect data(negative scenario)
    Scenario: Login with incorrect data
      Given The user wanna go to website
      When The user wanna enter incorrect username
      Then The user wants to enter password
      And The user wanna click submit


  Scenario: Verify that login to Gmail with positive credentials
  Given The user wants to go to google
  When The user wants to click Gmail
  Then The user wants to enter e-mail
  And The user wants to enter password
  Then The user wants to click login
  And The user wants to verify

  #Create a negative scenario and verify the error message
  #incorrect password, then verify messeage: "Please enter correct password"

  Scenario: Verify that login to Gmail with positive credentials
    Given The user wants to go to google
    When The user wants to click Gmail
    Then The user wants to enter e-mail
    And The user wants to enter incorrect password
    Then The user wants to click login
    And The user wants to verify error message: "Please enter correct password"
    But The user wants to ..... --->>>bu genelde kullanilmiyor



  Scenario: Verify that login to Gmail with positive credentials
  Given The user wanna go to google
  When  The user wants to click gmail
  Then  The user wanna enter username as"email@email.com" and password as "Pasword123"
  And The user firstly wants to verify e-mail


  # selenium cucumber is
  # plain language
  # resusable
  #readable

  #selenium TestNG
  # testNG calling like Test Driven Development
  #Decleare @Test
  #Browser Utils
  #Reusable methods



  #First and last two steps are same this means:
  #   -BDD and Cucumber is reusable when you create those steps you don't have to create every time!
  #It is reusable and the other part is readability.
  #   -Every people in the team can easily understand everything that we create in the scenarios.


