package FlipkartHome;

import com.microsoft.edge.seleniumtools.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.time.Duration;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FlipkartBaseClass
{
    public static WebDriver driver;
    public static String baseUrl;
    //public static ExtentReports;
    public static String browser = "chrome";
    public static Logger logger = LogManager.getLogManager ().getLogger (FlipkartBaseClass.class.getName ());
    public static void openBrowser(String browsername, String baseUrl)
    {
        if(browsername.equalsIgnoreCase ("chrome"))
        {
            WebDriverManager.chromedriver ().setup();
            ChromeOptions options = new ChromeOptions ();
            options.addArguments ("--no-sandbox--");
            options.addArguments ("--disable-dev-shm-usage--");
            options.addArguments ("--remote-allow-origins=*");
            driver = new ChromeDriver (options);
            driver.get (baseUrl);
            driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        }
        else
        if (browsername.equalsIgnoreCase ("firefox"))
        {
            WebDriverManager.firefoxdriver ().setup ();
            driver = new FirefoxDriver ();
            driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        }
        else
        if (browsername.equalsIgnoreCase ("edge"))
        {
            WebDriverManager.edgedriver ().setup ();
            driver = new EdgeDriver ();
            driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
        }
        driver.manage ().window ().maximize ();
        logger.info (browsername +"Lunch browser successfully ");
        driver.get (baseUrl);
        driver.getCurrentUrl ();
    }

    public static void takeScreenshot (String screenshotName) throws Exception {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile (srcFile, new File ("ScreenShot/" + screenshotName + ".png"));
        logger.info ("Take Screen shot" + screenshotName);
    }
    public static void closeBrowser(){
        driver.quit ();
        logger.info ("Browser close successfully ");

    }

}
