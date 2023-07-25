package Objects;

import FlipKart_Home_Funiture_PageFactor.SearchProduct_POM;
import FlipkartHome_Furniture_ActionDriver.FlipkartBaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static FlipkartHome_Furniture_ActionDriver.FlipkartBaseClass.*;

public class HomePageSearchTCD {
    SearchProduct_POM lp;
    @BeforeTest
    public void Verify_FlipkartLandingPage() throws Exception {
        openBrowser("chrome","https://www.flipkart.com/?q=123");
        takeScreenshot ("FlipKart Launch");
        lp = new SearchProduct_POM (driver);
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        FlipkartBaseClass.LoinPopup ();
        takeScreenshot ("ClosedLoginPopup");
        //logger.info ("LoginPopup closed successfully ");
    }
    @Test(priority = 0)
    public void ValidateSearchFunctionality() throws Exception {
        lp.validateSearchField ();
        Thread.sleep (5000);
        takeScreenshot ("searchInput");
    }
    @Test(priority = 1)
    public void ValidateThatSearchButton() throws Exception {
        lp.validateSearchButton ();
        Thread.sleep (5000);
        takeScreenshot ("ClickOnSearchButton");
    }
    @Test(priority = 2)
    public void ValidateThatBackToTopField() throws Exception {
        lp.validateAllProducts ();
        Thread.sleep (5000);
        takeScreenshot ("ClickOnBackToTop");
    }
    @AfterTest
    public void TestClose(){

        driver.quit ();
    }

}