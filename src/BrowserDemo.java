import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDemo {
    public static void main(String[] args) {
        //firefox
        System.setProperty("webdriver.chrome.driver","C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://facebook.com");
        driver.manage().window().maximize();
//String  pagename= driver.getTitle();//for reading the title

System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
//driver.findElement(By.id("email")).sendKeys("123434543");

//driver.findElement(By.className("inputtext")).sendKeys("manjula.paluru@facebook.com.com");
//driver.findElement(By.id("pass")).sendKeys("password");
//driver.findElement(By.linkText("Forgot Password?")).click();

/*driver.findElement(By.partialLinkText("Forgot")).click();
driver.findElement(By.cssSelector("#identify_email")).sendKeys("manjula.paluru@facebook.com");
        Object facebook;
        driver.findElement(By.id("did_submit")).click();
        driver.findElement(By.className("inputtext _9o1w")).sendKeys("5035833760");
        driver.findElement(By.className("_4-u5 _30ny")).click();

 */
//driver.quit();
    }
}
