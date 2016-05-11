Feature: Putting Tamagotchi to Bed

  Scenario: Tamagotchi can sleep
  As a Tamagotchi owner,
  I want to put my Tamagotchi to bed,
  So that I can refill it's energy

    Given I have a Tamagotchi
    When I put it to bed
    Then it's tiredness is decreased
