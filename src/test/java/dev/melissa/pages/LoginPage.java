package dev.melissa.pages;

public class LoginPage extends BasePage {
    //Locators
    private By emailAddressLocator = By.id("email");
    private By passwordLocator = By.name("password");
    private By submitButtonLocator = By.xpath("//*[@id="form"]/div/div/div[1]/div/form/button");
    private By AccountNameLocator = By.xpath("//*[@id="header"]/div/div/div/div[2]/div/ul/li[10]/a/i"); 

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
