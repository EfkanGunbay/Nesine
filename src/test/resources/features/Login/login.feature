Feature:  Login

  Background:
    When I start nesine application

    @Login
  Scenario: 1A Login
  When I click the login in button
  And I fill the assing username
  And I fill the assing password
  Then I see home page

  @Login
    Scenario: 2A LogOut
    When I click the member number in button
    And I scroll down
    And I click the log out in button
    And I click the contiune popup in button
    Then I see login page








