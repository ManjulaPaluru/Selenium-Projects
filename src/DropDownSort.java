import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DropDownSort {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/manju/OneDrive/Desktop/Selenium.html");

        Select se = new Select(driver.findElement(By.id("county")));
      List<WebElement> options = se.getOptions();
      List values = new ArrayList();
        for(WebElement opt : options)
        {
            values.add(opt.getText());
        }
        System.out.println("original options:" +values);

List tempvalues = new ArrayList(values);
System.out.println(tempvalues);
Collections.sort(tempvalues);
boolean sort = values.equals(tempvalues);
if(sort)
{
    System.out.println("dropdoen is sorted");
}
else
{
    System.out.println("dropdown is not sorted");
}

    }
}
