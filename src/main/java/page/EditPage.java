package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {
    private WebDriver driver;
    private By inputDescriptionReadme = By.xpath("//*[@id=\"repo-content-pjax-container\"]/react-app/div/div/div[2]/div[1]/div/div/main/div[2]/div/div[3]/div[2]/div/div[2]/file-attachment/div[1]/div[5]/div[1]/div/div/div/div[5]/div[2]/pre/span");
    private By inputDescriptionReadme1 = By.xpath("//*[@id=\"repo-content-pjax-container\"]/react-app/div/div/div[2]/div[1]/div/div/main/div[2]/div/div[3]/div[2]/div/div[2]/file-attachment/div[1]/div[5]/div[1]/div/div/div/div[5]/div[2]/pre/span");
    private By buttonCommitChange = By.xpath("//*[@id=\"repo-content-pjax-container\"]/react-app/div/div/div[2]/div[1]/div/div/main/div[2]/div/div[3]/div[1]/div[2]/button");
    private By buttonCancleChange = By.xpath("//*[@id=\"repo-content-pjax-container\"]/react-app/div/div/div[2]/div[1]/div/div/main/div[2]/div/div[3]/div[1]/div[2]/a");
    private By dialogButtonCommitChange = By.xpath("//*[@id=\"__primerPortalRoot__\"]/div/div/div/div[3]/button[2]");

    public EditPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearInputDescritionReadme(){
        driver.findElement(inputDescriptionReadme).clear();
    }

    public void setInputDescriptionReadme(String descriptionReadme) {
        driver.findElement(inputDescriptionReadme).sendKeys(descriptionReadme);
    }

    public void setInputDescriptionReadme1(String descriptionReadme) {
        driver.findElement(inputDescriptionReadme1).sendKeys(descriptionReadme);
    }

    public void clickButtonCommitChange(){
        driver.findElement(buttonCommitChange).click();
    }

    public void clickButtonCancleChange(){
        driver.findElement(buttonCancleChange).click();
    }

    public DetailReadme alertOk(){
        driver.switchTo().alert().accept();
        return new DetailReadme(driver);
    }

    public void alertCancle(){
        driver.switchTo().alert().dismiss();
    }

    public DetailReadme clickButtonDialogCommit(){
        driver.findElement(dialogButtonCommitChange).click();
        return new DetailReadme(driver);
    }
}
