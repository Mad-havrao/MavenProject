package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static WebDriver driver;

    @BeforeClass
    @Parameters("Browser")
    public void openBrowser(String browser) {
        System.out.println("Launching browser: " + browser);

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            options.setExperimentalOption("useAutomationExtension", false);
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addPreference("dom.webnotifications.enabled", false);  // Disable notifications
            options.addPreference("media.volume_scale", "0.0");           // Mute audio
            options.addPreference("useAutomationExtension", false);      // Suppress automation banner (optional)
            driver = new FirefoxDriver(options);

        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(options);

        } else {
            throw new IllegalArgumentException("Invalid browser name: " + browser);
        }
        

        driver.manage().window().maximize();

        String url = "file:///C:/Users/madhav.valande_simad/Pictures/OfflineWebsite-20250327T085218Z-001/OfflineWebsite/index.html";
        System.out.println("Navigating to: " + url);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterClass
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
