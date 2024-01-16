package driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    // This is page factory class
    public static ThreadLocal<WebDriver> tslocal = new ThreadLocal<>();

    public WebDriver init_browser(String browser) {
        System.out.println("Browser value is = " + browser);
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            tslocal.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tslocal.set(new FirefoxDriver());
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            tslocal.set(new EdgeDriver());
        } else if (browser.equals("opera")) {
            WebDriverManager.operadriver().setup();
                  tslocal.set(new OperaDriver());
        } else if (browser.equals("ie")) {
            WebDriverManager.iedriver().setup();
            tslocal.set(new InternetExplorerDriver());
        } else {
            System.out.println("The correct driver name " + browser);
        }

        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().deleteAllCookies();
        return getDriver();
    }

    public static WebDriver getDriver() {
        return tslocal.get();
    }
}
