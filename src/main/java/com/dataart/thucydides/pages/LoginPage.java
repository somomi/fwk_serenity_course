package com.dataart.thucydides.pages;

import com.dataart.thucydides.models.User;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.SystemEnvironmentVariables;


public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@id='j_username']")
    WebElementFacade userNameTextField;
    @FindBy(xpath = "//input[@id='j_password']")
    WebElementFacade passwordTextField;
    @FindBy(xpath = "//div[@class='form']/form/input")
    WebElementFacade loginButton;
    @FindBy(xpath = "//a[@href='../register']")
    WebElementFacade newUserButton;
    @FindBy(xpath = "//a[@href='/auth/logout']")
    WebElementFacade logoutButton;

    private String authentication = SystemEnvironmentVariables.createEnvironmentVariables().getProperty("selenium.authentication");
    private String basicUrl = SystemEnvironmentVariables.createEnvironmentVariables().getProperty("selenium.baseUrl");

    public void logoutFromHomePage () {
        if (logoutButton.isCurrentlyVisible()) {
            logoutButton.click();
        }
    }

    public void openLoginPage () {
        if (!authentication.equals("basic")) {
            getDriver().get("http://" + basicUrl);
            getDriver().manage().window().maximize();
        }
    }

    public void loginAs(User user) {

        if (authentication.equals("basic")) {
            getDriver().get("http://" + user.getUsername() + ":" + user.getPassword() + "@" + basicUrl);
            getDriver().manage().window().maximize();
        } else {
            userNameTextField.clear();
            passwordTextField.clear();
            userNameTextField.sendKeys(user.getUsername());
            passwordTextField.sendKeys(user.getPassword());
            loginButton.click();
        }
    }


    public void registerNewUserLink () {
        newUserButton.click();
    }

    public void waitForMessage (String msg) {
        waitForTextToAppear(msg, 10000);
    }


}
