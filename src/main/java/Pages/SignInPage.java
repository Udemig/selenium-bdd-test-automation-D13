package Pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignInPage{
    public String text;
    private static WebDriver webDriver;
    public static void setDriver (WebDriver driver) {webDriver =  driver;}

    @When("Search product: {string}")
    public SignInPage ProductSearch(String text){
        WebElement search = webDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys(text);

        return this;
    }
    @When("Search button click")
    public SignInPage clickButton(){
        WebElement aramaButon = webDriver.findElement(By.id("nav-search-submit-button"));
        aramaButon.click();
        return this;
    }
    @When("Cookie Control")
    public SignInPage cerezButon() throws InterruptedException {
        Thread.sleep(3000);
        WebElement cerezKabulEt = webDriver.findElement(By.id("sp-cc-accept"));

        if(cerezKabulEt.isDisplayed()){
            cerezKabulEt.click();
        }
        return this;
    }
    @When("First product description click")
    public SignInPage clickOnProductDescription(){
        webDriver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-small.puis-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a")).click();
        return this;
    }
    @When("Product text control")
    public SignInPage checkProductDescriptionText(String actualText){
        String expectedText= webDriver.findElement(By.id("productTitle")).getText();
        Assert.assertEquals(actualText,expectedText);
        System.out.println(expectedText);

        return this;
    }

//    public SignInPage addProductToCart(){
//        webDriver.findElement(By.id("add-to-cart-button")).click();
//
//        return this;
//    }
//
//    public SignInPage checkProductAddedText(String actualText){
//
//        String expectedText=webDriver.findElement(By.cssSelector("[class^='a-size-medium-plus']")).getText();
//        Assert.assertEquals(actualText,expectedText);
//        System.out.println(expectedText);
//
//        return this;
//    }
//
//    public SignInPage navigateToCart(){
//        webDriver.findElement(By.id("sw-gtc")).click();
//        return this;
//    }
//    public SignInPage checkProductInCart(String actualText){
//        String expectedText= webDriver.findElement(By.cssSelector("[class='a-truncate-cut']")).getText();
//        Assert.assertEquals(actualText,expectedText);
//        System.out.println(expectedText);
//
//        return this;
//    }

}
