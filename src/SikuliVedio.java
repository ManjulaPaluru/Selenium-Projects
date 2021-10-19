import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import static java.lang.Thread.sleep;

public class
 SikuliVedio {
    public static void main(String[] args) throws FindFailed
    {

        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/manju/OneDrive/Desktop/SikuliVedio.html");
Pattern p1= new Pattern("C:\\Users\\manju\\OneDrive\\Desktop\\ImageRecog\\play.PNG");
Pattern p2= new Pattern("C:\\Users\\manju\\OneDrive\\Desktop\\ImageRecog\\maximize.PNG");
Pattern p3= new Pattern("C:\\Users\\manju\\OneDrive\\Desktop\\ImageRecog\\mute.PNG");
Pattern p4= new Pattern("C:\\Users\\manju\\OneDrive\\Desktop\\ImageRecog\\play.PNG");
Pattern p5= new Pattern("C:\\Users\\manju\\OneDrive\\Desktop\\ImageRecog\\playvideo2.PNG");
Pattern p6= new Pattern("C:\\Users\\manju\\OneDrive\\Desktop\\ImageRecog\\maximize.PNG");
Screen sc=new Screen();
sc.click(p1);
sc.click(p2);
sc.click(p3);
sc.click(p4);
sc.click(p6);
sc.click(p5);
    }
}
