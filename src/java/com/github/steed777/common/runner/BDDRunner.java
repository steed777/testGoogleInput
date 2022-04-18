package com.github.steed777.common.runner;


import com.github.steed777.common.Application;
import com.github.steed777.common.Browser;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {
                "pretty",
              //  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
               // "json:target/cucumber.json"
        },
        features = "src/test/resources/features/",
        glue = "com.github.steed777.steps")
public class BDDRunner{


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
