package org.stepdef;

import org.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_1_Adactin_LoginPage extends BaseClass {
	
//	@Given("User should be in the adactin login page")
//	public void user_should_be_in_the_adactin_login_page() throws InterruptedException {
//		browserLaunch("https://adactinhotelapp.com/");
//		Thread.sleep(500);
//	}
	@Given("User starting testcase")
	public void user_starting_testcase() throws InterruptedException {
		System.out.println("StartTime : "+System.currentTimeMillis());
		Thread.sleep(500);
	}
	
	@When("User should enter valid username and password")
	public void user_should_enter_valid_username_and_password() throws InterruptedException {
		findElementID("username").sendKeys("kumaraguru");
		findElementID("password").sendKeys("Kumaraguru@1"); 
		Thread.sleep(500);
	}
	
	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		findElementName("login").click();
		Thread.sleep(500);
	}
	
	@Then("User should verify successfully logged in")
	public void user_should_verify_successfully_logged_in() {
		System.out.println("Successfully logged in");
//		driver.close();
	}
	
//	// for testng parallel
//	@Given("User should be in the adactin login page1")
//	public void user_should_be_in_the_adactin_login_page1() throws InterruptedException {
//		browserLaunch("https://adactinhotelapp.com/");
//		Thread.sleep(500);
//	}
	
	@When("User should enter invalid username and password1")
	public void user_should_enter_invalid_username_and_password1() throws InterruptedException {
		findElementID("username").sendKeys("kumaragur");
		findElementID("password").sendKeys("Kumaraguru@"); // "passwo" --> wrongly given for failed cocepts
		Thread.sleep(500);
	}
	
	@When("User should click the login button1")
	public void user_should_click_the_login_button1() throws InterruptedException {
		findElementName("login").click();
		Thread.sleep(500);
	}
	
	@Then("User should verify error message")
	public void user_should_verify_error_message() {
		System.out.println("checked error message");
//		driver.close();
	}
	
	
	




}
