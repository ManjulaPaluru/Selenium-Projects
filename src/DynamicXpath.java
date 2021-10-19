import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
    public static void main(String[] args)throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/manju/OneDrive/Desktop/Selenium.html");
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("manjula");
        driver.findElement(By.xpath("//input[@placeholder='Name1']")).sendKeys("manjula1");
        driver.findElement(By.xpath("//input[@placeholder='Name2']")).sendKeys("manjula2");
        driver.findElement(By.xpath("//button[text()='Alert box']")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[contains(text(),'conf')]")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[starts-with(text(),'prom')]")).click();
        driver.switchTo().alert().accept();
        //driver.findElement(By.xpath("//button[ends-with(text(),'kjasg')]")).click();

    }
}
