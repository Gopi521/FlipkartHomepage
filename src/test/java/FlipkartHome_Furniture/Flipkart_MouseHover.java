package FlipkartHome_Furniture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_MouseHover
{
    public static void main(String[] args)
    {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions ();
        options.addArguments ("--no-sandbox--");
        options.addArguments ("--disable-dev-shm-usage--");
        options.addArguments ("--remote-allow-origins=*");
        driver = new ChromeDriver (options);
        driver.manage ().window ().maximize ();
        driver.get("https://www.flipkart.com/");

        for (String winHandle : driver.getWindowHandles ()) {
            driver.switchTo ().window (winHandle);
            System.out.println ("Window Switch");
            driver.findElement (By.xpath ("//button[@class='_2KpZ6l _2doB4z']")).click ();
        }
        Actions actions = new Actions (driver);
        WebElement menuOption = driver.findElement (By.xpath (".//div[contains(text(),'Home')]"));
        actions.moveToElement (menuOption).perform ();
        System.out.println("Done Mouse hover on 'HomeCategory' from Menu");

        WebElement subMenuOption = driver.findElement (By.xpath (".//a[contains(text(),'Home Furnishings')]"));
        actions.moveToElement (subMenuOption).perform ();
        System.out.println("Done Mouse hover on 'HomeSubCategory' from Menu");

        WebElement selectMenuOption = driver.findElement (By.xpath (".//a[contains(text(),'All')]"));
        selectMenuOption.click ();
        System.out.println("Selected 'All' from Menu");


    }
}
