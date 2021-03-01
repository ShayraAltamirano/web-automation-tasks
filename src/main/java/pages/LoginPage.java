package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    public By usermailField = By.id("email");
    public By passwordField = By.id("password");
    public By loginButton = By.cssSelector("#login_form button");
    //Constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUsermail (String usermail){
        driver.findElement(usermailField).sendKeys(usermail);
    }

    public void setPassword (String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public UpcomingPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new UpcomingPage(driver);
    }
}
