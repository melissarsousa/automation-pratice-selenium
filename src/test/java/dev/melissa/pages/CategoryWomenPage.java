package dev.melissa.pages;

import org.openqa.selenium.By;

public class CategoryWomenPage extends BasePage {
    
	//Locators
	private By menuWomenLocator = By.cssSelector("#accordian > div:nth-child(1) > div.panel-heading > h4 > a > span > i");
	private By submenuDressLocator = By.cssSelector("#Women > div > ul > li:nth-child(1)");
	private By titleDressPageLocator = By.cssSelector("body > section > div > div.row > div.col-sm-9.padding-right > div > h2");
	
	public void viewCategoryWomenPage() {
		if(super.isDisplayed(menuWomenLocator)) {
			super.actionMoveToElementClickPerform(menuWomenLocator);
			super.actionMoveToElementClickPerform(submenuDressLocator);
		} else {
			System.out.println("menu Category was not found");
		}
	}
	
	public String getTitlePage() {
		return super.getText(titleDressPageLocator);
	}
	
	

}

