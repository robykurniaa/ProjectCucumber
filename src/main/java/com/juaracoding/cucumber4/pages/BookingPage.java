package com.juaracoding.cucumber4.pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber4.drivers.DriverSingleton;
import com.juaracoding.cucumber4.utlis.Tools;

public class BookingPage {
	
	private WebDriver driver;
	private Tools tools;
		public BookingPage () {
			this.driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(css = "#fadein > div.sidebar-nav > div > div.sidebar-menu-wrap > ul > li")
		List<WebElement> menuMyBooking;

		public void goToMenuMyBooking() {
			menuMyBooking.get(1).click();
		}
		
		public String getTxtTitleBookingPage() {
			return driver.getTitle();
		}


	public class LoginPage {
		
		private WebDriver driver;
		
		public LoginPage() {
			this.driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
		}
		@FindBy(name = "email")
		WebElement inputEmail;
		
		@FindBy(name = "password")
		WebElement inputPassword;
		
		@FindBy(css = "#fadein > div.container > div > div.modal-content.col.align-self-center > div.modal-body > div > form > div.btn-box.pt-3.pb-4 > button")
		WebElement btnSubmit;

		@FindBy(className = "author_meta")
		WebElement txtWelcome;
		
		public void submitLogin(String email, String password) {
			inputEmail.sendKeys(email);
			inputPassword.sendKeys(password);
			btnSubmit.click();
		}
		
		public String getTextWelcome() {
			return txtWelcome.getText();
		}
	}
}
