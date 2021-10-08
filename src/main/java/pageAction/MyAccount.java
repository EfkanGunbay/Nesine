package pageAction;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import stepDefinition.AllPageAction;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;



public class MyAccount {
    AllPageAction allpageactions;



    public MyAccount(AllPageAction allpageactions) {
        this.allpageactions = allpageactions;

    }

        @Given("I click the login member number in button")
        public void click_the_login_member_number_in_button(){
            allpageactions.membernumberclk();

        }


    @And("I click the promotin in button")
    public void click_the_promotin_in_button(){
        allpageactions.promotionButtonclk();


    }

    @And("I fill the assing promotin code")
    public void i_fill_the_assing_username() {
        allpageactions.promotionCode();

    }

    @And("I fill the assing security code")
    public void i_fill_the_security_code() {
        allpageactions.securitycode();

    }


    @And("I click the close in button")
    public void click_the_close_in_button(){
        allpageactions.closeButtonclk();

    }

    @And("I see promotin button")
    public void i_see_promotin_page() {
        allpageactions.verfyPromotion();

    }

    @And("I click the personal informations in button")
    public void click_the_personal_informations_in_button(){
        allpageactions.personalInformationsclk();
    }

    @And("I verify personal number")
    public void click_the_personal_number_verify(){
        allpageactions.verfyPersonalInformations();


    }




}
