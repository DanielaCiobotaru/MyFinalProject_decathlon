package ro.decathlon;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Login {
   @Test
           public void loginTest() {
       System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       String url = "https://www.decathlon.ro/";
       driver.manage().window().maximize();
       driver.get(url);
       new WebDriverWait(driver, Duration.ofSeconds(10));
       driver.findElement(By.id("didomi-notice-agree-button")).click();
       driver.findElement(By.xpath("//*[@id=\"app\"]/header/div[1]/nav/div[2]/div[4]/a")).click();
WebElement emailInput = driver.findElement(By.id("input-email"));
emailInput.sendKeys("bleunuage2000@gmail.com");
driver.findElement(By.id("lookup-btn-container")).click();
WebElement passwordInput = driver.findElement(By.id("input-password"));
passwordInput.sendKeys("Bleunuage1982!");








           }
   }


