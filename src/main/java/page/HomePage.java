package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By buttonCreateRepo = By.xpath("/html/body/div[1]/div[6]/div/div/aside/div/loading-context/div/div[1]/div/div/a[1]");
    private By buttonCreateRepoAnother = By.xpath("/html/body/div[1]/div[6]/div/div/aside/div/loading-context/div/div[1]/div/h2/a");
    private By repositoryPercobaan1 = By.xpath("/html/body/div[1]/div[6]/div/div/aside/div/loading-context/div/div[1]/div/ul/li/div/div/a");
    private By fotoProfile = By.xpath("/html/body/div[1]/div[1]/header/div[7]/details/summary/img");
    private By buttonProfile = By.linkText("Your profile");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public NewPage clickButtonCreateRepo(){
        driver.findElement(buttonCreateRepoAnother).click();
        return new NewPage(driver);
    }

    public NewRepository clickButtonRepositoryPercobaan1(){
        driver.findElement(repositoryPercobaan1).click();
        return new NewRepository(driver);
    }

    public void clickFotoProfile(){
        driver.findElement(fotoProfile).click();
    }

    public ProfiilePage clickButtonProfile(){
        driver.findElement(buttonProfile).click();
        return new ProfiilePage(driver);
    }


}
