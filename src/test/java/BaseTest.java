import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.WelcomePage;

public class BaseTest {

    private WebDriver driver;
    protected WelcomePage welcomePage;

    @BeforeClass
    public void setUp(){
          System.setProperty("webdriver.chrome.driver","resources/chromedriver");
          driver = new ChromeDriver();
          driver.get("https://todoist.com/");
          welcomePage = new WelcomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
