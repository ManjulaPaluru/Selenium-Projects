import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertsPopups {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\Drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("file:///C:/Users/manju/OneDrive/Desktop/Selenium.html");
       Select dropdown1 = new Select(driver.findElement(By.name("Country")));
               dropdown1.selectByIndex(2);
               dropdown1.selectByValue("India");
               dropdown1.getOptions();
      // dp1.selectByIndex(2);

        /*driver.findElement(By.id("B1")).click();
       Thread.sleep(5000);
        Alert alertbox =  driver.switchTo().alert();
        alertbox.accept();
        Thread.sleep(5000);
        driver.findElement(By.id("B2")).click();
       Thread.sleep(5000);
        alertbox.dismiss();
        Thread.sleep(5000);*/
       // System.out.println(alertbox.getText());
        //alertbox.sendKeys("13435345");
        //alertbox.accept();
        //driver.findElement(By.id("file")).sendKeys("C:\\Users\\manju\\OneDrive\\Desktop\\test");
//driver.quit();
    }
}