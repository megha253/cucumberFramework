//package stepDefinition;
//import static org.testng.Assert.assertEquals;
//import java.util.concurrent.TimeUnit;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterMethod;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class Test {
//	 
//	public WebDriver driver;
//	 
//		@Given("^Open the url to navigate on freeCRM application$")
//		public void navigate_on_the_page() {
//		    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		    driver = new ChromeDriver();
//		    driver.get("https://classic.crmpro.com/index.html");
//		    System.out.println("yoyo");
//		    driver.manage().window().maximize();
//		    
//		}
//
//		@Given("^enter the \"(.*)\" and \"(.*)\" in the field")
//		public void enter_the_username_in_the_field(String user,String name) {
//		    driver.findElement(By.name("username")).sendKeys(user);
//		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
//		    driver.findElement(By.name("password")).sendKeys(name);
//		   
//		}
//
//		@Given("^click on submit button")
//		public void click_on_submit_button() {
//		    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//		   
//		}
//		@Given("^check user is navigated on home page")
//		public void check_user_is_navigated_on_home_page() {
//			String ele = driver.getTitle();
//			Assert.assertEquals(ele,"CRMPRO");
//		    // Write code here that turns the phrase above into concrete actions
//		   
//		}
//		
//	
//
//		@Then("^open contact form$")
//		public void open_contact_form() {
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			driver.switchTo().frame("mainpanel");
//			Actions builder = new Actions(driver);
//			builder.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//			
//			WebElement ele1 = driver.findElement(By.xpath("//a[text()='New Contact']"));
//			ele1.click();
//			
//			
//		
//		}
//
//		@Then("^user enters \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//		public void user_enters_and_and(String arg1,String arg2, String arg3, String arg4) {
//			
//			WebElement eleFirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
//			eleFirstName.sendKeys(arg1);
//			WebElement eleLastName = driver.findElement(By.xpath("//input[@name='surname']"));
//			eleLastName.sendKeys(arg2);
//			WebElement eleCompany = driver.findElement(By.xpath("//input[@name='client_lookup']"));
//			eleCompany.sendKeys(arg3);
//			WebElement elePositin = driver.findElement(By.xpath("//input[@id='company_position']"));
//			elePositin.sendKeys(arg4);
//		
//		}
//		
//		
//
//		@Then("^save the contact$")
//		public void save_the_contact() {
//			WebElement ele = driver.findElement(By.xpath("//input[@value=\"Load From Company\"]/following-sibling::input[@value='Save']"));
//			Actions saveClick = new Actions(driver);
//			Action saveContact = saveClick.contextClick().build();
//			saveContact.perform();
//			
//		}
//
//		@Then("^close the browser$")
//		public void close_the_browser() {
//			
//			driver.quit();
//		}
//
//	
//
//}
