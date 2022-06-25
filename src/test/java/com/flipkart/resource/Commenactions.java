package com.flipkart.resource;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commenactions {
	public static WebDriver driver;
	
	public void lanch () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balas\\eclipse-workspace\\Cucumber-Frame\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
	}
	
	public void windowshandling() {
String prwnd = driver.getWindowHandle();
		
		Set<String> allwin = driver.getWindowHandles();
		for(String x :allwin ) {
			if(!x.equals(prwnd)){
				driver.switchTo().window(x);
				
			}
		} 
	}
	
	public void ScrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void sendvalues(WebElement elemnet1, String value ) {
		elemnet1.sendKeys(value);
		
		
	}

}
