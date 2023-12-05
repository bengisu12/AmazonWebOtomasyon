package StepDefinition;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages= new AmazonPages(driver);
    @Given("user is on homepage")
    public void userIsOnHomepage() {
        AmazonPages.HomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        AmazonPages.acceptCookies();
    }

    @When("click the search button")
    public void clickTheSearchButton() {
        AmazonPages.clickSeacrhButton();
    }

    @When("write product name")
    public void writeProductName() {
        AmazonPages.writeProductName();
    }

    @When("filter for shipped by amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.filterForShipped();
    }

    @When("filter for apple")
    public void filterForApple() {
        AmazonPages.filterForApple();
    }

    @When("click the first product")
    public void clickTheFirstProduct() {
        AmazonPages.clickFirstProduct();
    }

    @When("add to cart")
    public void addToCart() {
        AmazonPages.AddtoCart();
    }

    @When("check at cart page")
    public void checkAtCartPage() {
        AmazonPages.checkCartPage();
    }
}
