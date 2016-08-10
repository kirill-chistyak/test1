package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static main.java.util.Loader.waitForElement;

public class GoogleSearchPage {

    private WebElement element;
    private WebDriver driver;
    private By resultFound = By.xpath("//a[text() = 'TestMatick: Software Testing Company | Software Testing Services']");

    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
    }

    public String searchByQuery(String query) {
        driver.get("http://www.google.com");
        element = driver.findElement(By.name("q"));
        element.sendKeys(query);
        element.submit();
        waitForElement("#navcnt", driver);
        return driver.getTitle();
    }

    public String goToSearchResult(){
        element = driver.findElement(resultFound);
        element.click();
        waitForElement("#su-footer-links", driver);
        return driver.getTitle();
    }
}