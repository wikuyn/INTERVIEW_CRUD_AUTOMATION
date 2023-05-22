package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingPage {
    private WebDriver driver;
    private By buttonDeleteRepository = By.id("dialog-show-repo-delete-menu-dialog");
    private By buttonIwantToDelete = By.id("repo-delete-proceed-button");
    private By textRepositoryName = By.xpath("//*[@id=\"repo-delete-menu-dialog\"]/div[2]/div[1]/p");
    private By inputVerification = By.id("verification_field");

    public SettingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonDeleteRepository(){
        driver.findElement(buttonDeleteRepository).click();
    }

    public void clickButtonIwantToDelete(){
        driver.findElement(buttonIwantToDelete).click();
        driver.findElement(buttonIwantToDelete).click();
    }

    public String getRepositoryName(){
        return driver.findElement(textRepositoryName).getText();
    }

    public void setInputVerification(String reponame){
        driver.findElement(inputVerification).sendKeys(reponame);
    }

    public RepositoryPage clickButtonDeleteRepositoryFinal(){
        driver.findElement(buttonIwantToDelete).click();
        return new RepositoryPage(driver);
    }
}
