package ro.decathlon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class AlegeCort {
    @Test
    public void deschidePagina() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.decathlon.ro/p/cort-cu-bete-camping-arpenaz-4-1-4-persoane-1-camera/_/R-p-4123?mc=8648383";
        driver.manage().window().maximize();
        driver.get(url);
        new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("didomi-notice-agree-button")).click();
        WebElement alegeCort = driver.findElement(By.xpath("//*[@id=\"app\"]/main/article/div[3]/div[1]/div[4]/div[2]/div/div/button[1]"));
    alegeCort.click();
    String mesajCortInCos = "Adăugat cu succes în coș!";
       Assert.assertTrue(mesajCortInCos.contains("Adăugat cu succes în coș"));
    }
}
