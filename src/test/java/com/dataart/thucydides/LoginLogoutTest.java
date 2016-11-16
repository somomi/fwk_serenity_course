package com.dataart.thucydides;


import net.serenitybdd.jbehave.SerenityStory;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.StoryControls;

/**
 * Created by achernyshev on 16.11.2016.
 */

public class LoginLogoutTest extends SerenityStory {
    public LoginLogoutTest() {
        Configuration configuration = new MostUsefulConfiguration()
                .useStoryControls(new StoryControls().doResetStateBeforeScenario(false));
        findStoriesCalled("**/stories/LoginLogout.story");
    }
}
