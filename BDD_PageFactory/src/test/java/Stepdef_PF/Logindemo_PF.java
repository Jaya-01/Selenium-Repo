package Stepdef_PF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactoryimp.Homepage_PF;
import PageFactoryimp.LoginPage_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logindemo_PF {
	
	WebDriver driver=null;
	LoginPage_PF lp1=null;
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver_win32//chromedriver.exe");
        driver =new ChromeDriver( );
        driver.manage().window().maximize();
        System.out.println("User is on login page");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		lp1=new LoginPage_PF(driver);
		System.out.println("User eneterd username and password");
		lp1.enteruserPF(username);
		Thread.sleep(2000);
		lp1.enterpassPF(password);
		Thread.sleep(2000);
		
		
	    
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		
		System.out.println("User click on login page");
		lp1.Clicklogin_PF();
		Thread.sleep(2000);
		
	    
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		
		System.out.println("User is on login page");
		Homepage_PF hp=new Homepage_PF(driver);
		hp.display();
		
		
		String textPF=driver.getCurrentUrl();
		
		System.out.println("The Current URL is" +textPF);
		driver.close();
		
	    
	}




}
