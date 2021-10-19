import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {
    public static void main(String[] args) throws InterruptedException
    {

        //creation of firefoxprofile
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.helperApps.neverAsk.saveToDesk","application/pdf");

        profile.setPreference("browser.download.manager.showWhenStarting","true");
        profile.setPreference("pdfjs.disabled","true");
        FirefoxOptions option = new FirefoxOptions();
        option.setProfile(profile);
        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\Drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(option);
        driver.get("http://demo.automationtesting.in/FileDownload.html");

        driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("Testing website");
        driver.findElement((By.xpath("//*[@id=\"createPdf\"]"))).click();
        driver.findElement((By.xpath("//*[@id=\"pdf-link-to-download\"]"))).click();
       /* System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.xpath("//*[@id=\'textbox\']")).sendKeys("Testing website");
        driver.findElement((By.xpath("//*[@id=\'createTxt\']"))).click();
        driver.findElement((By.xpath("//*[@id=\'link-to-download\']"))).click(); */

    }

}
