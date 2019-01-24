Feature: Dupa

  Scenario: Find dupa in Google
    Given Google page
    When I search for dupa
    Then Wikipedia about dupa is found