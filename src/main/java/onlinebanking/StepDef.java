package onlinebanking;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.util.Baseconfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.Pageobjectmodel;

public class StepDef {
	WebDriver driver;
	@Given ("open the browser")
	public void openthebrowser() throws Exception {
		driver = new ChromeDriver();
		
		
	}
	@Given ("pass the url")
	public void passtheurl() throws Exception {
		driver.navigate().to(Baseconfig.getconfig("url"));
		
	}
	@When ("pass the valid username")
	public void passthevalidusername() throws Exception {
		driver.findElement(Pageobjectmodel.username).click();
		driver.findElement(Pageobjectmodel.username).sendKeys(Baseconfig.getconfig("username"));
		
	}
	@When ("pass the valid password")
	public void passthevalidpassword() throws Exception {
		driver.findElement(Pageobjectmodel.password).click();
		driver.findElement(Pageobjectmodel.password).sendKeys(Baseconfig.getconfig("password"));
		Thread.sleep(5000);
		
	}
	@When ("click login")
	public void clicklogin() throws Exception { 
		driver.findElement(Pageobjectmodel.login).click();
		Thread.sleep(5000);
		
	}
	@Then("check logout is visible")
	public void check_logout_is_visible() {
	    
	}
}
