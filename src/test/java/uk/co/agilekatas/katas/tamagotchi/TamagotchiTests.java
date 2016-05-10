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


}