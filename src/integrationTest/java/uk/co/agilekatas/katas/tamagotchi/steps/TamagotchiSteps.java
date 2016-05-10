package uk.co.agilekatas.katas.tamagotchi.steps;

import static org.assertj.core.api.Assertions.assertThat;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.agilekatas.katas.tamagotchi.Tamagotchi;

public class TamagotchiSteps {

  private Tamagotchi tamagotchi;

  private int initialHunger;
  private int initialFullness;

  @Given("^I have a Tamagotchi$")
  public void given_i_have_a_tamagotchi() {
    tamagotchi = new Tamagotchi();
    initialHunger = tamagotchi.getHunger();
    initialFullness = tamagotchi.getFullness();
  }

  @When("^I feed it$")
  public void I_feed_it() {
    tamagotchi.feed();
  }

  @Then("^it's hungriness is decreased$")
  public void it_s_hungriness_is_decreased() {
    assertThat(tamagotchi.getHunger()).isLessThan(initialHunger);
  }

  @And("^it's fullness is increased$")
  public void it_s_fullness_is_increased() {
    assertThat(tamagotchi.getFullness()).isGreaterThan(initialFullness);
  }

}
