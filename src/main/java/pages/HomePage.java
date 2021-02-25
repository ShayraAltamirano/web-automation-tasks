package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formLogin = By.cssSelector("a[href*='showlogin']");

    //Constructor
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    //Instancia de Log In
    public LoginPage clickToLogin(){
        driver.findElement(formLogin).click();
        return new LoginPage(driver);
    }

}
