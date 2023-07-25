package Objects;

import FlipKart_Home_Funiture_PageFactor.ProductListingPage_POM;
import FlipkartHome_Furniture_ActionDriver.FlipkartBaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static FlipkartHome_Furniture_ActionDriver.FlipkartBaseClass.*;

public class ProductListingPageFiltersTCD {
    ProductListingPage_POM lp;
    FlipkartBaseClass bs;

    int i=0;
    @BeforeTest
    public void Verify_FlipkartLandingPage() throws Exception {
        openBrowser("chrome","https://www.flipkart.com/?q=123");
        takeScreenshot ("FlipKart Launch");
        lp = new ProductListingPage_POM (driver);
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        FlipkartBaseClass.LoinPopup ();
        takeScreenshot ("ClosedLoginPopup");
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
    public void Verify_That_FlipkartAssField() throws Exception {
        lp.ValidateFlipkartAssField ();
        Thread.sleep (5000);
        takeScreenshot ("SelectFlipkartAssured");
    }
    @Test(priority = 4)
    public void Verify_That_CustomerRatingCheckBoxField() throws Exception {
        lp.ValidateCustomer4StarRatingCheckBoxField ();
        Thread.sleep (5000);
        lp.ValidateCustomer3StarRatingCheckBoxField ();
        Thread.sleep (5000);
        lp.ValidateCustomer2starRatingCheckBoxField ();
        Thread.sleep (5000);
        lp.ValidateCustomer1StarRatingCheckBoxField ();
        takeScreenshot ("Open ProductListingPage");
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
    }
    @Test(priority = 5)
    public void Verify_That_CustomerOffersCheckBoxField() throws Exception {
        lp.ValidateBuyMore_SaveMore_CheckBoxField ();
        Thread.sleep (5000);
        lp.ValidateNo_Cost_EMI_CheckBoxField ();
        Thread.sleep (5000);
        lp.ValidateSpecial_Price_CheckBoxField ();
        Thread.sleep (5000);
        takeScreenshot ("Open ProductListingPage");
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
    }
    @Test(priority = 6)
    public void Verify_That_AvailabilityDropdownField() throws Exception {
            lp.Validate_AvailabilityDropdownField ();
            takeScreenshot ("SelectAvailability");
            lp.ValidateAvailability_CheckboxField ();
            Thread.sleep (5000);
            takeScreenshot ("SelectAvailabilityCheckbox");

    }
    @Test(priority = 7)
    public void Verify_That_80PCTDiscountDropdownField() throws Exception {
        lp.Validate_DiscountDropdownField ();
        Thread.sleep (5000);
        lp.Validate_Click80PCTDiscountField ();
        Thread.sleep (5000);
        takeScreenshot ("SelectDiscount");
    }
    @Test(priority = 8)
    public void Verify_That_70PCTDiscountDropdownField() throws Exception {
        lp.Validate_DiscountDropdownField ();
        Thread.sleep (5000);
        lp.Validate_Click70PCTDiscountField ();
        Thread.sleep (5000);
        takeScreenshot ("Select70PCTDiscount");
    }
    @Test(priority = 9)
    public void Verify_That_60PCTDiscountDropdownField() throws Exception {
        lp.Validate_DiscountDropdownField ();
        Thread.sleep (5000);
        lp.Validate_Click60PCTDiscountField ();
        Thread.sleep (5000);
        takeScreenshot ("Select60PCTDiscount");
    }
    @Test(priority = 10)
    public void Verify_That_50PCTDiscountDropdownField() throws Exception {
        lp.Validate_DiscountDropdownField ();
        Thread.sleep (5000);
        lp.Validate_Click50PCTDiscountField ();
        Thread.sleep (5000);
        takeScreenshot ("Select50PTCDiscount");
    }
    @Test(priority = 11)
    public void Verify_That_40PCTDiscountDropdownField() throws Exception {
        lp.Validate_DiscountDropdownField ();
        Thread.sleep (5000);
        lp.Validate_Click40PCTDiscountField ();
        Thread.sleep (5000);
        takeScreenshot ("Select40PCTDiscount");
    }
    @Test(priority = 12)
    public void Verify_That_GST_InvoiceDropdownField() throws Exception {
        lp.Validate_GST_InvoiceDropdownField ();
        Thread.sleep (5000);
        takeScreenshot ("SelectGST_Invoice");
        lp.Validate_GST_InvoiceCheckboxField ();
        Thread.sleep (5000);
        takeScreenshot ("GST_InvoiceCheckboxField");
    }
    @Test(priority = 13)
    public void Verify_That_ValuePackDropdownField() throws Exception {
        lp.Validate_ValuePackDropdownField ();
        Thread.sleep (5000);
        takeScreenshot ("SelectValuePack");
        lp.Validate_ValuePackCheckboxField ();
        Thread.sleep (5000);
        takeScreenshot ("ValuePackCheckboxField");
    }
    @Test(priority = 14)
    public void Verify_That_ColourDropdownField() throws Exception {
        lp.Validate_ColourDropdownField ();
        Thread.sleep (5000);
        takeScreenshot ("SelectColour");
        lp.Validate_BlackColourCheckBoxField ();
        Thread.sleep (5000);
        takeScreenshot ("SelectBlackColour");
    }
    @Test(priority = 15)
    public void Verify_That_ColourCheckBoxField() throws Exception {
        lp.Validate_ColourDropdownField ();
        Thread.sleep (5000);
        takeScreenshot ("SelectColour");
        lp.Validate_BlueColourCheckBoxField ();
        Thread.sleep (5000);
        takeScreenshot ("SelectBlueColour");
    }
    @Test(priority = 16)
    public void VerifyClearAllFilters() throws Exception {
        lp.ValidateCustomerClearAllFilters ();
        Thread.sleep (5000);
        takeScreenshot ("ClearAllFilters");
    }
    @AfterTest
    public void TestClose(){

        driver.quit ();
    }
}
