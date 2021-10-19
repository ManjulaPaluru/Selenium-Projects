import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class W3Schools {
    public static void main(String[] args) {
        WebDriver driver = SeleniumDriverManager.getFirefoxDriver();
        driver.get("https://W3schools.com");
        driver.manage().window().maximize();
        driver.findElement(By.className("w3-button tut-button")).click();
        driver.findElement(By.cssSelector("html body div#topnav.w3-card-2.topnav.notranslate div div.w3-bar.w3-left a.w3-bar-item.w3-button")).click();
        //Select tutorials = new Select(driver.findElement(By.cssSelector("#navbtn_tutorials")));
        //tutorials.selectByValue("Learn HTML");

    }
}
