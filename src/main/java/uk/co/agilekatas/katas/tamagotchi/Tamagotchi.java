package uk.co.agilekatas.katas.tamagotchi;

public class Tamagotchi {

  private int hunger;
  private int fullness;
  private int tiredness;
  private int happiness;

  public Tamagotchi() {
    this.hunger = 5;
    this.fullness = 5;
    this.tiredness = 5;
    this.happiness = 5;
  }

  public void feed() {
    hunger -= 1;
    fullness += 1;
  }

  public void play() {
    happiness += 1;
    tiredness += 1;
  }

  public int getHunger() {
    return hunger;
  }

  public int getFullness() {
    return fullness;
  }

  public int getTiredness() {
    return tiredness;
  }

  public int getHappiness() {
    return happiness;
  }
}
