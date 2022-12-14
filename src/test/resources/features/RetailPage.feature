Feature: Retail page

  Background: 
    #Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username and password
    And User click on Login button

  #Then User should be logged into My Account dashboard
  @RegisterPayment @smoke
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company      | website              | taxID     |
      | TekSchoolUSA | WWW.TekSchoolUsa.com | TekEIN123 |
    And User click on Payeename
    #And User check on About us check box
    And User click on Continue button

  #Then User should see a success message
  @RegisterPayment @smoke
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate information link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | TekBank  |   1234534 |      2603 | matin       |    5467898766 |

  # And User click on Continue button
  #Then User should see a success message
  @RegisterPayment @smoke
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email               | telephone  |
      | Mahyad    | Bahramy  | Mahyad123@gmail.com | 1234590800 |
   # And User click on continue button
    #Then User should see a message ?Success: Your account has been successfully
