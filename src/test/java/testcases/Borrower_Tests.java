package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import base_zenly.AccountPage;
import base_zenly.HeaderNavigatorLoan;
import base_zenly.LoginPage;

public class Borrower_Tests 
{
	WebDriver driver;
	Borrower_Tests(WebDriver driver){
		this.driver=driver;
		System.out.println("Jara");
	}
	
	
	  @Test(priority=2) public void CreateNewLoanAccount() throws
	  InterruptedException { AccountPage ap = new LoginPage(driver).LoginZenly();
	  ap.ClickBtn_NewLoan(); HeaderNavigatorLoan hn =
	  PageFactory.initElements(driver, HeaderNavigatorLoan.class);
	 // hn.ClickApplication(); new Borrower(driver).CompleteBorrowerForm(); 
	  }
	 
	  
}
