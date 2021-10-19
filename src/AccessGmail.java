import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccessGmail {
    public static void main(String[] args) {
//        WebDriver driver = SeleniumDriverManager.getFirefoxDriver();
        WebDriver driver = SeleniumDriverManager.getChromeDriver();
        driver.get("https://mail.google.com");
       // driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
driver.findElement(By.id("identifierId")).sendKeys("manjula.paluru@gmail.com");
driver.findElement(By.className("VfPpkd-vQzf8d")).click();
driver.findElement(By.name("password")).sendKeys("sithamma");
driver.findElement(By.className("VfPpkd-vQzf8d")).click();
//driver.findElement((By.className("gb_Ca gbii")).
//driver.quit();

    }
}
