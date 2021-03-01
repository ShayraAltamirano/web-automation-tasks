import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.LoginPage;
import pages.ProjectPage;
import pages.UpcomingPage;

public class AddProjectTest extends BaseTest{
    @Test
    public void testAddProject(){
        LoginPage loginPage = homePage.clickToLogin();
        loginPage.setUsermail("shayra.al@gmail.com");
        loginPage.setPassword("test12345");
        UpcomingPage upcomingPage =loginPage.clickLoginButton();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AddProjectPage addProjectPage= upcomingPage.addProject();
        addProjectPage.setName("TestProject");
        ProjectPage projectPage = addProjectPage.clickAddNewProject();

    }

}
