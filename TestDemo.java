import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TestDemo
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions ();
        options.addArguments ("--no-sandbox--");
        options.addArguments ("--disable-dev-shm-usage--");
        options.addArguments ("--remote-allow-origins=*");
        driver = new ChromeDriver (options);
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        driver.get ("https://demoqa.com/text-box");
        // *********** Text box Script *********** //
        driver.findElement (By.xpath ("//input[@class=' mr-sm-2 form-control']"))
                .sendKeys ("Testing");
        driver.findElement (By.xpath ("//input[@class='mr-sm-2 form-control']"))
                .sendKeys ("Test.Sample@gmail.com");
        String CA;
        String PA;
        {
            CA = "Hs.No:134H1-54," +
                    "Test area, selenium,java JDK,Maven,GitHub";
            PA = "Hs.No:134H1-54," +
                    "Python,Selenium,github,Maven";
        }
        driver.findElement (By.xpath ("(//textarea[@class='form-control'])[1]"))
                .sendKeys (CA);
        driver.findElement (By.xpath ("(//textarea[@class='form-control'])[2]"))
                .sendKeys (PA);
        driver.findElement (By.xpath ("//button[@class='btn btn-primary']")).click ();
//*********** Check Box Script *********** //
        driver.findElement (By.id ("item-1")).click ();
        driver.findElement (By.xpath ("//span[@class='rct-node-icon']")).click ();
        // *********** Radio Button Script *********** //
        driver.findElement (By.xpath ("(//span[@class='text'])[3]")).click ();
        driver.findElement (By.xpath ("(//label[@class='custom-control-label'])[1]")).click ();
        System.out.println ("You have selected Yes");
        driver.findElement (By.xpath ("(//label[@class='custom-control-label'])[2]")).click ();
        System.out.println ("You have selected Impressive");
        // *********** Web Table Script *********** //
       // Thread.sleep (3000);
        driver.findElement (By.xpath ("(//span[@class='text'])[4]")).click ();
        driver.findElement (By.xpath ("//button[@id='addNewRecordButton']")).click ();
        //***** form submit *****//
        String FN,LN,Email,Age,Salary,Department;
        {
            FN = "Gopi";
            LN = "PallaPothula";Email="gopinani043@gmail.com";Age ="27";Salary="50000";Department="Software";
        }
        driver.findElement (By.xpath ("(//input[@class=' mr-sm-2 form-control'])[1]")).sendKeys (FN);
        driver.findElement (By.xpath ("(//input[@class=' mr-sm-2 form-control'])[2]")).sendKeys (LN);
        driver.findElement (By.xpath ("//input[@id='userEmail']")).sendKeys (Email);
        driver.findElement (By.xpath ("(//input[@class=' mr-sm-2 form-control'])[3]")).sendKeys (Age);
        driver.findElement (By.xpath ("(//input[@class=' mr-sm-2 form-control'])[4]")).sendKeys (Salary);
        driver.findElement (By.xpath ("(//input[@class=' mr-sm-2 form-control'])[5]")).sendKeys (Department);
        driver.findElement (By.xpath ("(//button[@class='btn btn-primary'])[2]")).click ();
//----------------- Link Button Script --------------------------------
        driver.findElement (By.xpath ("(//span[@class='text'])[5]")).click ();
        //driver.findElement (By.xpath ("(//button[@class='btn btn-primary'])[2]")).click ();
//----------------- Link Button Script --------------------------------

        driver.findElement (By.xpath ("(//span[@class='text'])[6]")).click ();
        driver.findElement (By.linkText ("Home")).click ();



    }
}
