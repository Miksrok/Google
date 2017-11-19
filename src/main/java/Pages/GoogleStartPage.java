package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleStartPage {

    private WebDriver driver;
    private final String GOOGLE = "https://www.google.com.ua";

    @FindBy (id = "lst-ib")
    private WebElement searchField;

    @FindBy (name = "btnK")
    private WebElement searchButton;

    public GoogleStartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(){
        driver.get(GOOGLE);
    }

    public void typeText(String text){
        searchField.clear();
        searchField.sendKeys(text);

    }
    public void pressSearchButton(){
        searchField.sendKeys(Keys.ENTER);
        //searchButton.click();
    }

}
