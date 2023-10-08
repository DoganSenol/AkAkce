Feature: Login Functionality

Background:
  Given Navigate To AkAkce


  Scenario: Login with valid Username and Password

    Then The User Click To Login Link
    And  The User Enter The Login Data
    When The User Click To Login Button
    Then The User Verify The Successfully Login