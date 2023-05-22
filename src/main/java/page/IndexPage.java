package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IndexPage {
    private WebDriver driver;
    private By buttonSignIn = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div[2]/a");

    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignInPage clickButtonSignIn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(buttonSignIn));
        driver.findElement(buttonSignIn).click();
        return new SignInPage(driver);
    }
}
