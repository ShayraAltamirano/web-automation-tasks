package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    public By usermailField = By.cssSelector("#email");
    public By passwordField = By.cssSelector("#password");
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

    public LeftPanelPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new LeftPanelPage(driver);
    }
}
