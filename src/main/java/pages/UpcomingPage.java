package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpcomingPage {

    public WebDriver driver;
    public By addProjectLink = By.linkText("Add Project");

    //Construtor
    public UpcomingPage(WebDriver driver){
        this.driver =driver;
    }

    public AddProjectPage addProject(){
        driver.findElement(addProjectLink).click();
        return new AddProjectPage(driver);
    }
}
