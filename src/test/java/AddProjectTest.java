import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.LoginPage;
import pages.ProjectPage;
import pages.LeftPanelPage;

public class AddProjectTest extends BaseTest{
    @Test
    public void testAddProject(){
        LoginPage loginPage = welcomePage.clickToLogin();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.setUsermail("shayra.al@gmail.com");
        loginPage.setPassword("test12345");
        LeftPanelPage leftPanelPage =loginPage.clickLoginButton();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AddProjectPage addProjectPage= leftPanelPage.addProject();
        addProjectPage.setName("TestProject");
        ProjectPage projectPage = addProjectPage.clickAddNewProject();

    }

}
