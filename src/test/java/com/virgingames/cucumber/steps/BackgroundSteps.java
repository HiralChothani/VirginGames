package com.virgingames.cucumber.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class BackgroundSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new HomePage().clickOnAcceptAllCookies();
        new HomePage().verifyHomePage();
    }


    @And("^I mouse hover on \"([^\"]*)\" tab$")
    public void iMouseHoverOnTab(String tabs){
        new HomePage().clickOnAllGamesTab();
    }
}
