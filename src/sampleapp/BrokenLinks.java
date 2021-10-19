package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.mercury-tours.com/Our_Coaches.html");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int size = links.size();
        System.out.println(" all open links"   + size);
        for(int i=0;i<size;i++)
        {
            WebElement element = links.get(i);
             String url = element.getAttribute("href");
             URL link= new URL(url);
            HttpURLConnection httpco = (HttpURLConnection) link.openConnection();
    httpco.connect();
   int statusCode = httpco.getResponseCode();
   if(statusCode>400)
   {
       System.out.println(url +" ---------------broken link");

   }else
   {
       System.out.println((url + " =======valid link"));
   }
        }


    }

}
