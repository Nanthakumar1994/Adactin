package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	public WebDriver driver;
	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
	
	}

	@When("User enter invalid username and password")
	public void user_enter_invalid_username_and_password() {
	  driver.findElement(By.id("email")).sendKeys("iphone");
	  driver.findElement(By.id("pass")).sendKeys("iphone");
	}

	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		
	}

	@Then("User should be in invalid credentials page")
	
	public void user_should_be_in_invalid_credentials_page() throws InterruptedException {
		Thread.sleep(3000);
	  if (driver.getCurrentUrl().contains("privacy")) {
		System.out.println("invalid page");
	}else if (driver.getTitle().equals("Facebook"))
		
	{
		System.out.println("tr");
	}
	}
	@When("User enter invalid {string} and {string}")
	public void user_enter_invalid_and(String email, String pass) {
		
   driver.findElement(By.id("email")).sendKeys(email);
   driver.findElement(By.id("pass")).sendKeys(pass);
}
}