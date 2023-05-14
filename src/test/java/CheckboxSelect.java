import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class CheckboxSelect {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver ().setup ();
        ChromeOptions options = new ChromeOptions ();
        options.addArguments ("--no-sandbox--");
        options.addArguments ("--disable-dev-shm-usage--");
        options.addArguments ("--remote-allow-origins=*");
        driver = new ChromeDriver (options);
        driver.get ("https://www.flipkart.com/");


    }
}
