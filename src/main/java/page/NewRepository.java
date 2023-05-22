package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewRepository {
    private WebDriver driver;
    private By textDescription = By.xpath("//*[@id=\"readme\"]/div[2]/article/p");
    private By buttonEdit = By.className("Box-btn-octicon");
    private By buttonSetting = By.id("settings-tab");

    public NewRepository(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextDescription() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(textDescription));
        return driver.findElement(textDescription).getText();
    }

    public EditPage clickButtonEdit(){
        driver.findElement(buttonEdit).click();
        return new EditPage(driver);
    }

    public SettingPage clickButtonSetting(){
        driver.findElement(buttonSetting).click();
        return new SettingPage(driver);
    }

}
