package FlipKart_Home_Funiture_PageFactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct_POM {
    WebDriver driver;
    WebDriver driver1;
    @FindBy(xpath = "//input[@class='_3704LK']")
    WebElement SearchBar;
    @FindBy(xpath = "//button[@class='L0Z3Pu']")
    WebElement SearchButton;
    @FindBy(xpath = ".//span[contains(text(),'Back to top')]")
    WebElement BackToTop;
    public SearchProduct_POM(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements (driver,this);
    }
    public void validateSearchField(){
        Actions actions=new Actions (driver);
        WebElement Search=SearchBar;
        actions.scrollToElement (Search).pause (20).build ().perform ();
        Search.clear ();
        Search.sendKeys ("Home and Furnishing products");
    }
    public void validateSearchButton(){
        Actions actions=new Actions (driver);
        WebElement SearchBtn =SearchButton;
        actions.scrollToElement (SearchBtn).pause (20).build ().perform ();
        SearchBtn.click ();
    }
    public void validateAllProducts(){

    }
}
