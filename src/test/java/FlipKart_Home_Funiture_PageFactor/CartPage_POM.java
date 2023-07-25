package FlipKart_Home_Funiture_PageFactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class CartPage_POM {
    WebDriver driver;
    @FindBy(xpath = ".//div[contains(text(),'Home')]")
    WebElement MouseHover_HomeCategory;
    @FindBy(xpath = ".//a[contains(text(),'Home Furnishings')]")
    WebElement Home_Furnishings;
    @FindBy(xpath = ".//a[contains(text(),'Bed Linens')]")
    WebElement Bed_Linens;
    @FindBy(xpath = "(//a[@class='s1Q9rs'])[1]" )
    WebElement OpenProduct;
    @FindBy(xpath = "//input[@class='_36yFo0']")
    WebElement Enter_pinCode;
    @FindBy(xpath = "//span[@class='_2P_LDn']")
    WebElement Check_Button;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
    WebElement AddToCart;
    @FindBy(xpath = "(//a[@class='_1fGeJ5 PP89tw _2UVyXR'])[2]")
    WebElement SelectPack;
    @FindBy(xpath = "(//button[@class='_23FHuj'])[2]")
    WebElement AddingTheQuantity;
    @FindBy(xpath = "(//button[@class='_23FHuj'])[1]")
    WebElement RemoveTheQuantity;
    @FindBy(xpath = "(//div[@class='_3dsJAO'])[1]")
    WebElement SaveForLater;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
    WebElement PlaceToOrder;

    public CartPage_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }

    public void ValidateHomeAndFurnitureCategory() {
        Actions actions = new Actions (driver);
        WebElement menuOption = MouseHover_HomeCategory;
        actions.moveToElement (menuOption).build ().perform ();

    }

    public void ValidateHome_FurnishingsSubcategory() {
        Actions actions = new Actions (driver);
        WebElement subMenuOption = Home_Furnishings;
        actions.moveToElement (subMenuOption).build ().perform ();
        actions.moveToElement (subMenuOption).pause (Duration.ofSeconds (10));
    }

    public void ValidateBed_LinensSubcategory() {
        Actions actions = new Actions (driver);
        //WebElement ProductListingPage = Bed_Linens;
        actions.moveToElement (Bed_Linens).build ().perform ();
        Bed_Linens.click ();
    }
    public void ValidateUserOpenProductDetailPage()
    {
        Actions actions=new Actions (driver);
        WebElement ProductPage=OpenProduct;
        actions.scrollToElement (OpenProduct).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        ProductPage.click ();

    }
    public void ValidateUserSwitchToNewTabWindow(){
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentTab = it.next();
        String childTab = it.next();
        driver.switchTo().window(childTab);
    }
    public void ValidateUserEnter_PinCode() throws InterruptedException {
        Actions actions=new Actions (driver);
        actions.scrollToElement (Enter_pinCode).pause (10).build ().perform ();
        Thread.sleep (8000);
        Enter_pinCode.sendKeys ("500073");
        Thread.sleep (8000);
        Check_Button.click ();

    }
    public void ValidateAddToCartButton(){
        Actions actions=new Actions (driver);
        WebElement Cart=AddToCart;
        actions.scrollToElement (Cart).pause (10).build ().perform ();
        Cart.click ();

    }
    public void ValidateSelectPack(){
        Actions actions=new Actions (driver);
        WebElement Cart=SelectPack;
        actions.scrollToElement (Cart).pause (10).build ().perform ();
        Cart.click ();

    }
    public void ValidateAddingTheQuantity(){
        Actions actions=new Actions (driver);
        WebElement Cart=AddingTheQuantity;
        actions.scrollToElement (Cart).pause (10).build ().perform ();
        Cart.click ();

    }
    public void ValidateRemovingTheQuantity(){
        Actions actions=new Actions (driver);
        WebElement Cart=RemoveTheQuantity;
        actions.scrollToElement (Cart).pause (10).build ().perform ();
        Cart.click ();

    }
    public void ValidateSaveForLater(){
        Actions actions=new Actions (driver);
        WebElement Cart=SaveForLater;
        actions.scrollToElement (Cart).pause (10).build ().perform ();
        Cart.click ();
    }
    public void ValidatePlaceToOrderButton(){
        Actions actions=new Actions (driver);
        WebElement Cart=PlaceToOrder;
        actions.scrollToElement (Cart).pause (10).build ().perform ();
        Cart.click ();
    }

}
