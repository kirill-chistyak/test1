package main.java.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loader {

    public static void waitForElement(String css, WebDriver driver){
        driver.findElement(By.cssSelector(css));
    }
}
