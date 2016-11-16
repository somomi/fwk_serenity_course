package com.dataart.thucydides.steps;


import com.dataart.thucydides.models.User;
import com.dataart.thucydides.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static com.dataart.thucydides.models.UserBuilder.developer;
import static com.dataart.thucydides.models.UserBuilder.simpleUser;

public class RegistrationSteps extends ScenarioSteps {
    private User user;
    RegisterPage registerPage;


    @Step
    public void register_new_user () {
        user = simpleUser();
        registerPage.registerNewUser(user);
    }

    @Step
    public void register_new_dev () {
        user = developer();
        registerPage.registerNewUser(user);
    }

}
