package com.test.GitHub_Maven_Facebook_Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void InitialStep() {
		System.setProperty("webdriver.chrome.driver","C:\\Slenium_Drivers\\chromedriver_win32 (3)\\chromedriver.exe\\");
		 driver = new ChromeDriver();
System.out.println("Launching Browser");	
	}
	@Test
	public void doLogin() {
	System.out.println("Executing Login Test");	
		driver.get("https://en-gb.facebook.com/");
		
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	
	System.out.println("Entering Username");
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("snehanagrare5@gmail.com");
	
	System.out.println("Entering Password");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("9673523195");
	
	System.out.println("Clicking on Login Button");
	driver.findElement(By.name("login")).click();
	
	System.out.println("Logging into facebook account");
	
	System.out.println("Successfully loged in facebook account");
	}
	
    @AfterTest
public void CloseBrowser() {
    	if(driver!=null)
    		driver.close();
    }
	}
	
	
	
	
	
	
	

