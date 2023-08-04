package ro.decathlon;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SelectieCortReducere {
    @Test
    public void deschidePagina() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.decathlon.ro/search?Ntt=cort";
        driver.manage().window().maximize();
        driver.get(url);
        new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("didomi-notice-agree-button")).click();
        WebElement filtrareReducere = driver.findElement(By.xpath("//*[@id=\"start-of-listing\"]/div[2]/div/div/button/span[1]"));
        filtrareReducere.click();
        WebElement optiuneaReducere = driver.findElement(By.id("option-list-sort-select-3"));
        optiuneaReducere.click();
        Assert.assertTrue(optiuneaReducere.isEnabled());
    }
}

