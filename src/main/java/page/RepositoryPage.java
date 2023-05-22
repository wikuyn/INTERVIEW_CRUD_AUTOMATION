package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepositoryPage {
    private WebDriver driver;
    private By notificationSuccess = By.id("js-flash-container");
    private boolean show = false;

    public RepositoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean notificationShowing(){
        driver.findElement(notificationSuccess).isDisplayed();
        show = true;
        return show;
    }
}
