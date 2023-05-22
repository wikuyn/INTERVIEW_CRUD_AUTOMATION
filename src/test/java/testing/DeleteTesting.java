package testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;

public class DeleteTesting extends BaseSetup{

    private SignInPage signInPage;
    private HomePage homePage;
    private NewRepository newRepository;
    private SettingPage settingPage;
    private RepositoryPage repositoryPage;

    @Test
    public void DeleteRepoInvalid(){

        signInPage = indexPage.clickButtonSignIn();
        signInPage.setInputUsernameOrEmail("Percobaandoang12");
        signInPage.setInputPassword("Percobaandoang1");

        homePage = signInPage.clickButtonSignIn();
        newRepository = homePage.clickButtonRepositoryPercobaan1();
        settingPage = newRepository.clickButtonSetting();
        settingPage.clickButtonDeleteRepository();
        settingPage.clickButtonIwantToDelete();
        String reponame = settingPage.getRepositoryName();
        settingPage.setInputVerification(reponame+"invalid");
        repositoryPage = settingPage.clickButtonDeleteRepositoryFinal();

    }

    @Test
    public void DeleteRepoValid(){

        signInPage = indexPage.clickButtonSignIn();
        signInPage.setInputUsernameOrEmail("Percobaandoang12");
        signInPage.setInputPassword("Percobaandoang1");

        homePage = signInPage.clickButtonSignIn();
        newRepository = homePage.clickButtonRepositoryPercobaan1();
        settingPage = newRepository.clickButtonSetting();
        settingPage.clickButtonDeleteRepository();
        settingPage.clickButtonIwantToDelete();
        String reponame = settingPage.getRepositoryName();
        settingPage.setInputVerification(reponame);
        repositoryPage = settingPage.clickButtonDeleteRepositoryFinal();
        Assert.assertEquals(repositoryPage.notificationShowing(),true);

    }
}
