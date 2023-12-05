package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By justAmazon = By.xpath("//li[@id='p_98/21345978031']//i[@class='a-icon a-icon-checkbox']");
    static By appleButton = By.xpath("//li[@id='p_89/Apple']//i[@class='a-icon a-icon-checkbox']");
    static By ilkurun = By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']//span[1]");
    static By addtocartbutton=By.id("add-to-cart-button");
    static By gotocart = By.xpath("//a[@href='/cart?ref_=sw_gtc']");
    static By check = By.cssSelector(".a-truncate-cut");


    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);




    }

    public static void HomePage() {
    }

    public static void acceptCookies() {
        elementHelper.click(accept);



    }

    public static void clickSeacrhButton() {




    }

    public static void writeProductName() {
        elementHelper.sendKey(search,"Airpods");
        elementHelper.click(searchButton);
    }

    public static void filterForShipped() {
        elementHelper.click(justAmazon);


    }

    public static void filterForApple() {
        elementHelper.click(appleButton);
    }

    public static void clickFirstProduct() {
        elementHelper.click(ilkurun);
    }

    public static void AddtoCart() {
        elementHelper.click(addtocartbutton);
        elementHelper.click(gotocart);
    }

    public static void checkCartPage() {
        elementHelper.checkVisible(check);
    }

}
