Feature: Negative login test

  Scenario: Scenario: Users can click the forgot password link
    Given user is on Next Base landing page
    When user clicks the "forgot password" link
    Then user should be redirected to Get Password page