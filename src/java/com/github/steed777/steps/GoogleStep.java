package com.github.steed777.steps;


import com.github.steed777.common.Browser;

import com.github.steed777.flow.GoogleFlow;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class GoogleStep {


    @When("Go to the testing page")
    public void pageAuthorization() {
        GoogleFlow.goGooglePage();

    }

    @When("Ввод в поле поиска 'купить кофемашину bork c804' нажать найти")
    public void authorizationUser() {
        GoogleFlow.enterNameMachine();
    }
}
