#autor juliancamilovelasco@gmail.com

Feature: Make a Register
  As a web user
  I want to Register in MercuryTours.com
  to create a new account

  Scenario Outline: Create a New Account
    Given That Julian want to create a new account
    When  He Fills all box
      | firstName   | lastName   | phone   | email   | address1   | city   | state   | postalCode   | userName   | password   | confirmPassword   |
      | <firstName> | <lastName> | <phone> | <email> | <address1> | <city> | <state> | <postalCode> | <userName> | <password> | <confirmPassword> |

    Then  He should see sign-in

    Examples:
      | firstName | lastName | phone | email            | address1   | city   | state  | postalCode | userName | password | confirmPassword |
      | julian    | velasco  | 12345 | julian@gmail.com | abcde12345 | bogota | bogota | 1111       | julian   | julian   | julian          |
      | camilo    | torres   | 9876  | camilo@gmail.com | xcv12345   | tunja  | bogota | 2222       | camilo   | camilo   | camilo          |
