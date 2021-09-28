package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class dealStep {

	public WebDriver driver;
	
	@Given("^Open the url to navigate on freeCRM application$")
	public void open_the_url_to_navigate_on_freeCRM_application() {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://classic.crmpro.com/index.html");
		    System.out.println("yoyo");
		    driver.manage().window().maximize();
	    
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

	@Then("^open deal form$")
	public void open_deal_form(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame("mainpanel");
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//a[text()='Deals']"))).build().perform();
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='New Deal']"));
		ele1.click();
	    
	}
	
	@Then("^save the deal page$")
	public void save_the_contact() {
		WebElement ele = driver.findElement(By.xpath("//input[@name='addmore']/preceding-sibling::input"));
		Actions saveClick = new Actions(driver);
		saveClick.contextClick().build().perform();;
	
		
	}

	@Then("^user enters in deal page$")
	public void user_enters_in_deal_page(DataTable arg) {
	   List<List<String>> lst = arg.raw();
	   
	   driver.findElement(By.xpath("//input[@id='title']")).sendKeys(lst.get(0).get(0));
	   driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(lst.get(0).get(1));
	   driver.findElement(By.xpath("//input[@name='contact_lookup']")).sendKeys(lst.get(0).get(2));
	   driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(lst.get(0).get(3));
	    
	}
	@Given("^enter the username and password in the field$")
	public void enter_the_username_and_password_in_the_field(DataTable arg1) {
		List<List<String>> lst = arg1.raw();
		driver.findElement(By.name("username")).sendKeys(lst.get(0).get(0));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	    driver.findElement(By.name("password")).sendKeys(lst.get(0).get(1));
	}
	
	
	@Then("^close the browser$")
	public void close_the_browser() {
		
		driver.quit();
	}


}
