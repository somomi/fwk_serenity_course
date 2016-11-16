package com.dataart.thucydides.behaves;

import com.dataart.thucydides.steps.NavigationSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class NavigationBehaves {

    @Steps
    NavigationSteps navigationSteps;

    @Given("user is on login page")
    @When("user is on login page")
    public void open_login_page () {
        navigationSteps.opens_the_login_page();
    }

    @When("user enter login '$username' and password '$password'")
    @Given("user enter login '$username' and password '$password'")
    public void login_with_username_and_password (String username, String password) {
        navigationSteps.enter_the_username_and_password(username, password);
    }

    @Then("user see correct welcome message '$msg' on home page")
    public void is_correct_home_page (String msg) {
        navigationSteps.see_welcome_page(msg);
    }

    @Then("user see message '$msg'")
    public void is_see_message_on_the_login_page (String msg) {
        navigationSteps.see_message_on_the_login_page(msg);
    }

    @Given ("user opens user registration")
    public void open_register_user ()
    {
        navigationSteps.opens_the_register_user_page();
    }

    @When ("user open js page")
    public void open_js_page () {
        navigationSteps.open_js_page();
    }

    @When ("user enter coordinates of div")
    public void enter_coordinates_on_js_page () {
        navigationSteps.enter_coordinates_on_js_page();
    }

    @Then ("user enter coordinates of div and wait for alert with text '$result'")
    public void enter_coordinates_on_js_page_and_wait_for_alert(String result){
        navigationSteps.enter_coordinates_on_js_page_and_wait_for_alert(result);
    }

    @Then ("user waiting alert with text '$result'")
    public void wait_for_alert_on_js_page (String result) {
        navigationSteps.wait_for_alert_on_js_page(result);
    }

    @When ("user open ajax page")
    public void open_ajax_page () {
        navigationSteps.open_ajax_page();
    }

    @When ("user enter to first field '$first' and to second field '$second'")
    public void enter_values_on_ajax_page (String first, String second) {
        navigationSteps.enter_values_on_ajax_page(first, second);
    }

    @Then ("user waiting for result text '$result'")
    public void wait_for_results_on_ajax_page (String result) {
        navigationSteps.wait_for_results_on_ajax_page(result);
    }

}
