Feature: As a user, I should be able to log in.


  Scenario Outline: Verify user login successfully "<username>"
    Given user on the login page
    When user enter valid "<username>" and "<password>"
    And user click the login button
    Then user should be at the dashboard page

Examples:
  | username | password    |
  | user7    | Userpass123 |
  | user34   | Userpass123 |
  | user99   | Userpass123 |
