package com.virgingames.cucumber.steps;

import com.virgingames.pages.AllGamesPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class AllGamesSteps {

    @When("^I click \"([^\"]*)\" tab$")
    public void iClickTab(String tabName) {

    }

    @Then("^I navigate to \"([^\"]*)\" url page$")
    public void iNavigateToUrlPage(String url) {
        new AllGamesPage().verifyAllGamesPage(url);
    }

    @And("^I should see the games names displayed on page$")
    public void iShouldSeeTheGamesNamesDisplayedOnPage(DataTable dataTable) {

            List<String> gamesName = dataTable.asList(String.class);
            SoftAssert softAssertions = new SoftAssert();
            for (int i = 1; i <= gamesName.size() - 1; i++) {
                softAssertions.assertTrue(new AllGamesPage().isGamesDisplayed(gamesName.get(i)),"'"+gamesName.get(i)+"' game not found");
            }
            softAssertions.assertAll();
        }
    }

