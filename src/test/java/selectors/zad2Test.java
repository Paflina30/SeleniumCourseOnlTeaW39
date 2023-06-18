package pl.coderslab.seleniumcourseonlteaw39.selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zad2Test {
    @Test
    public void selectAndFillElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocationField = driver.findElement(By.name("hotel_location"));
        hotelLocationField.sendKeys("Warsaw");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("test@test.com");

        WebElement searchButton = driver.findElement(By.name("search_room_submit"));
        searchButton.submit();

        driver.quit();
    }
}    
