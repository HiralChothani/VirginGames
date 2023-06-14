package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AllGamesPage extends Utility {
    private static final Logger log = LogManager.getLogger(AllGamesPage.class.getName());

    public AllGamesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='StyledGameTile-sc-1d6xa41-3 cKKGqB gameTile tall']//a")
    List<WebElement> gameNames;

    public boolean isGamesDisplayed(String game) {
        for (WebElement e : gameNames) {
            if (e.getText().contains(game)) {
                break;
            }
        }
        return true;
    }

    public void verifyAllGamesPage(String url) {
        String actual = driver.getCurrentUrl();
        boolean expected = actual.contains(url);
        Assert.assertTrue(expected);
        log.info("verifying All Games url: '" + actual + "'");
    }
}
