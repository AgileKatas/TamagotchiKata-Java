package uk.co.agilekatas.katas.tamagotchi;

public class Tamagotchi {

  private int hunger;
  private int fullness;

  public Tamagotchi() {
    this.hunger = 5;
    this.fullness = 5;
  }

  public void feed() {
    hunger -= 1;
    fullness += 1;
  }

  public int getHunger() {
    return hunger;
  }

  public int getFullness() {
    return fullness;
  }
}
