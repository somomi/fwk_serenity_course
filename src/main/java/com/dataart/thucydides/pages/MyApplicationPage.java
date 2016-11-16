package com.dataart.thucydides.pages;

import com.dataart.thucydides.models.Application;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class MyApplicationPage extends PageObject {

    public static final String ADD_APPLICATION_LINK_FIELD_XPATH = "//div[@class='new-app-link']/a[@href='/new']";
    public static final String TITLE_APPLICATION_TEXT_FIELD_XPATH = "//div[@class='name']";
    public static final String DESCRIPTION_APPLICATION_TEXT_FIELD_XPATH = "//div[@class='description' and contains(., 'Description')]";
    public static final String CATEGORY_APPLICATION_LINK_FIELD_XPATH = "//div[@class='description' and contains(., 'Category')]";
    public static final String DOWNLOAD_BUTTON_XPATH = "//div[@class='download-button']/a";
    public static final String EDIT_BUTTON_XPATH = "//div[@class='edit-app-button']/a[contains(@href,'edit')]";
    public static final String DELETE_BUTTON_XPATH = "//div[@class='edit-app-button']/a[contains(@href,'delete')]";
    public static final String JSON_TEXT_XPATH = "//body";

    @FindBy(xpath = ADD_APPLICATION_LINK_FIELD_XPATH)
    public WebElementFacade newApplication;
    @FindBy(xpath = TITLE_APPLICATION_TEXT_FIELD_XPATH)
    WebElementFacade titleText;
    @FindBy(xpath = DESCRIPTION_APPLICATION_TEXT_FIELD_XPATH)
    WebElementFacade descriptionText;
    @FindBy(xpath = CATEGORY_APPLICATION_LINK_FIELD_XPATH)
    WebElementFacade categoryText;
    @FindBy(xpath = DOWNLOAD_BUTTON_XPATH)
    WebElementFacade downloadButton;
    @FindBy(xpath = EDIT_BUTTON_XPATH)
    WebElementFacade editButton;
    @FindBy(xpath = DELETE_BUTTON_XPATH)
    WebElementFacade deleteButton;
    @FindBy(xpath = JSON_TEXT_XPATH)
    WebElementFacade jsonText;

    public void openNewApplications () {
        newApplication.click();
    }

    public void openEditApplicationPage () {
        editButton.click();
    }

    public void deleteApplicationPage (boolean confirm) {
        deleteButton.click();
        if (confirm) {
            getDriver().switchTo().alert().accept();
        } else {
            getDriver().switchTo().alert().dismiss();
        }
    }

    public void openDownloadPage () {
        downloadButton.click();
    }

    public Application getDataFromApplicationDownloadPage () throws ParseException {
        Application app = new Application (null, null);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonText.getText());
        app.setTitle((String) jsonObject.get("title"));
        app.setDescription ((String) jsonObject.get("description"));
        app.setCategory((String) ((JSONObject) jsonObject.get("category")).get("title"));
        app.setImage ((String) jsonObject.get("imageData"));
        app.setIcon ((String) jsonObject.get("iconData"));
        app.setDownloads(jsonObject.get("numberOfDownloads").toString());
        return app;
    }


}
