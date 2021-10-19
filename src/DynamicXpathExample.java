import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/manju/OneDrive/Desktop/DynamicXpath.html?");
        driver.findElement(By.xpath("/html/body/div/form/input[1]")).sendKeys("no placeholder");
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(("name"));
        driver.findElement(By.xpath("//input[@placeholder='Mobile']"));
        driver.findElement(By.xpath("//button[text()='Login with  Google']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//button[starts-with(text(),'log']")).click();
        driver.findElement(By.xpath("//button[ends-with(text(),'mail']")).click();
        //preceding element
        driver.findElement(By.xpath("//input[@id='login']/preceding-sibling::button"));
        //input[id='login']/following-element::button
        //input[id='login']/ancestor::tagname
        //input[id='Login']/parent::tagname
        //input[id='Login']/child::tagname
        //input[id='Login' and placeholder='Name']

    }
}
