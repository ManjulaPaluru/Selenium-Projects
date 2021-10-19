import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class MultiWindow {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = SeleniumDriverManager.getChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://myntra.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div/div[2]/div/div/div/div/div/div/h4[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div/div[3]/div/div/div/div/div[1]/div/div/div/div/div/a/div/picture/img")).click();
        //driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div/div[3]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/a/div/picture/img")).click();
   driver.findElement((By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img"))).click();
 driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[2]/a/div[1]/div/div/div/picture/img")).click();
   driver.getTitle();
  Set<String> windowscount=  driver.getWindowHandles();
  //getting the size of windows
  int size = windowscount.size();
  System.out.println("size of the windwcount "+size);

  //create the array for storing the windows count
  String ids[] = new  String[size];
  //iterator method will read value one by one
  Iterator<String> itr = windowscount.iterator();
  for(int i=0; i<size;i++)
  {
      ids[i]=itr.next();
  }
System.out.println("parent window title:" +driver.getTitle());
  driver.switchTo().window(ids[2]);
        System.out.println("child2 window title:" +driver.getTitle());
        driver.switchTo().window(ids[0]);
        System.out.println("parent window title:" +driver.getTitle());
        driver.switchTo().window(ids[1]);
        System.out.println("child1 window title:" +driver.getTitle());
        driver.close();
    }}
