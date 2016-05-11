Feature: Feeding Tamagotchi

  Scenario: Tamagotchi can be fed
  As a Tamagotchi owner,
  I want to feed my Tamagotchi,
  So that I can satiate it's hunger

    Given I have a Tamagotchi
    When I feed it
    Then it's hungriness is decreased
    And it's fullness is increased
