package com.dataart.thucydides.pages;

import com.dataart.thucydides.models.User;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class RegisterPage extends PageObject {

    public static final String USER_NAME_TEXT_FIELD_XPATH = "//input[@name='name']";
    public static final String FIRST_NAME_TEXT_FIELD_XPATH = "//input[@name='fname']";
    public static final String LAST_NAME_TEXT_FIELD_XPATH = "//input[@name='lname']";
    public static final String PASSWORD_TEXT_FIELD_XPATH = "//input[@name='password']";
    public static final String CONFIRM_PASSWORD_TEXT_FIELD_XPATH = "//input[@name='passwordConfirm']";
    public static final String ROLE_BOX_FIELD_XPATH = "//select[@name='role']";
    public static final String REGISTER_BUTTON_XPATH = "//input[@type='submit']";

    @FindBy(xpath = USER_NAME_TEXT_FIELD_XPATH)
    WebElementFacade userNameTextField;
    @FindBy(xpath = FIRST_NAME_TEXT_FIELD_XPATH)
    WebElementFacade firstNameTextField;
    @FindBy(xpath = LAST_NAME_TEXT_FIELD_XPATH)
    WebElementFacade lastNameTextField;
    @FindBy(xpath = PASSWORD_TEXT_FIELD_XPATH)
    WebElementFacade passwordTextField;
    @FindBy(xpath = CONFIRM_PASSWORD_TEXT_FIELD_XPATH)
    WebElementFacade confirmPasswordTextField;
    @FindBy(xpath = ROLE_BOX_FIELD_XPATH)
    WebElementFacade roleBoxField;
    @FindBy(xpath = REGISTER_BUTTON_XPATH)
    WebElementFacade registerButton;

    public void registerNewUser (User user) {
        userNameTextField.sendKeys(user.getUsername());
        firstNameTextField.sendKeys(user.getFname());
        lastNameTextField.sendKeys(user.getLname());
        passwordTextField.sendKeys(user.getPassword());
        confirmPasswordTextField.sendKeys(user.getPassword());
        roleBoxField.sendKeys (user.getRole());
        registerButton.click();
    }

}
