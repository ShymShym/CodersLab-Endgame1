Feature: CodersGuru Form Fill
  Scenario: User can fill registration form
    Given website https://men-men-s-01.codersguru.pl/ is open

    When user enters email "email3@emailer.com"
    And user submits
    And user enters Imię "Jadwiga"
    And user enters Nazwisko "Brzęczyszczykiewiczówna"
    And user enters Hasło "OnomatopejaWziummm32"
    And user repeats Hasło "OnomatopejaWziummm32"
    And user enters Miasto "Bielsko-Biała"
    And user enters Kod pocztowy "12-345"
    And user enters Ulica "Pokątna"
    And user enters Numer domu/lokalu "11/10"
    And user checks box
    And user submits whole form
    Then user is successfully registered


