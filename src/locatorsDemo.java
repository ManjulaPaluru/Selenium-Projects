import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorsDemo {
    public  static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\Drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/manju/OneDrive/Desktop/Selenium.html");
System.out.println(driver.findElement(By.id("heading")).getText());
//System.out.println(driver.findElement(By.id("selenium")).isDisplayed();
//System.out.println(driver.findElement(By.id("B2")).isEnabled());
System.out.println(driver.findElement(By.id("male")).isSelected());
//driver.findElement(By.id("submit")).submit();
        /*driver
                //.findElement(By.className("gLFyf gsfi"))
                .findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
                .sendKeys("testing materials");

        driver.findElement(
                By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")
        ).click();
       // driver.close();
        driver.navigate().to("http://facebook.com");
        Thread.sleep(5000);

        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();*/
        /*
        driver.get("https://facebook.com");
        driver.findElement(By.cssSelector("#email")).sendKeys("123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).clear(); */
    }
}
