package com.centrilli.step_definitions;

import com.centrilli.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void teardownScenario(Scenario scenario){

        //if scenario fails take screenshot
        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot)Driver.setDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        Driver.quitBrowser();
    }
}
