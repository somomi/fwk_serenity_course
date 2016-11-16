package com.dataart.thucydides.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class HomePage extends PageObject {

    @FindBy(xpath = "//a[@href='/my']")
    public WebElementFacade myApplicationsLink;
    @FindBy(xpath = "//a[@href='/js/']")
    WebElementFacade jsPageLink;
    @FindBy(xpath = "//a[@href='/calc/']")
    WebElementFacade ajaxPageLink;
    @FindBy(xpath = "//a[@href='/']")
    WebElementFacade homePageLink;
    @FindBy(xpath = "//div[@class='header']/div[@class='welcome']")
    WebElementFacade welcomeText;

    public String getWelcomeMessage() {
     return welcomeText.getText();
    }

    public void openMyApplications () {
        myApplicationsLink.click();
    }

    public static final String APP_XPATH = "//a[@href='/app?title=%s']";
    public static final String POPULAR_APP_XPATH = "//div[@class='popular-app']/a[@href='/app?title=%s']";

    public void openMyPopularApplication (String title) {
        element(By.xpath((String.format(POPULAR_APP_XPATH, title)))).click();
    }


    public void openApplicationDetails (String title) {
        element (By.xpath((String.format(APP_XPATH, title)))).click();
    }

    public Boolean getAppByTitle (String title) {
        return element (By.xpath((String.format(APP_XPATH, title)))).isCurrentlyVisible();
    }

    public void validateThatAppRemoved (String title) {
        setImplicitTimeout(1, TimeUnit.MILLISECONDS);
        shouldNotBeVisible(By.xpath(String.format(APP_XPATH, title)));
        resetImplicitTimeout();
     }

    public void openJSPage () {
        jsPageLink.click();
    }

    public void openAjaxPage () {
        ajaxPageLink.click();
    }

    public void openHomePage () {
        homePageLink.click();
    }


}
