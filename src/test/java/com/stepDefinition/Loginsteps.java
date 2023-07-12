package com.stepDefinition;

import java.io.IOException;

import com.baseclass.library;
import com.pages.Loginpage;
import com.reusable.seleniumutility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps extends library {
	public Loginpage LP;
	public seleniumutility Se;
	@Given("the user has launched the application")
	public void the_user_has_launched_the_application() throws IOException {
		launchUrl();
	}

	@When("The user enters the username")
	public void the_user_enters_the_username() {
		 LP= new Loginpage(driver);
		 LP.Enterusername("Admin");
	}

	@When("the user enters the password")
	public void the_user_enters_the_password() {
	    LP.EnterPassword("admin123");
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_Login_button() {
	   LP.loginbutton();
	}

	@Then("it should display the dashboard")
	public void it_should_display_the_dashboard() throws IOException {
		Se =new seleniumutility(driver);
		Se.Screenshot("src/test/resources/Screenshots/scrnst.png");
		teardown();
	}




}
