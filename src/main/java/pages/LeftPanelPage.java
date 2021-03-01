package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftPanelPage {

    public WebDriver driver;
    public By addProjectLink = By.cssSelector("#projects_list_manager a[data-track=\"projects|add\"]");

    //Construtor
    public LeftPanelPage(WebDriver driver){
        this.driver =driver;
    }

    public AddProjectPage addProject(){
        driver.findElement(addProjectLink).click();
        return new AddProjectPage(driver);
    }
}
