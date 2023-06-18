package pl.coderslab.seleniumexample.selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

public class HotelRegisterUserTest {
    @Test
    public void selectAndFillElements() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.cssSelector("a.user_login.navigation-link"));
        signInButton.click();

        WebElement emailInputBox = driver.findElement(By.id("email_create"));
        String randomEmail = pl.coderslab.seleniumexample.selectors.Utils.randomEmail();
        emailInputBox.sendKeys(randomEmail);
        WebElement createAnAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAnAccountButton.click();

        //First Name
        WebElement firstNameInputBox  = driver.findElement(By.id("customer_firstname"));
        firstNameInputBox.sendKeys("Ala");

        WebElement lastNameInputBox  = driver.findElement(By.id("customer_lastname"));
        lastNameInputBox.sendKeys("Makota");

        WebElement customerEmailInputBox  = driver.findElement(By.id("email"));

        WebElement passwordInputBox  = driver.findElement(By.id("passwd"));
        passwordInputBox.sendKeys("haslo123");

        WebElement registerButton  = driver.findElement(By.id("submitAccount"));
        registerButton.click();
    }
}


