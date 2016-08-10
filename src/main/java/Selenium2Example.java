package main.java;

import main.java.util.Initialize;
import org.openqa.selenium.WebDriver;
import main.java.pages.*;

class Selenium2Example  {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Initialize.initialize();
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.searchByQuery("testmatick testing company");
        googleSearchPage.goToSearchResult();
        TestmatickIndexPage testmatickIndexPage = new TestmatickIndexPage(driver);
        testmatickIndexPage.isLogoPresent();
        testmatickIndexPage.goToAutoTestPage();
        AutomatedTestingPage automatedTestingPage = new AutomatedTestingPage(driver);
        automatedTestingPage.isHeaderTextPresent();
        driver.quit();
    }
}