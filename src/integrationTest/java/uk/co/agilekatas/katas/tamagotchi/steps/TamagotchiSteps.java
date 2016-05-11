package uk.co.agilekatas.katas.tamagotchi.steps;

import static org.assertj.core.api.Assertions.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.agilekatas.katas.tamagotchi.Tamagotchi;

public class TamagotchiSteps {

  private Tamagotchi tamagotchi;

  private int initialHunger;
  private int initialFullness;
  private int initialHappiness;
  private int initialTiredness;

  @Given("^I have a Tamagotchi$")
  public void given_i_have_a_tamagotchi() {
    tamagotchi = new Tamagotchi();
    initialHunger = tamagotchi.getHunger();
    initialFullness = tamagotchi.getFullness();
    initialHappiness = tamagotchi.getHappiness();
    initialTiredness = tamagotchi.getTiredness();
  }

  @When("^I feed it$")
  public void I_feed_it() {
    tamagotchi.feed();
  }

  @When("^I play with it$")
  public void I_play_with_it() {
    tamagotchi.play();
  }

  @When("^I put it to bed$")
  public void I_put_it_to_bed() {
    tamagotchi.putToBed();
  }

  @When("^I make it poop$")
  public void I_make_it_poop() {
    tamagotchi.poop();
  }

  @When("^time passes$")
  public void time_passes() {
    tamagotchi.tick();
  }

  @Then("^it's hungriness is increased$")
  public void it_s_hungriness_is_increased() {
    assertThat(tamagotchi.getHunger()).isGreaterThan(initialHunger);
  }

  @Then("^it's hungriness is decreased$")
  public void it_s_hungriness_is_decreased() {
    assertThat(tamagotchi.getHunger()).isLessThan(initialHunger);
  }

  @Then("^it's fullness is increased$")
  public void it_s_fullness_is_increased() {
    assertThat(tamagotchi.getFullness()).isGreaterThan(initialFullness);
  }

  @Then("^it's fullness is decreased$")
  public void it_s_fullness_is_decreased() {
    assertThat(tamagotchi.getFullness()).isLessThan(initialFullness);
  }

  @Then("^it's happiness is increased$")
  public void it_s_happiness_is_increased() {
    assertThat(tamagotchi.getHappiness()).isGreaterThan(initialHappiness);

  }

  @Then("^it's happiness is decreased$")
  public void it_s_happiness_is_decreased() {
    assertThat(tamagotchi.getHappiness()).isLessThan(initialHappiness);
  }

  @Then("^it's tiredness is increased$")
  public void it_s_tiredness_is_increased() {
    assertThat(tamagotchi.getTiredness()).isGreaterThan(initialTiredness);
  }

  @Then("^it's tiredness is decreased$")
  public void it_s_tiredness_is_decreased() {
    assertThat(tamagotchi.getTiredness()).isLessThan(initialTiredness);
  }

}
