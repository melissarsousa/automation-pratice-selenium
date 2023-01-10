package dev.melissa.pages;

import java.security.BasicPermission;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    //Locators
    private By emailAddressLocator = By.id("email");
    private By passwordLocator = By.name("password");
    private By submitButtonLocator = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button");
    private By AccountNameLocator = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a"); 

    public void signIn(){
        if(super.isDisplayed(emailAddressLocator)){
            super.type("mel.rios99@gmail.com", emailAddressLocator);
            super.type("senhatest", passwordLocator);
            super.click(submitButtonLocator);
        } else {
            System.out.println("Email textbox was not present");
        }
    }

    public String getAccount(){
        return super.getText(AccountNameLocator);
    }


    
}
