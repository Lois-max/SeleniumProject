package com.company.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbstractionDemo {
	WebDriver driver;

	public static void main(String[] args) {
		//create the object of the class
		AbstractionDemo abstractionDemo = new AbstractionDemo();
		abstractionDemo.login();
		abstractionDemo.clickObjects();
		abstractionDemo.signout();
	}
	
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\Selenium Proj1\\src\\drivers\\chromedriver.exe");
		/*ChromeOptions chromeoptions = new ChromeOptions ();
		chromeoptions.setHeadless(true);*/
		
		driver = new ChromeDriver();
		driver.get("https://hapaspace.com/");
		
		//to maximize browser
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("user_login0")).click();
	    driver.findElement(By.id("user_login0")).clear();
	    driver.findElement(By.id("user_login0")).sendKeys("loisyoung28@gmail.com");
	    driver.findElement(By.id("user_pass0")).click();
	    driver.findElement(By.id("user_pass0")).clear();
	    driver.findElement(By.id("user_pass0")).sendKeys("Lilo400@!");
	    driver.findElement(By.id("wp-submit0")).click();
	}
	
	public void clickObjects() {
		driver.findElement(By.linkText("Home")).click();
	    driver.findElement(By.linkText("Blog")).click();
	    driver.findElement(By.linkText("Startups")).click();
	}
		
	public void signout() {
		 driver.findElement(By.linkText("Sign Out")).click();
	}
}
