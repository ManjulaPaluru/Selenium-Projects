import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableHandling{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = SeleniumDriverManager.getFirefoxDriver();
        driver.get("file:///C:/Users/manju/OneDrive/Desktop/TableHandline.html");

        WebElement table = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[1]"));
        List<WebElement> rows = table.findElements((By.xpath("/html/body/table/tbody/tr")));
        int rowcount= rows.size();
        List <WebElement> columns = table.findElements((By.xpath("/html/body/table/tbody/tr[1]/th")));
        int columncount = columns.size();
        for(int i=1;i<=1;i++)
        {
            for(int j=1;j<=columncount;j++ )
            {
                System.out.print(( table.findElement(( By.xpath("/html/body/table/tbody/tr["+i+"]/th["+j+"]") )) ).getText()+"    ");
            }
        }
        for(int i=2;i<=rowcount;i++)
        {
            for(int j=2;j<=columncount;j++ )
            {
                System.out.println(( table.findElement(( By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]") )) ).getText()+"    ");
            }
        }

    }


}
