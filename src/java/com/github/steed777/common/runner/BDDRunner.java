package com.github.steed777.common.runner;


import com.github.steed777.common.Application;
import com.github.steed777.common.Browser;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {
                "pretty",
                  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
                // "json:target/cucumber.json"
        },
        features = "src/test/resources/features/",
        // allure-results = "target",
        glue = "com.github.steed777.steps",
        publish = true)
public class BDDRunner extends AbstractTestNGCucumberTests {


    /*@AfterClass
    public void browserClose() {

        try {
            Thread.sleep(3000);
            Browser.getDriver().quit();
        } catch (Exception ex) {
            Application.error("Что то пошло не так", ex);
        }
    }*/
}
