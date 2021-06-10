package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.hooks;

public class stepdefination {

	WebDriver driver = hooks.driver;
	
	@Given("Open the {string} browser")
	public void open_the_browser(String string) {
	driver.get("http://elearningm1.upskills.in/");
	driver.manage().window().maximize();
	}

	@When("User navigates to Sign up link")
	public void user_navigates_to_sign_up_link() {
		driver.findElement(By.linkText("Sign up!")).click();
	
	}

	@When("Enter the First name as {string}")
	public void enter_the_first_name_as(String name) {
	driver.findElement(By.xpath("//input[@id='registration_firstname']")).sendKeys(name);
	}

	@When("Enter the Last name as {string}")
	public void enter_the_last_name_as(String Pass) {
	driver.findElement(By.xpath("//input[@id='registration_lastname']")).sendKeys(Pass);
	}

	@When("Enter the e-mail as {string}")
	public void enter_the_e_mail_as(String email) {
	driver.findElement(By.xpath("//input[@id='registration_email']")).sendKeys(email);
	}

	@When("Enter Username as {string}")
	public void enter_username_as(String username) {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}

	@When("Enter the Password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys(password);
	}

	@When("Enter the Confirm password as {string}")
	public void enter_the_confirm_password_as(String confirmpass) {
		driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys(confirmpass);
	}

	@When("click on {string} button")
	public void click_on_button(String string) {
		driver.findElement(By.xpath("//button[@id='registration_submit']")).click();
	}

	@Then("User Registration successful")
	public void user_registration_successful() {
	System.out.println(driver.findElement(By.xpath("//body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/p[1]")).getText());
	//li[contains(text(),'Registration')]
	//body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/p[1]
	}
	
/*	@Then("User select dropdown on top corner side and click on Inbox link")
	public void user_select_dropdown_on_top_corner_side_and_click_on_inbox_link() {
		driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[2]/li[2]/a[1]")).click(); 
		driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[2]/li[2]/ul[1]/li[3]/a[1]")).click(); 
	} */
	
	@Then("User select dropdown on top corner side")
	public void user_select_dropdown_on_top_corner_side() {
	 driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[2]/li[2]/a[1]")).click(); 
		
//	  driver.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[2]/li[2]/ul[1]/li[3]/a[1]")).click(); 
	 
	driver.findElement(By.xpath("//a[@id='logout_button']")).click();	
	 
		
		//header/nav[1]/div[1]/div[2]/ul[2]/li[2]/ul[1]/li[3]/a[1]
	} 
	
		
	@Then("User went for Homepage")
	public void user_went_for_homepage() {
	  System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Homepage')]")).getText());
	}

	@When("Enter User name as {string}")
	public void enter_user_name_as(String username) {
	    driver.findElement(By.xpath("//input[@id='login']")).sendKeys(username);
	}

	@When("Enter Password as {string}")
	public void enter_password_as(String password1) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password1);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
	}	

	@When("Clcik Compose link under profile section")
	public void clcik_compose_link_under_profile_section() {
	   driver.findElement(By.linkText("Compose")).click();
	}

	@Then("Compose screen is dispayed")
	public void compose_screen_is_dispayed() throws InterruptedException {
		System.out.println(driver.findElement(By.xpath("//li[contains(text(),'Compose message')]")).getText());
	//	driver.switchTo().frame("0");
		Thread.sleep(5000);
	}

	@When("Enter the email id to send recepient as {string}")
	public void enter_the_email_id_to_send_recepient_as(String recepientemail) throws InterruptedException {
	
	WebElement email = driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]"));
	System.out.println(email.getAttribute("Type"));	
	Thread.sleep(3000);
	email.click();
	Thread.sleep(3000);
	email.sendKeys("srinivas");
	Thread.sleep(3000);
	email.sendKeys(Keys.ENTER);
	
//	Select dropdown = new Select(driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]")));
	//dropdown.selectByValue("srinivas");
//	dropdown.selectByVisibleText("srinivas");
	
	
	}

	@When("Enter the subject as {string}")
	public void enter_the_subject_as(String subject) {
driver.findElement(By.xpath(" //input[@id='compose_message_title']")).sendKeys(subject);	    
	}	
	
/*	@When("Enter the body message as {string}")
	public void enter_the_body_message_as(String message) throws InterruptedException {
	 Thread.sleep(3000);
		driver.switchTo().frame(1);
	 driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/div[1]/div[1]/div[1]/iframe[1]")).sendKeys(message);
	} */
	
	@When("Clcik on Send message")
	public void clcik_on_send_message() {
	   driver.findElement(By.xpath("//button[@id='compose_message_compose']")).click();
	}

	@Then("email sent to recepient")
	public void email_sent_to_recepient() {
	   System.out.println(driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]")).getText()); 
	}
	
	
	
	
	
	
	
}
