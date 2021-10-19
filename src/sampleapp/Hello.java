package sampleapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello
{
        public static void main(String[] args)
        {
System.setProperty("webdriver.chrome.driver","C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.selenium.dev/ ");
             driver.manage().window().maximize();
         //   WebElement day1 = driver.findElement(by.id("day"));
            driver.quit();

    }
}
