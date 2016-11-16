package com.dataart.thucydides.models;

import java.io.File;

//reused from Selenium Course - timestaps for created applications were removed

public class ApplicationBuilder {

    public static Application appNewNoImages() {
        Application app = new Application("TestApp", "Test Description");
        app.setCategory("Maps");
        return app;
    }

    public static Application appEditNoImages() {
        Application app = new Application("TestApp", "Changed Test Description");
        app.setCategory("Information");
        return app;
    }

    public static Application appNewWithImages() {
        Application app = new Application("TestImages", "Test Description");
        app.setCategory("Fun");
        File image = new File("./src/test/resources/images/image.jpg");
        File icon = new File("./src/test/resources/images/icon.jpg");
        app.setImage(image.getAbsolutePath());
        app.setIcon(icon.getAbsolutePath());
        return app;
    }

    public static Application appNewPopular () {
        Application app = new Application("TestPopular", "Test Description");
        app.setCategory("Information");
        app.setDownloads("10");
        return app;
    }


}
