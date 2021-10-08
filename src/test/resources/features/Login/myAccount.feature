Feature:  Login

  Background:
    When I start nesine application
    When I click the login in button
    And I fill the assing username
    And I fill the assing password
    Then I see home page


  @MyAccount
  Scenario: 1M Promotion
    Then I click the login member number in button
    And I click the promotin in button
    And I fill the assing promotin code
    And I fill the assing security code
    And I click the close in button
    Then I see promotin button





  @MyAccount
  Scenario: 2M MyAccount
    Then I click the login member number in button
    And I click the personal informations in button
    Then I verify personal number