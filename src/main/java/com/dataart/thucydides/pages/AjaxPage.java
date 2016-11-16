package com.dataart.thucydides.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AjaxPage extends PageObject {

    @FindBy(id = "x")
    private WebElement xInput;
    @FindBy(id = "y")
    private WebElement yInput;
    @FindBy(id = "calc")
    private WebElement sumButton;
    @FindBy(id = "clear")
    private WebElement clearButton;


    public void enterValuesAndPressSum (String x, String y) {
        xInput.sendKeys (x);
        yInput.sendKeys (y);
        sumButton.click();
    }

    public void waitForResults (String result) {
        waitForTextToAppear(result, 30000);
    }


}
