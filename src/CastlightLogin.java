import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CastlightLogin {
    public static void main(String[] args) {
      WebDriver driver = SeleniumDriverManager.getFirefoxDriver();
      driver.get("https://us.castlighthealth.com/v2/login");
      driver.findElement(By.id("email")).sendKeys("suneel.saguturu@gmail.com");
      driver.findElement(By.id("password")).sendKeys("Pwd$Engage");
      driver.findElement(By.xpath("/html/body/ikkuna/div/main/div[1]/ven-auth-view/div/div/section[1]/ven-login/div/div[2]/ven-login-form/div/form/div[5]/button")).click();
    Select dp1 = new Select(driver.findElement(By.id("util-menu-trigger_findCare")));
    dp1.selectByIndex(1);
    System.out.println(dp1.getOptions());
    }

}
