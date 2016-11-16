package com.dataart.thucydides.pages;


import com.dataart.thucydides.models.Application;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class EditApplicationPage extends PageObject {

    @FindBy(xpath = "//textarea[@name='description']")
    WebElementFacade descriptionTextField;
    @FindBy(xpath = "//select[@name='category']")
    WebElementFacade categorySelectField;
    @FindBy(xpath = "//input[@type='submit']")
    WebElementFacade updateButton;


    public void editApplication (Application app) {

        descriptionTextField.type(app.getDescription());
        categorySelectField.selectByVisibleText(app.getCategory());
        updateButton.click();
    }

}
