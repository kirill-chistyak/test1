package main.java.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Initialize {

    private static File file = new File("D:/Projects/test1/geckodriver.exe");

    public static WebDriver initialize(){
        System.setProperty("webdriver.firefox.driver", file.getAbsolutePath());
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
