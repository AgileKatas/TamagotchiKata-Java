Feature: Changing Tamagotchi Needs Over Time

  Scenario: Tamagotchi needs change over time
  As a Tamagotchi owner,
  I want my Tamagotchi's needs to change over time,
  So that I have to look after it carefully

    Given I have a Tamagotchi
    When time passes
    Then it's tiredness is increased
    And it's hungriness is increased
    And it's happiness is decreased
