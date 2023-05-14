package FlipkartHome_Furniture;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FlipkartPOM {
    WebDriver driver;
    @FindBy(xpath = ".//div[contains(text(),'Home')]")
    WebElement MouseHover_HomeCategory;
    @FindBy(xpath = ".//a[contains(text(),'Home Furnishings')]")
    WebElement Home_Furnishings;
    @FindBy(xpath = ".//a[contains(text(),'Bed Linens')]")
    WebElement Bed_Linens;
    @FindBy(xpath = "//section[@class='_167Mu3 _2hbLCH'][2]")
    WebElement CustomerRating;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[1]")
    WebElement Rating_4;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[2]")
    WebElement Rating_3;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[3]")
    WebElement Rating_2;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[4]")
    WebElement Rating_1;
    @FindBy(xpath = "//section[@class='_167Mu3 _2hbLCH'][2]")
    WebElement Offers;
    @FindBy(xpath = ".//div[contains(text(),'Buy More, Save More')]")
    WebElement ByeMore_SaveMore_CheckBox;
    @FindBy(xpath = "//div[@title='No Cost EMI']")
    WebElement No_Cost_EMI_CheckBox;
    @FindBy(xpath = ".//div[contains(text(),'Special Price')]")
    WebElement Special_Price_CheckBox;
    @FindBy(xpath = "//section[@class='_167Mu3 _2hbLCH'][4]")
    WebElement Availability;
    @FindBy(xpath = "(//div[@class='_24_Dny'])[8]")
    WebElement Select_out_of_Stock;
    @FindBy(xpath = "//div[@class='_24_Dny _3tCU7L']")
    WebElement FlipkartAssured;
    @FindBy(xpath = "//div[@class='_24_Dny']")
    List<WebElement> Select_all_checkbox;
    @FindBy(xpath = "//div[@data-id='MTPGYCZY2GVN8PTD']")
    WebElement OpenProduct;
    @FindBy(xpath = "//div[@class='_36FSn5']")
    WebElement Favorite;
    @FindBy(xpath = "//input[@class='_36yFo0']")
    WebElement Enter_pinCode;
    @FindBy(xpath = "//span[@class='_2P_LDn']")
    WebElement Check_Button;



    public FlipkartPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }

    public void MouseHover() {
        Actions actions = new Actions (driver);
        WebElement menuOption = MouseHover_HomeCategory;
        actions.moveToElement (menuOption).build ().perform ();

    }

    public void Home_Furnishings() {
        Actions actions = new Actions (driver);
        WebElement subMenuOption = Home_Furnishings;
        actions.moveToElement (subMenuOption).build ().perform ();
        actions.moveToElement (subMenuOption).pause (Duration.ofSeconds (10));
    }

    public void Bed_Linens() {
        Actions actions = new Actions (driver);
        //WebElement ProductListingPage = Bed_Linens;
        actions.moveToElement (Bed_Linens).build ().perform ();
        Bed_Linens.click ();
    }

    public void CustomerRating4() throws InterruptedException {
        Actions actions = new Actions (driver);
        actions.scrollToElement (CustomerRating).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Rating_4.click ();
    }

    public void CustomerRating3() {
        Actions actions = new Actions (driver);
        actions.scrollToElement (CustomerRating).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Rating_3.click ();
    }

    public void CustomerRating2() {
        Actions actions = new Actions (driver);
        actions.scrollToElement (CustomerRating).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Rating_2.click ();
    }

    public void CustomerRating1() {
        Actions actions = new Actions (driver);
        actions.scrollToElement (CustomerRating).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Rating_1.click ();
    }

    public void selectOffers1() {
        Actions actions = new Actions (driver);
        actions.scrollToElement (Offers).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        ByeMore_SaveMore_CheckBox.click ();
    }

    public void selectOffers2() {
        Actions actions = new Actions (driver);
        actions.scrollToElement (Offers).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        No_Cost_EMI_CheckBox.click ();
    }

    public void selectOffers3() {
        Actions actions = new Actions (driver);
        actions.scrollToElement (Offers).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Special_Price_CheckBox.click ();
    }
    public void Select_Availability(){
        Actions actions=new Actions (driver);
        actions.scrollToElement (Availability).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Availability.click ();
    }
    public void Select_Availability_Checkbox(){
        Actions actions=new Actions (driver);
        actions.scrollToElement (Availability).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        Select_out_of_Stock.click ();
    }
    public void FlipkartAss(){
        Actions actions=new Actions (driver);
        actions.scrollToElement (FlipkartAssured).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        FlipkartAssured.click ();
    }

    public void Select_ALL_Checkbox() throws InterruptedException {
        Actions actions=new Actions (driver);
        actions.scrollToElement (Availability).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        List<WebElement>Checkboxes=Select_all_checkbox;
        System.out.println ("Total no of elements:"+Checkboxes.size ());
        for(int i=0;i<Checkboxes.size ();i++)
        {
            Thread.sleep (5000);
            Checkboxes.get (i).click ();
        }
    }
    public void OpenProductDetailPage()
    {
        Actions actions=new Actions (driver);
        actions.scrollToElement (OpenProduct).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        OpenProduct.click ();

    }
    public void SwitchNewTab(){
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentTab = it.next();
        String childTab = it.next();
        driver.switchTo().window(childTab);

    }
    public void Click_Favorite_icon(){
        Favorite.click ();

    }
    public void Enter_PinCode(){
        Actions actions=new Actions (driver);
        actions.scrollToElement (Enter_pinCode).pause (10).build ().perform ();
        Enter_pinCode.sendKeys ("500073");
        Check_Button.click ();

    }



}
