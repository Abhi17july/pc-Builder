package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class pcHomePage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By dropdownParts = By.xpath("//a[text()='Parts']");
	private By headerPC = By.xpath("//h1[text()='PC Builder']");

	private By cart = By.xpath("//a[text()='Cart']");
	public By selectLink(String linkName){
		return(By.xpath("//a[text()='"+linkName+"']"));
	}

	private By products = By.xpath("//img/..//h5[@class='card-title']");
	// 2. Constructor of the page class:
	public pcHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getPCTitle() {
		return driver.getTitle();
	}

	public  void clickTextLink(String linkName){
		driver.findElement(selectLink(linkName)).click();

	}

	public List<String> getProduct(){
		List<WebElement> wb=driver.findElements(products);
		List<String> pList=new ArrayList<>();
		for(WebElement wb2:wb){
			System.out.println(wb2.getText());
			pList.add(wb2.getText());
		}
		return pList;
	}


}
