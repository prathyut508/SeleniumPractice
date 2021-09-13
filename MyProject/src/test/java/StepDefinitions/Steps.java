package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;
	
	@Given("^user launch Chrome browser")
	public void user_launch_Chrome_browser(){
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\asrik\\eclipse-workspace\\SeleniumBasic\\MavenProject508\\MyProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	    lp=new LoginPage(driver);
	}
		
	@When("^User opens url \"([^\"]*)\"$")
	public void user_opens_URL(String url)  {
		driver.get(url);
	}
	
	@When("^User enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String Email, String Password)  {
		lp.setUserName(Email);
		lp.setPassword(Password);
	    
	}

	@When("^Click on Login")
	public void click_on_Login()  {
		lp.clickLogin();
	   
	}

	
	@Then("^Page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title)  {

		if(driver.getPageSource().contains("Login was UnSuccessful.")) {
		driver.close();
		Assert.assertTrue(false);
		}else {
			Assert.assertEquals(title, driver.getTitle());
		}
	    
	}

	@When("^User clicks on Log out link")
	public void user_clicks_on_Log_out_link()  {
	  lp.clickLogout(); 
	  //Thread.sleep(4000);
	// throws InterruptedException 
	}

	@When("^close browser")
	public void close_browser()  {
	   driver.quit();
	}
	
}
