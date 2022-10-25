package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountlogintest {
	public WebDriver driver;
	public Accountlogintest(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	    @FindBy(xpath="(//input[@id='email'])[1]")
	     WebElement loginEmail;
	    @FindBy(xpath="(//input[@id='passwd'])[1]")
	     WebElement loginPassword;
	    @FindBy(xpath="//button[@id='SubmitLogin']")
	     WebElement submit;
	    
	    public WebElement loginEmail()
	    {
	    	return loginEmail;
	    }
	    public WebElement loginPassword()
	    {
	    	return loginPassword;
	    }
	    public WebElement submit()
	    {
	    	return submit;
	    }
}
