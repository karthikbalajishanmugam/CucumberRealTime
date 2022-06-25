package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resource.Commenactions;

public class TvPurchasePage extends Commenactions {
	public TvPurchasePage() { 
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath= "//button[text()='BUY NOW']")
	private WebElement testing;
	
	@FindBy(xpath= "(//div[@class='_4rR01T'])[4]")
	private WebElement select;

	public WebElement getTesting() {
		return testing;
	}

	public WebElement getselect() {
		return select;
	}
	
	


}
