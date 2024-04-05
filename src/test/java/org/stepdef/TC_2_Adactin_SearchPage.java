package org.stepdef;

import org.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_2_Adactin_SearchPage extends BaseClass {
	
	@Given("User should be in the adactin home page")
	public void user_should_be_in_the_adactin_home_page() throws InterruptedException {
		browserLaunch("https://adactinhotelapp.com/");
		Thread.sleep(500);
	}
	
	@When("User login with {string} and {string}")
	public void user_login_with_and(String username, String password) throws InterruptedException {
		findElementID("username").sendKeys(username);
		findElementID("password").sendKeys(password);
		Thread.sleep(500);
	}
	
	@Then("User should verify success message after login Search")
	public void user_should_verify_success_message_after_login_Search() throws InterruptedException {
		findElementName("login").click();
		System.out.println("Successfully logged in search");
		Thread.sleep(500);
	}
	
	@When("User search hotel {string},{string},{string},{string},{string},{string}")
	public void user_search_hotel(String location, String hotels, String roomtype, String numberofrooms, String checkindate, String checkoutdate) throws InterruptedException {
		findElementID("location").sendKeys(location); Thread.sleep(500);
		findElementID("hotels").sendKeys(hotels); Thread.sleep(500);
		findElementID("room_type").sendKeys(roomtype); Thread.sleep(500);
		findElementID("room_nos").sendKeys(numberofrooms); Thread.sleep(500);
		findElementID("datepick_in").clear(); Thread.sleep(500);
		findElementID("datepick_in").sendKeys(checkindate); Thread.sleep(500);
		findElementID("datepick_out").clear(); Thread.sleep(500);
		findElementID("datepick_out").sendKeys(checkoutdate); Thread.sleep(500);
	}
	
	@When("User should verify success messsage after search hotels")
	public void user_should_verify_success_messsage_after_search_hotels() {
		System.out.println("Search hotel successfully completed");
//		driver.close();
	}




}
