package phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FlightsInMainMenu {
    WebDriver driver;

    public FlightsInMainMenu(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnFlights(){
        WebElement flightsButton = driver.findElement(By.xpath("/html/body/div[5]/section/div[2]/div/div/div[2]/ul/li[2]/a"));
        flightsButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
