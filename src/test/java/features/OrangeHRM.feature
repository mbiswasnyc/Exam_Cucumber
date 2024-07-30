Feature: OrangeHRM application

  @ValidLogin
  Scenario Outline: User can login to dashboard with valid credentials

    Given user is on OrangeHRM homepage
    When user enter valid <userName> and <passWord>
    Then user can login to dashboard page
    Examples:
      | userName |  | passWord |
      | Admin    |  | admin123 |

  @InvalidLogin
  Scenario Outline: User cannot login to dashboard with invalid credentials

    Given user is on OrangeHRM homepage
    When user enter invalid <userName> and <passWord>
    Then Invalid credentials massage will appear
    Examples:
      | userName |  | passWord  |
      | Admin1   |  | admin123  |
      | Admin    |  | admin1232 |
      | Admin1   |  | admin1232 |

  @Dashboard
  Scenario Outline: user can use my info

    Given user is on OrangeHRM homepage
    When user enter valid <userName> and <passWord>
    Then user can login to dashboard page
    Then user can use my info button

    Examples:
      | userName |  | passWord  |
      | Admin    |  | admin123  |

    @PIM
  Scenario Outline: user can use PIM page

    Given user is on OrangeHRM homepage
    When user enter valid <userName> and <passWord>
    Then user can login to dashboard page
    When user select PIM option
    Then user land on PIM page

    Examples:
      | userName |  | passWord  |
      | Admin    |  | admin123  |