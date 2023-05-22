package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {
    private WebDriver driver;
    private By inputUsernameOrEmail = By.id("login_field");
    private By inputPassword = By.id("password");
    private By buttonSignIn = By.name("commit");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setInputUsernameOrEmail(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(inputUsernameOrEmail));
        driver.findElement(inputUsernameOrEmail).sendKeys(password);
    }

    public void setInputPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(inputPassword));
        driver.findElement(inputPassword).sendKeys(password);
    }

    public HomePage clickButtonSignIn(){
        driver.findElement(buttonSignIn).click();
        return new HomePage(driver);
    }
}
