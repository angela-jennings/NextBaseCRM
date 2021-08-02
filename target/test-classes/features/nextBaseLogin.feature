@wip
Feature: As a user, I should be able to log into the application

  Scenario: Users can login with valid credentials
    Given user is on Next Base landing page
    When user enters "helpdesk3@cybertekschool.com" as username and user enters "UserUser" as password
    Then user should be logged into the application

    Scenario: Users can check the Remember Me box
      Given user is on Next Base landing page
      When user checks the remember me box
      Then the box should be clicked

