package ro.decathlon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class OpenPage {
        @Test
        public void deschidePagina() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String url = "https://www.decathlon.ro/";
            driver.manage().window().maximize();
            driver.get(url);
            new WebDriverWait(driver, Duration.ofSeconds(5));
            driver.findElement(By.id("didomi-notice-agree-button")).click();
            Assert.assertEquals(url, driver.getCurrentUrl());

            driver.manage().deleteAllCookies();
        }
    }



