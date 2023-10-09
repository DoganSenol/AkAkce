Feature: Negative And Positive Login Functionality

  Background:
    Given Navigate To AkAkce
    Then The User Click To Login Link

  Scenario Outline: Login Test Negative and Positive
    And User send keys in Dialog
      | loginEmail    | <LoginEmail>    |
      | loginPassword | <LoginPassword> |
    Then Click on Element in Dialog
      | loginButton   |







    Examples:
      | LoginEmail    | LoginPassword |
      | aaa@gmail.com | AH475645      |
      | bbb@gmail.com | Ao784994      |
      | ccc@gmail.com | Ak785123      |
      | asb@gmail.com | Ab123456      |