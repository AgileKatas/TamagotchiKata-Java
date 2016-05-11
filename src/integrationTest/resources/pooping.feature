Feature: Making Tamagotchi Poop

  Scenario: Tamagotchi can poop
  As a Tamagotchi owner,
  I want to make my Tamagotchi poop,
  So that it is more comfortable

    Given I have a Tamagotchi
    When I make it poop
    Then it's fullness is decreased
