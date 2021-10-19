import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {
    public static void main(String[] args) {
        WebDriver driver = SeleniumDriverManager.getChromeDriver();
        driver.manage().window().maximize();
        /*driver.get("http://demo.automationtesting.in/Dynamic.html");

       WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
       //Thread.sleep(4000);
       act.contextClick(button).build().perform();
       act.moveToElement((driver.findElement(By.xpath("/html/body/u1/li[5]/span")))).click().build().perform();

        WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        act.keyDown(name, Keys.SHIFT).sendKeys("testing").build().perform();*/
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions act = new Actions(driver);

  WebElement source = driver.findElement(By.xpath("//*[@id=\'box5\']"));
  WebElement  target = driver.findElement(By.xpath("//*[@id=\'box105\']"));
  act.clickAndHold(source).moveToElement(target).release().build().perform();
  WebElement source1 = driver.findElement((By.xpath("//*[@id='box6']")));
        WebElement  target1 = driver.findElement(By.xpath("//*[@id=\'box106\']"));
  act.clickAndHold(source1).moveToElement(target1).release().build().perform();
        WebElement source2 = driver.findElement((By.xpath("//*[@id=\'box3\']")));
        WebElement  target2 = driver.findElement(By.xpath("//*[@id=\'box103\']"));
        act.clickAndHold(source2).moveToElement(target2).release().build().perform();
        WebElement source3 = driver.findElement((By.xpath("//*[@id=\'box1\']")));
        WebElement  target3 = driver.findElement(By.xpath("//*[@id=\'box102\']"));
        act.dragAndDrop(source3,target3).build().perform();
    }
}
