package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStep extends AppConstant {

	@Then("^user navigate to admin page$")
	public void user_navigate_to_admin_page() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("CLick on admin");
		driver.findElement(By.xpath("//span[text()=\"Admin\"]")).click();

	}

	@When("^user entered username \"([^\"]*)\"$")
	public void user_entered_username(String usernamestr) throws InterruptedException
	{
		System.out.println("Entered USer name");
		Thread.sleep(2000);
		WebElement username_txt = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		username_txt.clear();
		username_txt.sendKeys(usernamestr);
	}

	@When("^user entered pass \"([^\"]*)\"$")
	public void user_entered_pass(String passstr) throws InterruptedException {
		
		System.out.println("Entered Pass");
		Thread.sleep(2000); //
		WebElement pass_txt = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		pass_txt.clear();
		pass_txt.sendKeys(passstr);
	}

}
