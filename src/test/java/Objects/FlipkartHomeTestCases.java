package Objects;

import FlipkartHome_Furniture.FlipkartBaseClass;
import FlipkartHome_Furniture.FlipkartPOM;
import junit.framework.TestSuite;
import org.apache.xmlbeans.impl.xb.xsdschema.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static FlipkartHome_Furniture.FlipkartBaseClass.*;



public class FlipkartHomeTestCases
{
    FlipkartPOM lp;
    FlipkartBaseClass bs;
    int i=0;
    @BeforeMethod
    public void setup() throws Exception {
        openBrowser("chrome","https://www.flipkart.com/");
        takeScreenshot ("FlipKart Lunch");
        lp = new FlipkartPOM (driver);
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        FlipkartBaseClass.LoinPopup ();
        takeScreenshot ("ClosedLoginPopup");
        //logger.info ("LoginPopup closed successfully ");
    }

    @Test
    public void TC003() throws Exception {
        lp.MouseHover ();
        //logger.info ("Verify");
       // logger = ER.addSystemInfo ("Verify share product buttons for an item in Ethnic Store");
        takeScreenshot ("Select HomeCategory");
    }
    @Test
    public void TC004() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings();
        takeScreenshot ("Select HomeSubCategory");
    }
    @Test
    public void TC005() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings();
        lp.Bed_Linens();
        takeScreenshot ("Open ProductListingPage");
    }
    @Test
    public void TC007() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings();
        lp.Bed_Linens();
        lp.CustomerRating4 ();
        takeScreenshot ("4_Rating");
    }
    @Test
    public void TC008() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings();
        lp.Bed_Linens();
        lp.CustomerRating3 ();
        takeScreenshot ("3_Rating");
    }
    @Test
    public void TC009() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings();
        lp.Bed_Linens();
        lp.CustomerRating2 ();
        takeScreenshot ("2_Rating");
    }
    @Test
    public void TC010() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings();
        lp.Bed_Linens();
        lp.CustomerRating1 ();
        takeScreenshot ("1_Rating");
    }
    @Test
    public void TC011() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings ();
        lp.Bed_Linens ();
        lp.selectOffers1 ();
        takeScreenshot ("BuyMore");

    }
    @Test
    public void TC012() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings ();
        lp.Bed_Linens ();
        lp.selectOffers2 ();
        takeScreenshot ("NoCostEMI");
    }
    @Test
    public void TC013() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings ();
        lp.Bed_Linens ();
        lp.selectOffers3 ();
        takeScreenshot ("SpecialPrice");
    }
    @Test
    public void TC014() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings ();
        lp.Bed_Linens ();
        lp.Select_Availability ();
        takeScreenshot ("SelectAvailability");
    }
    @Test
    public void TC015() throws Exception {
            lp.MouseHover ();
            lp.Home_Furnishings ();
            lp.Bed_Linens ();
            lp.Select_Availability ();
            lp.Select_Availability_Checkbox ();
            takeScreenshot ("SelectAvailabilityCheckbox");
        }
    @Test
    public void TC016() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings ();
        lp.Bed_Linens ();
        lp.FlipkartAss ();
        takeScreenshot ("SelectFlipkartAssured");
    }
        @Test
        public void TC017() throws Exception {
            lp.MouseHover ();
            lp.Home_Furnishings ();
            lp.Bed_Linens ();
            driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
            lp.Select_ALL_Checkbox ();
            takeScreenshot ("Select_all_Checkbox");
        }
        @Test
        public void TCO18() throws Exception {
            lp.MouseHover ();
            lp.Home_Furnishings ();
            lp.Bed_Linens ();
            lp.Select_ALL_Checkbox ();
            lp.FlipkartAss ();
            driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
            Thread.sleep (2000);
            lp.OpenProductDetailPage ();
            takeScreenshot ("Product_Detail_page");
            lp.SwitchNewTab ();
            takeScreenshot ("Switch_product_DetailPage");
        }
    @Test
    public void TCO19() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings ();
        lp.Bed_Linens ();
        lp.Select_ALL_Checkbox ();
        lp.FlipkartAss ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Thread.sleep (2000);
        lp.OpenProductDetailPage ();
        takeScreenshot ("Product_Detail_page");
        lp.SwitchNewTab ();
        takeScreenshot ("Switch_product_DetailPage");
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        lp.Click_Favorite_icon ();
        takeScreenshot ("ClickFavoriteIcon");
        bs.LoinPopup ();

    }
    @Test
    public void TC020() throws Exception {
        lp.MouseHover ();
        lp.Home_Furnishings ();
        lp.Bed_Linens ();
        lp.Select_ALL_Checkbox ();
        lp.FlipkartAss ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Thread.sleep (2000);
        lp.OpenProductDetailPage ();
        takeScreenshot ("Product_Detail_page");
        lp.SwitchNewTab ();
        takeScreenshot ("Switch_product_DetailPage");
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        lp.Enter_PinCode ();

    }

    @AfterMethod
    public void testEnd(ITestResult result) throws Exception {
        i = i + 1;
        String screenshotName = "Login fail";
        String x = screenshotName + String.valueOf (i);
        if (ITestResult.FAILURE == result.getStatus ()) {
            takeScreenshot (screenshotName);

        }
      closeBrowser();
    }


}
