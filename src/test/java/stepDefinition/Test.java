package stepDefinition;


import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class Test {
	 
	public WebDriver driver;
	 
		@Given("^Open the url to navigate on freeCRM application$")
		public void navigate_on_the_page() {
		    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://classic.crmpro.com/index.html");
		    System.out.println("yoyo");
		    
		}

		@Given("^enter the username and password in the field")
		public void enter_the_username_in_the_field() {
		    driver.findElement(By.name("username")).sendKeys("megha253");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		    driver.findElement(By.name("password")).sendKeys("Mg@9414");
		   
		}

		@Given("^click on submit button")
		public void click_on_submit_button() {
		    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		   
		}
		@Given("^check user is navigated on home page")
		public void check_user_is_navigated_on_home_page() {
			String ele = driver.getTitle();
			Assert.assertEquals(ele,"CRMPRO");
		    // Write code here that turns the phrase above into concrete actions
		   
		}
		
		@AfterMethod
		public void closing_browser() {
			driver.quit();
		}
	

}
