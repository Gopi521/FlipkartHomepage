package Objects;

import FlipKart_Home_Funiture_PageFactor.CartPage_POM;
import FlipkartHome_Furniture_ActionDriver.FlipkartBaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static FlipkartHome_Furniture_ActionDriver.FlipkartBaseClass.*;

public class AddToCartProductsTCD {
    CartPage_POM lp;
    @BeforeTest
    public void Verify_FlipkartLandingPage() throws Exception {
        openBrowser("chrome","https://www.flipkart.com/?q=123");
        takeScreenshot ("FlipKart Launch");
        lp = new CartPage_POM (driver);
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        FlipkartBaseClass.LoinPopup ();
        takeScreenshot ("ClosedLoginPopup");
        //logger.info ("LoginPopup closed successfully ");
    }

    @Test(priority = 0)
    public void Verify_That_Home_FurnitureCategories() throws Exception {
        lp.ValidateHomeAndFurnitureCategory ();
        takeScreenshot ("Select HomeCategory");
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));

    }

    @Test(priority = 1)
    public void Verify_That_Home_FurnitureSubcategory() throws Exception {
        lp.ValidateHome_FurnishingsSubcategory ();
        takeScreenshot ("Select HomeSubCategory");
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
    }
    @Test(priority = 2)
    public void Verify_That_Bed_LinensSubcategory() throws Exception {
        lp.ValidateBed_LinensSubcategory ();
        takeScreenshot ("Open ProductListingPage");
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
    }
    @Test(priority = 3)
    public void Verify_That_UserOpenProductDetailPage() throws Exception {
        lp.ValidateUserOpenProductDetailPage ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        takeScreenshot ("Product_Detail_page");

    }
    @Test(priority = 4)
    public void Verify_That_UserSwitchToNewTabWindow() throws Exception {
        lp.ValidateUserSwitchToNewTabWindow ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        takeScreenshot ("Switch_product_DetailPage");

    }
    @Test(priority = 5)
    public void Verify_That_ValidateUserEnter_ThePinCode() throws Exception {
        lp.ValidateUserEnter_PinCode ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        takeScreenshot ("UserEnter_ThePinCode");
    }
    @Test(priority = 6)
    public void Verify_That_selectPackField() throws Exception {
        lp.ValidateSelectPack ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        takeScreenshot ("SelectPackField");
    }
    @Test(priority = 7)
    public void Verify_That_AddToCartField() throws Exception {
        lp.ValidateAddToCartButton ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        takeScreenshot ("AddToCartField");

    }
    @Test(priority = 8)
    public void Verify_That_AddingTheQuantityField() throws Exception {
        lp.ValidateAddingTheQuantity ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        takeScreenshot ("AddingTheQuantityField");
    }
    @Test(priority = 9)
    public void Verify_That_RemovingTheQuantityField() throws Exception {
        lp.ValidateRemovingTheQuantity ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        takeScreenshot ("RemovingTheQuantityField");
    }
    @Test(priority = 10)
    public void Verify_That_SaveForLaterField() throws Exception {
        lp.ValidateSaveForLater ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        takeScreenshot ("SaveForLaterField");

    }
    @Test(priority = 11)
    public void Verify_That_PlaceToOrderField() throws Exception {
        lp.ValidatePlaceToOrderButton ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        takeScreenshot ("PlaceToOrderField");

    }
    @AfterTest
    public void TestClose(){

        driver.quit ();
    }
}
