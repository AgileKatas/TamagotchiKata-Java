package uk.co.agilekatas.katas.tamagotchi;

public class Tamagotchi {

  private static final int INITIAL_STATE = 5;
  private static final int STATE_CHANGE_AMOUNT = 1;

  private int hunger;
  private int fullness;
  private int tiredness;
  private int happiness;

  public Tamagotchi() {
    this.hunger = INITIAL_STATE;
    this.fullness = INITIAL_STATE;
    this.tiredness = INITIAL_STATE;
    this.happiness = INITIAL_STATE;
  }

  public void feed() {
    hunger = decrease(hunger);
    fullness = increase(fullness);
  }

  public void play() {
    happiness = increase(happiness);
    tiredness = increase(tiredness);
  }

  public void putToBed() {
    tiredness = decrease(tiredness);
  }

  public void poop() {
    fullness = decrease(fullness);
  }

  public void tick() {
    hunger = increase(hunger);
    tiredness = increase(tiredness);
    happiness = decrease(happiness);
  }

  private int increase(int state) {
    return state + STATE_CHANGE_AMOUNT;
  }

  private int decrease(int state) {
    return state - STATE_CHANGE_AMOUNT;
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
