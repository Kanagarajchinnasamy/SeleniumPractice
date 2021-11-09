package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	/*
	 * public LoginPage(ChromeDriver driver){ this.driver = driver; }
	 
	 */
	public LoginPage(ChromeDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(how=How.ID,using="username") 
	  
	   WebElement uname;
	  
	  
	 
	
	public LoginPage enterUsername() {
		
		uname.sendKeys("demosalesmanager");
		return this;
		
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.name(pr.getProperty("LoginPage.password.classname"))).sendKeys("crmsfa");
		return this; 

	}
	public ImageClickPage clickLogin() {
		driver.findElement(By.className(pr.getProperty("LoginPage.Login.class"))).click();
		return new ImageClickPage();

	}
}
