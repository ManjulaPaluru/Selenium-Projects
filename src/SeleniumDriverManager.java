import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDriverManager {

    public static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\Drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
