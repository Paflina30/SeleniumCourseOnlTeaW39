package pl.coderslab.seleniumexample;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zad2 {
    @Test
    public void searchWithCL() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.navigate().forward();
        //        driver.quit();
    }
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back();
        driver.navigate().forward();
//        driver.quit();
    }
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.navigate().back();
        driver.navigate().forward();
//        driver.quit();
    }
}

