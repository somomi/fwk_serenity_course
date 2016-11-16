package com.dataart.thucydides.steps;

import com.dataart.thucydides.models.User;
import com.dataart.thucydides.pages.AjaxPage;
import com.dataart.thucydides.pages.HomePage;
import com.dataart.thucydides.pages.JSPage;
import com.dataart.thucydides.pages.LoginPage;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.dataart.thucydides.models.UserBuilder.admin;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class NavigationSteps extends ScenarioSteps {

    private User user;
    LoginPage loginPage;
    HomePage homePage;
    AjaxPage ajaxPage;
    JSPage jsPage;

    @Step
    public void logout_from_app () {
        loginPage.logoutFromHomePage();
    }

    @Step
    public void opens_the_login_page() {
        loginPage.openLoginPage();
        loginPage.logoutFromHomePage();
    }

    @Step
    @Screenshots(onlyOnFailures=true)
    public void enter_the_username_and_password (String username, String password) {
        user = admin();
        user.setUsername(username);
        user.setPassword(password);
        loginPage.loginAs(user);
    }

    @Step
    public void see_welcome_page (String msg) {
        assertThat(homePage.getWelcomeMessage(), is(msg));
    }

    @Step
    public void see_message_on_the_login_page (String msg) {
        loginPage.waitForMessage(msg);
    }

    @Step
    public void opens_the_register_user_page() {
        loginPage.registerNewUserLink();
    }

    @Step
    public void open_home_page () {
        homePage.openHomePage();
    }

    @Step
    public void open_js_page () {
        homePage.openJSPage();
    }

    @Step
    public void enter_coordinates_on_js_page () {
        jsPage.enterCoordinates(jsPage.getTopCoordinates(), jsPage.getLeftCoordinates());
    }

    @Step
    public void wait_for_alert_on_js_page (String result) {
        assertThat(jsPage.getAlertMessage(), is(result));
    }

    @Step
    public void open_ajax_page () {
        homePage.openAjaxPage();
    }

    @Step
    public void enter_values_on_ajax_page (String first, String second) {
        ajaxPage.enterValuesAndPressSum(first, second);
    }

    @Step
    public void wait_for_results_on_ajax_page (String result) {
        ajaxPage.waitForResults (result);
    }

    public void enter_coordinates_on_js_page_and_wait_for_alert(String result) {
        String alert = jsPage.enterCoordinatesAndWaitForAlert(jsPage.getTopCoordinates(), jsPage.getLeftCoordinates());
        assertThat(result, is(alert));
    }
}
