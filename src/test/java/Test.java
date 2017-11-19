import Pages.GoogleStartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

public class Test {

    private WebDriver driver;
    private final String FIREFOX_PATH = "src\\main\\resources\\geckodriver.exe";

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", FIREFOX_PATH);
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @org.testng.annotations.Test
    public void searchTest(){
        GoogleStartPage page = new GoogleStartPage(driver);
        page.openPage();
        page.typeText("Selenium IDE");
        page.pressSearchButton();
    }

    /*@AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }*/

}
