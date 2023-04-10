import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginScript
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions ();
        options.addArguments ("--no-sandbox--");
        options.addArguments ("--disable-dev-shm-usage--");
        options.addArguments ("--remote-allow-origins=*");
        driver = new ChromeDriver (options);
        driver.manage ().window ().maximize ();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement (By.xpath ("//input[@id='username']")).sendKeys ("student");
        //driver.manage ().timeouts ().implicitlyWait(Duration.ofSeconds (10));
        WebDriverWait wait =new WebDriverWait (driver,Duration.ofSeconds (10));
        WebElement element = wait.until (ExpectedConditions.visibilityOfElementLocated (By.xpath ("//input[@id='password']")));
        driver.findElement (By.xpath ("//input[@id='password']")).sendKeys ("Password123");
        driver.findElement (By.id ("submit")).click ();
        driver.findElement (By.xpath ("//a[@style='color:#ffffff']")).click ();

        driver.quit ();

    }
}
