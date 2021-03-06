package uk.co.agilekatas.katas.tamagotchi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class TamagotchiTests {

  public static class Feeding {

    @Test
    public void decreasesHunger() {
      Tamagotchi tamagotchi = new Tamagotchi();
      int initialHunger = tamagotchi.getHunger();

      tamagotchi.feed();

      assertThat(tamagotchi.getHunger()).isLessThan(initialHunger);
    }

    @Test
    public void increasesFullness() {
      Tamagotchi tamagotchi = new Tamagotchi();
      int initialFullness = tamagotchi.getFullness();

      tamagotchi.feed();

      assertThat(tamagotchi.getFullness()).isGreaterThan(initialFullness);
    }

  }

  public static class Playing {

    @Test
    public void increasesHappiness() {
      Tamagotchi tamagotchi = new Tamagotchi();
      int initialHappiness = tamagotchi.getHappiness();

      tamagotchi.play();

      assertThat(tamagotchi.getHappiness()).isGreaterThan(initialHappiness);
    }

    @Test
    public void increasesTiredness() {
      Tamagotchi tamagotchi = new Tamagotchi();
      int initialTiredness = tamagotchi.getTiredness();

      tamagotchi.play();

      assertThat(tamagotchi.getTiredness()).isGreaterThan(initialTiredness);
    }

  }

  public static class Sleeping {

    @Test
    public void decreasesTiredness() {
      Tamagotchi tamagotchi = new Tamagotchi();
      int initialTiredness = tamagotchi.getTiredness();

      tamagotchi.putToBed();

      assertThat(tamagotchi.getTiredness()).isLessThan(initialTiredness);
    }

  }

  public static class Pooping {

    @Test
    public void decreasesFullness() {
      Tamagotchi tamagotchi = new Tamagotchi();
      int initialFullness = tamagotchi.getFullness();

      tamagotchi.poop();

      assertThat(tamagotchi.getFullness()).isLessThan(initialFullness);
    }

  }

  public static class TimePassing {

    @Test
    public void increasesHunger() {
      Tamagotchi tamagotchi = new Tamagotchi();
      int initialHunger = tamagotchi.getHunger();

      tamagotchi.tick();

      assertThat(tamagotchi.getHunger()).isGreaterThan(initialHunger);
    }

    @Test
    public void increasesTiredness() {
      Tamagotchi tamagotchi = new Tamagotchi();
      int initialTiredness = tamagotchi.getTiredness();

      tamagotchi.tick();

      assertThat(tamagotchi.getTiredness()).isGreaterThan(initialTiredness);
    }

    @Test
    public void decreasesHappiness() {
      Tamagotchi tamagotchi = new Tamagotchi();
      int initialHappiness = tamagotchi.getHappiness();

      tamagotchi.tick();

      assertThat(tamagotchi.getHappiness()).isLessThan(initialHappiness);
    }

  }

}
