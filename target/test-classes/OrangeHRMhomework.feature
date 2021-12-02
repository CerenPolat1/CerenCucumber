Feature:


        # Task
# Login to OrangeHRM
# Go to PIM and click Employee List
# Click the last employee and verify that "Personal Details" is appear on the page
# update :
# Driver's License Number
# License Expiry Date
# Marital Status
# Nationality
# Date of Birth  and Save
# and click add attachment and upload a sample file. for example  "anySample.pdf"

  Scenario: Login to HRM
    Given The user wants to go to "https://renastech-osondemand.orangehrm.com/" webpage
    When  The user will enter username as "Admin" and the password as "Mv@UE0@dR3f@"
    And The user wants to click Login button
    Then The user wants to click PIM
    And The user wants to click Employee List
    And The user wants to click on Last Employee
    And The user wants to verify Personal Details is appear on the page
    And The user wants to click Edit button
    And The user Driver's License Number should be "111111111"
    And The user License Expiry Date should be "2025-01-01"
    And The user Marital Status should be "Married"
    And The user Nationality should be "American"
    And The user Date of Birth should be "1990-01-01"
    Then The user wants to click Save button
    Then The user wants to verify the edit is done successfully
    And The user wants to click Add button
    And The user wants to choose file
    And The user wants to upload the file
    Then The user wants to verify the file is uploaded successfully