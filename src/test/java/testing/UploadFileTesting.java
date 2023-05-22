package testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;

public class UploadFileTesting extends BaseSetup{

    private SignInPage signInPage;
    private HomePage homePage;
    private ProfiilePage profiilePage;
    private PublicProfilePage publicProfilePage;

    @Test
    public void UploadFileValid(){
        signInPage = indexPage.clickButtonSignIn();
        signInPage.setInputUsernameOrEmail("Percobaandoang12");
        signInPage.setInputPassword("Percobaandoang1");

        homePage = signInPage.clickButtonSignIn();
        homePage.clickFotoProfile();
        profiilePage = homePage.clickButtonProfile();
        publicProfilePage = profiilePage.clickFotoPofile();
    }
}
