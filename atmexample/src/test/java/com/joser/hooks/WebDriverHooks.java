package com.joser.hooks;

import com.joser.helper.KnowsTheDomain;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

public class WebDriverHooks {

    private KnowsTheDomain helper;

    public WebDriverHooks() {
        this.helper = KnowsTheDomain.getInstance();
    }

    @After
    public void afterScenario(Scenario scenario) throws Exception {
        byte[] screenshot = helper.getWebDriver().getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "failed");
        helper.getWebDriver().close();
        System.out.println("************** Finishing scenario ********************" + scenario.getStatus());
    }
}
