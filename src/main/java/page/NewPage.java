package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NewPage {
    private WebDriver driver;
    private By inputRepositoryName = By.id("react-aria-2");
    private By inputDescription = By.id("react-aria-3");
    private By buttonAddReadMeFile = By.id("react-aria-8");
    private By buttonCreateRepository = By.xpath("/html/body/div[1]/div[6]/main/react-app/div/div/form/div[5]/button");
    private By validationMessage = By.id("react-aria-2-validationMessage");

    public NewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setRepositoryName(String reponame) {
        driver.findElement(inputRepositoryName).sendKeys(reponame);
    }

    public void setDescription(String description) {
        driver.findElement(inputDescription).sendKeys(description);
    }

    public void clickButtonAddReadme(){
        driver.findElement(buttonAddReadMeFile).click();
    }

    public String clickButtonCreateRepository(){
        driver.findElement(buttonCreateRepository).click();
        WebElement element = driver.findElement(validationMessage);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        return driver.findElement(validationMessage).getText();
    }

    public NewRepository clickButtonCreateRepositorys(){
        driver.findElement(buttonCreateRepository).click();
        WebElement element = driver.findElement(validationMessage);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        return new NewRepository(driver);
    }
}
