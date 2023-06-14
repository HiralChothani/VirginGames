package com.virgingames.pages;

import com.virgingames.propertyreader.PropertyReader;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Accept']")
    WebElement acceptAllCookiesBtn;
    @CacheLookup
    @FindBy(xpath = "//a[@title='All Games']")
    WebElement allGamesTab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='StyledNavigationMenuWrapper-sc-v46bks-0 gLfsfR']//ul//li//a")
    List<WebElement> menuList;

    public void verifyHomePage() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("verifying homepage url.");
        AssertJUnit.assertEquals(expectedUrl, actualUrl);
    }

    public void clickOnAcceptAllCookies() {
        clickOnElement(acceptAllCookiesBtn);

    }

    public void clickOnAllGamesTab(){
        clickOnElement(allGamesTab);

    }
}
