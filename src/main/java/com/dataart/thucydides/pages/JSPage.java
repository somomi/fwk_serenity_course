package com.dataart.thucydides.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Alert;


public class JSPage extends PageObject {

    @FindBy(id = "top")
    WebElementFacade topInput;
    @FindBy(id = "left")
    WebElementFacade leftInput;
    @FindBy(id = "process")
    WebElementFacade processButton;


    private Long top;
    private Long left;

    public void enterCoordinates(Integer top, Integer left) {
        topInput.sendKeys (Integer.toString (top));
        leftInput.sendKeys (Integer.toString (left));
        processButton.click();
    }


    public String getAlertMessage() {
        Alert alert = getDriver().switchTo().alert();
        String AlertText = alert.getText();
        alert.accept();
        return AlertText;
    }


    public Integer getTopCoordinates () {
        top = Math.round((Double) evaluateJavascript("return $('.flash').position().top"));
        return top.intValue();
    }

    public Integer getLeftCoordinates () {
        left = Math.round((Double) evaluateJavascript("return $('.flash').position().left"));
        return left.intValue();
    }


    public String enterCoordinatesAndWaitForAlert(Integer top, Integer left) {
        topInput.sendKeys (Integer.toString (top));
        leftInput.sendKeys (Integer.toString (left));
        processButton.click();
        Alert alert = getDriver().switchTo().alert();
        String AlertText = alert.getText();
        alert.accept();
        return AlertText;
    }
}
