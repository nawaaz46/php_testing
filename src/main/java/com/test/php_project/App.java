package com.test.php_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\Nawaaz\\StarAgile\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://3.134.110.193:8081/register.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		System.out.println("Test Scripts Started");
		System.out.println("Sign UP Process is taking place");
		//Signing UP
		driver.findElement(By.name("username")).sendKeys("mentorbaba");
		Thread.sleep(2000);
				
		driver.findElement(By.name("password")).sendKeys("mentorbaba123");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Test Scripts Ended");
		
		
		
    }
}
