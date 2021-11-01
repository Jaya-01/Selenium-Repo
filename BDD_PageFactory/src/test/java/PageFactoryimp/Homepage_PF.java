package PageFactoryimp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_PF {

	@FindBy(id="MP_link")
	WebElement MP;

	WebDriver driver=null;
	public Homepage_PF(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void display()
	{

		MP.click();
	}


}

