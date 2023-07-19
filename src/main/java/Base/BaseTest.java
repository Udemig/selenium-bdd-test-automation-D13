package Base;

import Pages.SignInPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class BaseTest extends BaseLibrary {
    public WebDriver webDriver;

    @Before
    public void BrowserOpen(){
        String browser = System.getProperty("Browser");
        if(browser==null)
        {browser="Chrome";}
        if (browser.equals("Firefox")) {
            webDriver = new FirefoxDriver();
        } else if (browser.equals("Safari")) {
            webDriver = new SafariDriver();
        } else if (browser.equals("Edge")) {
            webDriver = new EdgeDriver();
        } else {
            webDriver = new ChromeDriver();
        }
    }

    @Given("Browser da URL ac")
    public void setUp() {
        webDriver.get(BaseURL);
        webDriver.manage().window().maximize();
       SignInPage.setDriver(webDriver);
    }
    @Then("Browser closed")
     public void close(){

       webDriver.quit();
    }


}
