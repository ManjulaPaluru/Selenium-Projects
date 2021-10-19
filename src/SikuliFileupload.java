import org.sikuli.script.Screen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

public class SikuliFileupload {
    public static void main(String[] args)throws FindFailed {
        System.setProperty("webdriver.chrome.driver","C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/manju/OneDrive/Desktop/Selenium.html");

        Actions act =new Actions(driver);
        act.click(driver.findElement(By.xpath("//*[@id=\"file\"]"))).build().perform();
        //for handling the file upload window
        Screen screen =new Screen();
        Pattern p1 = new Pattern("C:\\Users\\manju\\OneDrive\\Desktop\\ImageRecog\\textbox.PNG");
        Pattern p2 =new Pattern("C:\\Users\\manju\\OneDrive\\Desktop\\ImageRecog\\open.PNG");

screen.type(p1,"C:\\Users\\manju\\OneDrive\\Desktop\\Testing Materials\\AutomationFrameworkDesign.pdf");
screen.click(p2);
    }
}