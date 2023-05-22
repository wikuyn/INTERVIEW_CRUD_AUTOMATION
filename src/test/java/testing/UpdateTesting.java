package testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;

public class UpdateTesting extends BaseSetup {
    private SignInPage signInPage;
    private HomePage homePage;
    private NewRepository newRepository;
    private EditPage editPage;
    private DetailReadme detailReadme;

    @Test
    public void UpdateTestingInvalid(){
        signInPage = indexPage.clickButtonSignIn();
        signInPage.setInputUsernameOrEmail("Percobaandoang12");
        signInPage.setInputPassword("Percobaandoang1");

        homePage = signInPage.clickButtonSignIn();
        newRepository = homePage.clickButtonRepositoryPercobaan1();
        String oldDescription = newRepository.getTextDescription();
        editPage = newRepository.clickButtonEdit();
        editPage.clearInputDescritionReadme();
        editPage.setInputDescriptionReadme("Update desckripsi percobaan 1 nih ya");
        editPage.clickButtonCancleChange();
        detailReadme = editPage.alertOk();
        Assert.assertEquals(detailReadme.getDetailDescription(), oldDescription);
    }

    @Test
    public void UpdateTestingValid(){
        signInPage = indexPage.clickButtonSignIn();
        signInPage.setInputUsernameOrEmail("Percobaandoang12");
        signInPage.setInputPassword("Percobaandoang1");

        homePage = signInPage.clickButtonSignIn();
        newRepository = homePage.clickButtonRepositoryPercobaan1();
        String oldDescription = newRepository.getTextDescription();
        editPage = newRepository.clickButtonEdit();
        editPage.setInputDescriptionReadme1("Update valid deskripsi");
        editPage.clickButtonCommitChange();
        editPage.clickButtonDialogCommit();

    }
}
