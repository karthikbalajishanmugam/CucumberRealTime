package com.flipkart.stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.flipkart.objectrepository.TvPurchasePage;
import com.flipkart.resource.Commenactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TVPurchaseSteps extends Commenactions {
	
	Commenactions action = new Commenactions ();
	TvPurchasePage TV = new TvPurchasePage();
	
	
	@Given("User launch Flipkart application")
	public void user_launch_Flipkart_application() {
		
	}

	@Given("User should login Flipkart with valid Credentials")
	public void user_should_login_Flipkart_with_valid_Credentials() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@autocomplete = 'off'])[2]")).sendKeys("9443822714");
		driver.findElement(By.xpath("(//input[@autocomplete = 'off'])[3]")).sendKeys("bala@1704");
		driver.findElement(By.xpath("(//button[@type= 'submit'])[2]")).click();
		Thread.sleep(3000);
	}

	@When("User Seacrh the Tv brand and Choose Tv Model")
	public void user_Seacrh_the_Tv_brand_and_Choose_Tv_Model() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("realme TV");
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		Thread.sleep(3000);
	}

	@When("User Should Add the Selected TV To addToCart and Make a Payment")
	public void user_Should_Add_the_Selected_TV_To_addToCart_and_Make_a_Payment() throws InterruptedException {
	    TV.getselect();
	    TV.getselect().click();
		Thread.sleep(3000);
		String s = TV.getselect()
				
				
				.getText();
		System.out.println(s);
		
		action.windowshandling();

	}

	@Then("User Should Receive and Valided The Confermation Message")
	public void user_Should_Receive_and_Valided_The_Confermation_Message() throws InterruptedException {
System.out.println("addToCart");
		
		System.out.println("drpdown & screenshot");
		WebElement buy = driver.findElement(By.xpath("//button[text()='BUY NOW']"));
		action.ScrollDown(buy);
		String text = buy.getText();
		
		Assert.assertTrue(buy.isDisplayed());
		
		Assert.assertEquals("BUY NOW", text);
		
	}

	@When("User Seacrh the Tv brand and Choose Tv Modeln using list")
	public void user_Seacrh_the_Tv_brand_and_Choose_Tv_Modeln_using_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    List<String> asList = dataTable.asList();
	    driver.findElement(By.name("q")).sendKeys(asList.get(1));
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		Thread.sleep(3000);
	}

	@When("User Seacrh the Tv brand and Choose Tv Modeln using Map")
	public void user_Seacrh_the_Tv_brand_and_Choose_Tv_Modeln_using_Map(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
	    driver.findElement(By.name("q")).sendKeys(asMap.get("TV3"));
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		Thread.sleep(3000);
	}

	@When("User Seacrh the Tv brand and Choose Tv Model{string}")
	public void user_Seacrh_the_Tv_brand_and_Choose_Tv_Model(String Name) throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Name);
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		Thread.sleep(3000);
	}



}
