package com.mycompany.app.addressbook_selelnium_ide;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yash\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        System.out.println("Welcome to Selenium Demo");
        
        driver.get("http://13.233.253.69:8889/");
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        
         driver.findElement(By.className("v-button")).click();
         driver.findElement(By.id("gwt-uid-5")).sendKeys("Yash Maurya Jenkins");
         driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps Engineer Jenkins");
         driver.findElement(By.id("gwt-uid-9")).sendKeys("7698931133");
         driver.findElement(By.id("gwt-uid-11")).sendKeys("devyashops@gmail.com");
         driver.findElement(By.id("gwt-uid-13")).sendKeys("04/18/1995");
         driver.findElement(By.className("v-button-primary")).click();
         //Thread.sleep(5000)
         //driver.quit();
         
    }
}
