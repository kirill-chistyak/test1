package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static main.java.util.Loader.waitForElement;

public class TestmatickIndexPage {

    private WebDriver driver;
    private By pageHeader = By.cssSelector(".logo_img img");
    private By textOfLink = By.cssSelector("#menu a[href$=\"automated-testing-services/\"]");

    public TestmatickIndexPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isLogoPresent(){
        return driver.findElements(pageHeader).size() > 0;
    }

    public String goToAutoTestPage(){
        WebElement element;
        element = driver.findElement(textOfLink);
        driver.get(element.getAttribute("href"));
        waitForElement(".button_blue", driver);
        return driver.getTitle();
    }
}