package com.company.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selenium Proj1\\src\\drivers\\chromedriver.exe");
		/*ChromeOptions chromeoptions = new ChromeOptions ();
		chromeoptions.setHeadless(true);*/
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://passport.alibaba.com/icbu_login.htm?spm=a2700.8293689.scGlobalHomeHeader.346.500267afOngig5&tracelog=hd_signin/");
		
		//to maximize browser
		driver.get("https://hapaspace.com/");
		driver.manage().window().maximize();
		
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("user_login0")).click();
	    driver.findElement(By.id("user_login0")).clear();
	    driver.findElement(By.id("user_login0")).sendKeys("loisyoung28@gmail.com");
	    driver.findElement(By.id("user_pass0")).click();
	    driver.findElement(By.id("user_pass0")).clear();
	    driver.findElement(By.id("user_pass0")).sendKeys("Lilo400@!");
	    driver.findElement(By.id("wp-submit0")).click();
	    driver.findElement(By.linkText("Home")).click();
	    driver.findElement(By.linkText("Blog")).click();
	    driver.findElement(By.linkText("Startups")).click();
	    driver.findElement(By.linkText("Contact Us")).click();
		
		//title of the page
		System.out.println("The title of this page is "+driver.getTitle());
		
		//using id
		/*driver.findElement(By.id("fm-login-id")).sendKeys("loisyoung28@gmail.com");
		driver.findElement(By.id("fm-login-password")).sendKeys("lilo400@!");
		driver.findElement(By.id("fm-login-submit")).click();*/
		
		//using xpath
		//    //tagname[@attribute='value']/abc/xyz
		/*driver.findElement(By.xpath("//input[@name='loginId']")).sendKeys("loisyoung28@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lilo400@!");
		driver.findElement(By.xpath("//input[@name='submit-btn']")).click();
		*/
		
		//using css selector
	/*	driver.findElement(By.cssSelector("input#fm-login-id")).sendKeys("loisyoung28@gmail.com");
		driver.findElement(By.cssSelector("input#fm-login-password")).sendKeys("lilo400@!");
		driver.findElement(By.cssSelector("input.fm-button.fm-submit")).click();
		*/
		//driver.close();
	}

}
