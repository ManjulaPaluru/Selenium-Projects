import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.lang.String;
public class DropDown1 {
    public  static void  main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //System.setProperty("webdriver.gecko.driver", "C:\\workspace\\Drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
    driver.get("file:///C:/Users/manju/OneDrive/Desktop/Selenium.html");
    driver.manage().window().maximize();
    //Select dropdown2= new Select(driver.findElement(By.id("navbtn_tutorials")));

   // dropdown2.SelectByIndex(0);
    Select dp1 = new Select(driver.findElement((By.id("navbtn_menu"))));
     dp1.selectByIndex(3);
     Select dp2 = new Select(driver.findElement(By.xpath("//*[@id=\"myAccordion\"]/div/a[1]")));
     Thread.sleep(5000);
     dp2.selectByValue("Learn HTML");
     Thread.sleep(5000);
     driver.findElement(By.className("w3-left w3-btn")).click();
     System.out.println("navigating to the home page");
       // System.out.println(topic);
    //driver.findElement(By.id("email")).sendKeys("manju");
    //driver.findElement(By.id("pass")).sendKeys("123456");
   // driver.findElement(By.xpath("//*[@id=\"u_0_2_tX\"]")).click();


        // element.findElement(By.id("u_0_2_RD")).click();
        //Thread.sleep(5000);
     //driver.findElement(By.xpath("//*[@id=\"u_0_2_oW\"]")).click();
     //Thread.sleep(5000);
    /*driver.findElement(By.name("firstname")).sendKeys("manjula");
    driver.findElement(By.name("lastname")).sendKeys("paluru");
    driver.findElement(By.id("u_d_g_7o")).sendKeys("123456");
    driver.findElement(By.id("password_step_input")).sendKeys("Pwd4321");*/


}}
