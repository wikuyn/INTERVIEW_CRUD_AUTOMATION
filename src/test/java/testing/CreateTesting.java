package testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.NewPage;
import page.NewRepository;
import page.SignInPage;

public class CreateTesting extends BaseSetup{
    private SignInPage signInPage;
    private HomePage homePage;
    private NewPage newPage;
    private NewRepository newRepository;

    @Test
    public void CreateTestingInvalid(){
        signInPage = indexPage.clickButtonSignIn();
        signInPage.setInputUsernameOrEmail("Percobaandoang12");
        signInPage.setInputPassword("Percobaandoang1");

        homePage = signInPage.clickButtonSignIn();
        newPage = homePage.clickButtonCreateRepo();
        newPage.setRepositoryName("Percobaan Doang 1");
        newPage.setDescription("Deskripsi percobaan create 1");
        newPage.clickButtonAddReadme();
        String message = newPage.clickButtonCreateRepository();
        Assert.assertEquals(message,"The repository Percobaan-Doang-1 already exists on this account.");
    }

    @Test
    public void CreateTestingValid(){
        signInPage = indexPage.clickButtonSignIn();
        signInPage.setInputUsernameOrEmail("Percobaandoang12");
        signInPage.setInputPassword("Percobaandoang1");

        homePage = signInPage.clickButtonSignIn();
        newPage = homePage.clickButtonCreateRepo();
        newPage.setRepositoryName("Percobaan Doang 2");
        newPage.setDescription("Deskripsi percobaan create 2");
        newPage.clickButtonAddReadme();
        newRepository = newPage.clickButtonCreateRepositorys();
        Assert.assertEquals(newRepository.getTextDescription(),"Deskripsi percobaan create 2");
    }
}
