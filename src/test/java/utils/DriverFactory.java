package utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import config.ConfigReader;

public class DriverFactory {

    static WebDriver driver;

    public static WebDriver initDriver() {
        ConfigReader config = new ConfigReader();
        
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");

        System.setProperty("webdriver.chrome.driver",  "G:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(config.get("url"));

        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }
}