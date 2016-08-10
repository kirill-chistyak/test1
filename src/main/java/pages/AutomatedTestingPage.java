package main.java.pages;

import org.openqa.selenium.*;

public class AutomatedTestingPage {

    private WebDriver driver;
    private By pageHeader = By.cssSelector(".section_big_title h1 strong");

    public AutomatedTestingPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isHeaderTextPresent() {
        WebElement element = driver.findElement(pageHeader);
        element.sendKeys(Keys.END);
        return element.getText().length() != 0;
    }
}