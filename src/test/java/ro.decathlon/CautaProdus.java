package ro.decathlon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CautaProdus {
    @Test
    public void deschidePagina() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.decathlon.ro/";
        driver.manage().window().maximize();
        driver.get(url);
        new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("didomi-notice-agree-button")).click();
        WebElement cautaProdus = driver.findElement(By.xpath("//*[@id=\"search-bar\"]/div/form/input"));
        cautaProdus.sendKeys("cort");
      cautaProdus.submit();
        String mesajCort = "cort";
        WebElement mesajCorect = driver.findElement(By.xpath("//*[@id=\"search-suggestions-banner\"]/div/div[1]/div[2]"));
Assert.assertTrue(mesajCort.contains("cort"));
    }
}