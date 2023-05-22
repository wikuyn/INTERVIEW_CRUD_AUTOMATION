package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailReadme {
    private WebDriver driver;
    private By detailDescription = By.xpath("//*[@id=\"repo-content-pjax-container\"]/react-app/div/div/div[2]/div[1]/div/div/main/div[2]/div/div[3]/div[3]/div/div[2]/section/div/article/p");

    public DetailReadme(WebDriver driver) {
        this.driver = driver;
    }

    public String getDetailDescription(){
        return driver.findElement(detailDescription).getText();
    }
}
