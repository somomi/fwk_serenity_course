package com.dataart.thucydides.pages;

import com.dataart.thucydides.models.Application;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class NewApplicationPage extends PageObject {

    public static final String NEW_APPLICATION_TEXT_XPATH = "//div[@class='content']/h1";
    public static final String TITLE_TEXT_FIELD_XPATH = "//input[@name='title']";
    public static final String DESCRIPTION_TEXT_FIELD_XPATH = "//textarea[@name='description']";
    public static final String CATEGORY_SELECT_FIELD_XPATH = "//select[@name='category']";
    public static final String IMAGE_INPUT_FIELD_XPATH = "//input[@name='image']";
    public static final String ICON_INPUT_FIELD_XPATH = "//input[@name='icon']";
    public static final String CREATE_BUTTON_XPATH = "//input[@type='submit']";

    @FindBy(xpath = NEW_APPLICATION_TEXT_XPATH)
    WebElementFacade newApplicationText;
    @FindBy(xpath = TITLE_TEXT_FIELD_XPATH)
    WebElementFacade titleTextField;
    @FindBy(xpath = DESCRIPTION_TEXT_FIELD_XPATH)
    WebElementFacade descriptionTextField;
    @FindBy(xpath = CATEGORY_SELECT_FIELD_XPATH)
    WebElementFacade categorySelectField;
    @FindBy(xpath = CREATE_BUTTON_XPATH)
    WebElementFacade createButton;
    @FindBy(xpath = IMAGE_INPUT_FIELD_XPATH)
    WebElementFacade imageButton;
    @FindBy(xpath = ICON_INPUT_FIELD_XPATH)
    WebElementFacade iconButton;

    public String getNewApplicationText () {
        return newApplicationText.getText();
    }

    public void createNewApplication (Application app) {
        titleTextField.type(app.getTitle());
        descriptionTextField.type(app.getDescription());
        categorySelectField.selectByVisibleText(app.getCategory());
        if (app.getImage() != null) {
            imageButton.sendKeys(app.getImage());
        }
        if (app.getIcon() != null) {
            iconButton.sendKeys(app.getIcon());
        }
        createButton.click();
    }

}
