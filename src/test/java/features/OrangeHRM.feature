Feature: OrangeHRM application

  @Login
  Scenario Outline: Login experience with valid and invalid credentials

    Given user is on OrangeHRM homepage
    When user enter <userName> and <passWord>
    Then user can login to dashboard page
    Examples:
      | userName |  | passWord  |
      | Admin    |  | admin123  |
      | Admin1   |  | admin123  |
      | Admin    |  | admin1232 |
      | Admin1   |  | admin1232 |

  @Dashboard
  Scenario Outline: user can use my info

    Given user is on OrangeHRM homepage
    When user enter <userName> and <passWord>
    Then user can login to dashboard page
    Then user can use my info button

    Examples:
      | userName |  | passWord  |
      | Admin    |  | admin123  |

    @PIM
  Scenario Outline: user can use PIM page

    Given user is on OrangeHRM homepage
    When user enter <userName> and <passWord>
    Then user can login to dashboard page
    When user select PIM option
    Then user land on PIM page

    Examples:
      | userName |  | passWord  |
      | Admin    |  | admin123  |