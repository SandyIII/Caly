package base_zenly;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.Dntme;

public class LoginPage
{
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using="//input[@ng-model='user.loginName']") WebElement username;
	@FindBy(how = How.XPATH, using="//input[@ng-model= 'user.password']")WebElement password;
	@FindBy(how = How.CSS, using=".login-form .modal-footer-login button")WebElement loginBtn;

	public AccountPage LoginZenly()throws InterruptedException 
	{	
		driver.get(Dntme.testUrl);
		username.sendKeys(Dntme.uname);
		password.sendKeys(Dntme.pwd);
		loginBtn.click();
		return new AccountPage(driver);
	}

}