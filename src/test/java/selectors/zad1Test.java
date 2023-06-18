package selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class zad1Test {
    @Test
    public void selectAndFillElements() {
        WebDriver driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElemnet hotelLocationInputBox = driver.findElement(By.id("hotel_location"));
        hotelLocationInputBox.sendKays("Warsaw");
        
    }
}
