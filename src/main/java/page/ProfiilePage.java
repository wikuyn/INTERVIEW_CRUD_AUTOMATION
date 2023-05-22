package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfiilePage {
    private WebDriver driver;
    private By fotoProfile = By.xpath("/html/body/div[1]/div[6]/main/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/a/img");

    public ProfiilePage(WebDriver driver) {
        this.driver = driver;
    }

    public PublicProfilePage clickFotoPofile(){
        driver.findElement(fotoProfile).click();
        return new PublicProfilePage(driver);
    }
}
