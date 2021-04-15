package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.MavenBase.BaseClass;
import org.MavenBase.PojoClassAdactin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAdactinwebsite extends BaseClass  {
	
	public WebDriver driver;
	PojoClassAdactin l;

	@When("User enter valid username and password and click login button")
	public void user_enter_valid_username_and_password_and_click_login_button() throws IOException {
		 l = new PojoClassAdactin();
	  Map<String, String> map = readExcel("tc1");
	  String user = map.get("username");
	  String pass = map.get("password");
	  send(l.getUsername(), user);
	  send(l.getPass(), pass);
	  clk(l.getBtnlogin());
	}

   
	@Then("User should be in valid credentials page")
	public void user_should_be_in_valid_credentials_page() {
		System.out.println("valid credentials");
	}
	@Given("User launches the browser and URL, logging in with valid username and password")
	public void user_launches_the_browser_and_URL_logging_in_with_valid_username_and_password() {

		cofigBrowser();
		urlLaunch("https://adactinhotelapp.com/index.php");
		
		
	}

	@When("User is in search hotel page {string} ,{string} ,{string},{string},{string},{string}")
	public void user_is_in_search_hotel_page(String location, String hotels, String roomtype, String noofrooms, String adultperroom, String  childrenperroom) throws InterruptedException {
	
		selectByText(l.getLocation(),location );
	  
	  selectByText(l.getHotel(), hotels);
	  selectByText(l.getRoomtype(), roomtype);
	  selectByText(l.getRoomnos(),noofrooms );
	  selectByText(l.getAdultroom(),adultperroom);
	  thread(3000);
	  selectByText(l.getChildroom(),childrenperroom );
	  clk(l.getBtnsubmit());
	}

	@When("user is in booking page {string},{string},{string},{string},{string}")
	public void user_is_in_booking_page(String Name, String lastname, String add, String cardno , String cvv ) throws InterruptedException {
	  thread(3000);
	  clk(l.getBtnradio());
	  clk(l.getBtncontinue());
	  thread(3000);
	  send(l.getFirstname(),Name );
	  send(l.getLastname(),lastname );
	  send(l.getAddress(), add);
	  id("cc_num", "9998887776661234");
	  selectByIndex(l.getCctype(), 1);
	  selectByIndex(l.getExpmonth(), 2);
	  selectByIndex(l.getExpyear(), 2);
	  send(l.getCvv(),cvv );
	  clk(l.getBtnbookclk());
	  thread(6000);
	  getattribute(l.getOrdernum());
	
	
	  
	}

}
