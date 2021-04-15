package org.MavenBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassAdactin extends BaseClass {
	public PojoClassAdactin() {
		PageFactory.initElements(driver, this);

		}
		@FindBy(id="username")
		private WebElement username;
		@FindBy(id="password")
		private WebElement pass;
		@FindBy(id="login")
		private WebElement btnlogin;
		@FindBy(id="location")
		private WebElement location;
		@FindBy(id="hotels")
		private WebElement hotel;
		@FindBy(id="room_type")
		private WebElement roomtype;
		@FindBy(id="room_nos")
		private WebElement roomnos;
		@FindBy(id="adult_room")
		private WebElement adultroom;
		@FindBy(id="child_room")
		private WebElement childroom;
		@FindBy(id="Submit")
		private WebElement btnsubmit;
		@FindBy(id="radiobutton_0")
		private WebElement btnradio;
		@FindBy(id="continue")
		private WebElement btncontinue;
		@FindBy(id="first_name")
		private WebElement firstname;
		@FindBy(id="last_name")
		private WebElement lastname;
		@FindBy(id="address")
		private WebElement address;
		@FindBy(id="cc_num")
		private WebElement ccnum;
		@FindBy(id="cc_type")
		private WebElement cctype;
		@FindBy(id="cc_exp_month")
		private WebElement expmonth;
		@FindBy(id="cc_exp_year")
		private WebElement expyear;
		@FindBy(id="cc_cvv")
		private WebElement cvv;
		@FindBy(id="book_now")
		private WebElement btnbookclk;
		@FindBy(id="order_no")
		private WebElement ordernum;
		public WebElement getUsername() {
			return username;
		}
		public WebElement getPass() {
			return pass;
		}
		public WebElement getBtnlogin() {
			return btnlogin;
		}
		public WebElement getLocation() {
			return location;
		}
		public WebElement getHotel() {
			return hotel;
		}
		public WebElement getRoomtype() {
			return roomtype;
		}
		public WebElement getRoomnos() {
			return roomnos;
		}
		public WebElement getAdultroom() {
			return adultroom;
		}
		public WebElement getChildroom() {
			return childroom;
		}
		public WebElement getBtnsubmit() {
			return btnsubmit;
		}
		public WebElement getBtnradio() {
			return btnradio;
		}
		public WebElement getBtncontinue() {
			return btncontinue;
		}
		public WebElement getFirstname() {
			return firstname;
		}
		public WebElement getLastname() {
			return lastname;
		}
		public WebElement getAddress() {
			return address;
		}
		public WebElement getCcnum() {
			return ccnum;
		}
		public WebElement getCctype() {
			return cctype;
		}
		public WebElement getExpmonth() {
			return expmonth;
		}
		public WebElement getExpyear() {
			return expyear;
		}
		public WebElement getCvv() {
			return cvv;
		}
		public WebElement getBtnbookclk() {
			return btnbookclk;
		}
		public WebElement getOrdernum() {
			return ordernum;
		}
		}


