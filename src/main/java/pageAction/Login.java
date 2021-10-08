package pageAction;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import stepDefinition.AllPageAction;
import java.util.concurrent.TimeUnit;

public class Login {
    AllPageAction allpageactions;



    public Login(AllPageAction allpageactions) {

        this.allpageactions = allpageactions;

    }

    @Given("I click the login in button")
    public void i_click_the_login_in_button() {
        allpageactions.loginclk();

    }

    @When("I fill the assing username")
    public void i_fill_the_assing_username() {
        allpageactions.username();
    }
    @When("I fill the assing password")
    public void i_fill_the_assing_password() {
        allpageactions.password();
    }

    @Then("I see home page")
    public void i_see_login_page() {
        allpageactions.verfyLogin();
    }


    @Given("I click the member number in button")
    public void i_click_the_member_in_button() {
        allpageactions.membernumberclk();

    }

    @And("I click the log out in button")
    public void i_click_the_log_out_in_button() {
        allpageactions.logoutclk();

    }

    @And("I click the contiune popup in button")
    public void i_click_the_popup_in_button() {
        allpageactions.popupclk();

    }

    @Then("I see login page")
    public void i_click_the_loginverfy_in_button() {
        allpageactions.closeVerfy();

    }







}
