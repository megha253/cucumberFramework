package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class Test {

	 WebDriver driver;
	 
		// TODO Auto-generated method stub
		@Given("^Navigate on the page$")
		public void navigate_on_the_page() throws Throwable {
		    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://classic.crmpro.com/index.html");
		    System.out.println("yoyo");
		    throw new PendingException();
		}

		@Given("^enter the username in the field$")
		public void enter_the_username_in_the_field() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    throw new PendingException();
		}

	

}
