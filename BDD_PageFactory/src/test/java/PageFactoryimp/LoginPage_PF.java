package PageFactoryimp;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver=null;
	
	@FindBy(id="txtUsername")
	WebElement usrn;
	
	@FindBy(id="txtPassword")
	WebElement pas;
	
	@FindBy(id="btnLogin")
	WebElement logg;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserPF(String username)
	{
		usrn.sendKeys(username);
	}
	
	public void enterpassPF(String password)
	{
		pas.sendKeys(password);
	}
	
	public void Clicklogin_PF()
	{
		logg.click();
	}
	
	
	
	
	

}
