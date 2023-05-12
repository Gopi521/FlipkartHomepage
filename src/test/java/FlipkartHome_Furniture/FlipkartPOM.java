package FlipkartHome_Furniture;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v107.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FlipkartPOM {
    WebDriver driver;


    @FindBy(xpath = ".//div[contains(text(),'Home')]")
    WebElement MouseHover_HomeCategory;
    @FindBy(xpath = ".//a[contains(text(),'Home Furnishings')]")
    WebElement Home_Furnishings;
    @FindBy(xpath = ".//a[contains(text(),'Bed Linens')]")
    WebElement Bed_Linens;
    @FindBy(xpath = ".//div[contains(text(),'4★ & above')]")
    WebElement Rating_4;
    @FindBy(xpath = ".//div[contains(text(),'3★ & above')]")
    WebElement Rating_3;
    @FindBy(xpath = ".//div[contains(text(),'2★ & above')]")
    WebElement Rating_2;
    @FindBy(xpath = ".//div[contains(text(),'1★ & above')]")
    WebElement Rating_1;

    @FindBy(xpath = ".//div[contains(text(),'Buy More, Save More')]")
    WebElement ByeMore_SaveMore_CheckBox;
    @FindBy(xpath = ".//div[contains(text(),'No Cost EMI')]")
    WebElement No_Cost_EMI_CheckBox;
    @FindBy(xpath = ".//div[contains(text(),'Special Price')]")
    WebElement Special_Price_CheckBox;
    @FindBy(xpath = ".//div[contains(text(),'Offers')]")
    WebElement Scroll;





    public FlipkartPOM(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }
    public void MouseHover()
        {
            Actions actions = new Actions (driver);
            WebElement menuOption = MouseHover_HomeCategory;
            actions.moveToElement (menuOption).build ().perform ();

    }
    public void Home_Furnishings()
    {
        Actions actions = new Actions (driver);
        WebElement subMenuOption = Home_Furnishings;
        actions.moveToElement (subMenuOption).build ().perform ();
        actions.moveToElement (subMenuOption).pause (Duration.ofSeconds (10));
    }

    public void Bed_Linens()
    {
        Actions actions = new Actions (driver);
        //WebElement ProductListingPage = Bed_Linens;
        actions.moveToElement (Bed_Linens).build ().perform ();
        Bed_Linens.click ();
    }
    public void CustomerRating4() throws InterruptedException {
        Actions actions = new Actions (driver);
        actions.scrollToElement (Scroll).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait(Duration.ofSeconds (10));
        WebElement checkBoxElement = Rating_4;
        boolean isSelected = checkBoxElement.isSelected();

        if(isSelected == false) {
            checkBoxElement.click();
        }

    }
    public void CustomerRating3(){
        Actions actions = new Actions (driver);
        actions.scrollToElement (Scroll).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait(Duration.ofSeconds (10));
        Rating_3.click ();
        WebElement checkBoxElement = Rating_3;
        boolean isSelected = checkBoxElement.isSelected();

        if(isSelected == false) {
            checkBoxElement.click();
        }
    }
    public void CustomerRating2(){
        Actions actions = new Actions (driver);
        actions.scrollToElement (Scroll).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait(Duration.ofSeconds (10));
        WebElement checkBoxElement = Rating_2;
        boolean isSelected = checkBoxElement.isSelected();

        if(isSelected == false) {
            checkBoxElement.click();
        }
    }
    public void CustomerRating1(){
        Actions actions = new Actions (driver);
        actions.scrollToElement (Scroll).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait(Duration.ofSeconds (10));
        WebElement checkBoxElement = Rating_1;
        boolean isSelected = checkBoxElement.isSelected();

        if(isSelected == false) {
            checkBoxElement.click();
        }
        Rating_1.click ();
    }

    public void selectOffers1()
    {
        Actions actions = new Actions (driver);
        actions.scrollToElement (Scroll).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait(Duration.ofSeconds (10));
        WebElement checkBoxElement = ByeMore_SaveMore_CheckBox;
        boolean isSelected = checkBoxElement.isSelected();

        if(isSelected == false) {
            checkBoxElement.click();
        }
    }
    public void selectOffers2()
    {
        Actions actions = new Actions (driver);
        actions.scrollToElement (Scroll).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait(Duration.ofSeconds (10));
        WebElement checkBoxElement = No_Cost_EMI_CheckBox;
        boolean isSelected = checkBoxElement.isSelected();

        if(isSelected == false) {
            checkBoxElement.click();
        }

    }
    public void selectOffers3()
    {
        Actions actions = new Actions (driver);
        actions.scrollToElement (Scroll).build ().perform ();
        driver.manage ().timeouts ().implicitlyWait(Duration.ofSeconds (10));
        WebElement checkBoxElement = Special_Price_CheckBox;
        boolean isSelected = checkBoxElement.isSelected();

        if(isSelected == false) {
            checkBoxElement.click();
        }
    }
    public void Select(){
        Scroll.click ();

    }



}
