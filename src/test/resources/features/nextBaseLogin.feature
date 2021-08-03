@wip
Feature: As a user, I should be able to log into the application

  Scenario Outline: Users can login with valid credentials
    Given user is on Next Base landing page
    When user enters "<username>" and user enters "<password>"
    Then user should be logged into the application
    Examples: login functionality for different users
      | username                      | password |
      | helpdesk3@cybertekschool.com  | UserUser |
      | marketing3@cybertekschool.com | UserUser |
      | hr3@cybertekschool.com        | UserUser |

    Scenario: Users can check the Remember Me box
      Given user is on Next Base landing page
      When user checks the remember me box
      Then the box should be clicked

