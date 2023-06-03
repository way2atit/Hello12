package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep extends AppConstant {

	WebDriver driver = null;

	@Given("^user navigate to Login page$")
	public void user_navigate_to_Login_page() {

		System.out.println("Open Chrome Browser");
		// browser open
		driver = open_browser();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^user entered username$")
	public void user_entered_username() throws InterruptedException {

		System.out.println("Entered USer name");
		Thread.sleep(2000);
		WebElement username_txt = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		username_txt.clear();
		username_txt.sendKeys("Admin");

	}

	@When("^user entered pass$")
	public void user_entered_pass() throws InterruptedException {

		System.out.println("Entered Pass");
		Thread.sleep(2000); //
		WebElement pass_txt = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		pass_txt.clear();
		pass_txt.sendKeys("admin123");

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws InterruptedException {

		System.out.println("Click on login button");
		Thread.sleep(2000);
		WebElement login_btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login_btn.click();
		
		Thread.sleep(4000);
		driver.close();

	}

	@When("^user entered invalid username$")
	public void user_entered_invalid_username() {
		System.out.println("Invalid Username");
		
	}

	@When("^user entered invalid pass$")
	public void user_entered_invalid_pass() {
		System.out.println("Invalid Pass");
		
	}

}
