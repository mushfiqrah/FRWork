package com.tt.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class User {
 WebDriver driver;
	
@Given("^I navigate to Amazons home page$")
public void i_navigate_to_Amazons_home_page() throws Throwable {
  System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
	driver =new ChromeDriver();
   driver.get("https://www.amazon.com/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&openid.pape.max_auth_age=0");
   driver.findElement(By.name("email")).sendKeys("mushfiqrahman11@yahoo.com");
driver.findElement(By.id("ap_password")).sendKeys("numanmd11");
driver.findElement(By.id("signInSubmit")).click();
}

@When("^select new customer, \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
public void select_new_customer(String arg1, String arg2, String arg3, String arg4) throws Throwable {
 
}

@Then("^i will get confirmation notification$")
public void i_will_get_confirmation_notification() throws Throwable {
   
}


}
