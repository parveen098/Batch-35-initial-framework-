package onlinebanking;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.util.Baseconfig;

import pageobjectmodel.Pageobjectmodel;

public class Smartechbanking {
	public static void getlogin() throws InterruptedException, IOException {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to(Baseconfig.getconfig("url"));
		//put username
		driver.findElement(Pageobjectmodel.username).click();
		driver.findElement(Pageobjectmodel.username).sendKeys(Baseconfig.getconfig("username"));
		//put password
		driver.findElement(Pageobjectmodel.password).click();
		driver.findElement(Pageobjectmodel.password).sendKeys(Baseconfig.getconfig("password"));
		Thread.sleep(5000);
		//click login
		driver.findElement(Pageobjectmodel.login).click();
		Thread.sleep(5000);
		//click logout
		driver.findElement(Pageobjectmodel.logout).click();
		driver.quit();
	}

}
