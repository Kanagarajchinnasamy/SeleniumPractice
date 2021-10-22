package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(ChromeDriver driver){
		this.driver = driver;
	}
	
	public LoginPage enterUsername() {
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		return this;

	}
	public ImageClickPage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new ImageClickPage(driver);

	}
}
