package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PublicProfilePage {
    private WebDriver driver;
    private By buttonEdit = By.xpath("//*[@id=\"settings-frame\"]/div[2]/div[2]/dl/dd/div/details");
    private By buttonUploadFoto = By.xpath("//*[@id=\"settings-frame\"]/div[2]/div[2]/dl/dd/div/details/details-menu/label");

    public PublicProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonEdit(){
        driver.findElement(buttonEdit).click();
    }

    public void clickButtonUploadFoto(){
        driver.findElement(buttonUploadFoto).click();
    }
}
