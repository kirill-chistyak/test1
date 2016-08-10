import main.java.pages.*;
import main.java.pages.TestmatickIndexPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static main.java.util.Initialize.initialize;
import static org.testng.Assert.*;


public class TestmatickTest {

    private String result;
    private WebDriver driver = initialize();
    private GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
    private TestmatickIndexPage testmatickIndexPage = new TestmatickIndexPage(driver);
    private AutomatedTestingPage automatedTestingPage = new AutomatedTestingPage(driver);


    @Test
    public void searchSite(){
        result = googleSearchPage.searchByQuery("testmatick testing company");
        assertEquals(result, "testmatick testing company - Поиск в Google");
    }

    @Test(dependsOnMethods = "searchSite")
    public void transferToResultingPage(){
        result = googleSearchPage.goToSearchResult();
        assertEquals(result, "TestMatick: Software Testing Company | Software Testing Services");
    }

    @Test(dependsOnMethods = "transferToResultingPage")
    public void isLogoPresentTest(){
        boolean result = testmatickIndexPage.isLogoPresent();
        assertTrue(result, "logo is absent");
    }

    @Test(dependsOnMethods = "isLogoPresentTest")
    public void goToAutoTestPageTest(){
        result = testmatickIndexPage.goToAutoTestPage();
        assertEquals(result, "Automated Testing Services | TestMatick");
    }

    @Test(dependsOnMethods = "goToAutoTestPageTest")
    public void isHeaderTextPresentTest(){
        driver.get("http://testmatick.com/our-qa-services/automated-testing-services/");
        boolean result = automatedTestingPage.isHeaderTextPresent();
        assertTrue(result);
    }
}