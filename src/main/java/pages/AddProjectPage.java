package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProjectPage {

    public WebDriver driver;
    public By nameField = By.id("edit_project_modal_field_name");
    public By addButton = By.cssSelector(".ist_button.ist_button_red");


    //Constructor
    public AddProjectPage(WebDriver driver){
        this.driver= driver;

    }

    public void setName(String name){
        driver.findElement(nameField).sendKeys(name);
    }

    public ProjectPage clickAddNewProject(){
        driver.findElement(addButton).click();
        return new ProjectPage(driver);
    }
}
