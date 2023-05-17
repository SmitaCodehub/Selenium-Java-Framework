package com.hrms.testscripts;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//To get access for object identification methods
import org.openqa.selenium.By;

public class TC_Hrms_001 {
	public static void main(String[] args)  throws Exception
	{
		
//	    1. Lanuch Browser	

		//System.setProperty("webdriver.chrome.driver","E:\\Smita\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
	WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
//		2. enter url
		driver.navigate().to("https://smita-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("6@@OZ1Mr@eoG");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		driver.close();

	}

}
