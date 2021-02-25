import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;

    public void setUp(){
          System.setProperty("webdriver.chrome.driver","resources/chromedriver");
          driver = new ChromeDriver();
          driver.get("https://todoist.com/");
          driver.findElement(By.linkText("Log in")).click();
          driver.findElement(By.id("email")).sendKeys("shayra.al@gmail.com");
          driver.findElement(By.id("password")).sendKeys("test12345");
          driver.findElement(By.cssSelector("#login_form button")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    public static void main(String[] args){
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }


}
