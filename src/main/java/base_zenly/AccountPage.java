package base_zenly;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AccountPage
{
	WebDriver driver;
	public AccountPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(how = How.XPATH, using = "//button[text()='New Loan']") WebElement newLoanBtn;
	public HeaderNavigatorLoan ClickBtn_NewLoan() throws InterruptedException {
		newLoanBtn.click();
		return new HeaderNavigatorLoan(driver);
	}
}


