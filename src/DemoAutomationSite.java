import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomationSite {
    public static void main(String[] args)throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.getCurrentUrl();
      /* driver.findElement(By.xpath("//*[@id=\"section\"]/div/h2"));
       driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("manjula");
       driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("paluru");
driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"))
        .sendKeys("815 East Fremont Ave\n cambira apt 63234");
driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("manjula.paluru@gmail.com");
driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("224343423");
driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]/div/div[3]/label")).click();
        //language

       // Select language = new Select(driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
//language.selectByValue("English");
        //skills
      Select skills = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[8]/label")));
             skills.selectByValue("java");*/
             //selection of country
        Select country1 = new Select(driver.findElement(By.id("country")));
        country1.selectByIndex(2);
       // Select dateofbirth = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/label")));
        //dateofbirth.selectByValue("1930");



    }
}
