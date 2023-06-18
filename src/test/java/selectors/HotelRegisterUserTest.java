package pl.coderslab.seleniumexample.selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Zadanie 1
//Funkcje
//Będąc na stronie rejestracji nowego użytkownika
@@ -26,8 +29,9 @@ public class HotelRegisterUserTest {
    public void selectAndFillElements() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));

        // given
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        // when
        WebElement signInButton = driver.findElement(By.cssSelector("a.user_login.navigation-link"));
        signInButton.click();

        @@ -54,5 +58,10 @@ public void selectAndFillElements() {

            WebElement registerButton  = driver.findElement(By.id("submitAccount"));
            registerButton.click();
            // then
            WebElement accountCreationSuccessfulPanel = driver.findElement(By.cssSelector("p.alert.alert-success"));
            assertTrue(accountCreationSuccessfulPanel.isDisplayed());
            String panelText = accountCreationSuccessfulPanel.getText();
            assertEquals("Your account has been created.", panelText);
        }
    }