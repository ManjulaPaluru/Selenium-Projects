import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Iframes {
    public static void main(String[] args) {
        WebDriver driver = SeleniumDriverManager.getChromeDriver();
        driver.get("file:///C:/Users/manju/OneDrive/Desktop/Iframes.html");
        driver.manage().window().maximize();
        //System.out.println("printing the main page heading");
        //System.out.println(driver.findElement(By.xpath("//*[@id=\"1\"]")).getText());
       //int count  = driver.findElement(By.tagName("iframe")).getSize();
        //System.out.println(count);
       // driver.switchTo().frame(0);
       /*String  heading1 =driver.findElement(By.xpath("//*[@id=\"heading\"]")).getText();
       System.out.println(heading1);
       driver.switchTo().defaultContent();*/
       driver.switchTo().frame(1);


        WebElement table = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[1]"));
        List<WebElement> rows = table.findElements((By.xpath("/html/body/table/tbody/tr")));
        int rowcount= rows.size();

           //List <WebElement> rowdata = driver.findElement(By.xpath("/html/body/table/tbody/tr"));
           //int rowdatalist = rowdata.size()
           System.out.println(rowcount);
    }

}
