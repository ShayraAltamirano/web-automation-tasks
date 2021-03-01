package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    private WebDriver driver;
    private By formLogin = By.cssSelector("ul._3XsmI li:first-child a._2q_cf");

    //Constructor
    public WelcomePage(WebDriver driver){
        this.driver=driver;
    }

    //Instancia de Log In
    public LoginPage clickToLogin(){
        driver.findElement(formLogin).click();
        return new LoginPage(driver);
    }

}
