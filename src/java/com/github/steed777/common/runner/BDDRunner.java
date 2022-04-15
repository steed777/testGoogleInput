package com.github.steed777.common.runner;


import com.github.steed777.common.Application;
import com.github.steed777.common.Browser;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;


@CucumberOptions (
        plugin = {
                "pretty",
                "json:target/cucumber.json"},
        features = "src/test/resources/features/",
        glue = "com.github.steed777.steps")
public class BDDRunner extends AbstractTestNGCucumberTests {


    @AfterClass(alwaysRun = true)
    public void browserClose() {

        try {
            Thread.sleep(3000);
            Browser.getDriver().quit();
        } catch (Exception ex) {
            Application.error("Что то пошло не так", ex);
        }
    }
}
