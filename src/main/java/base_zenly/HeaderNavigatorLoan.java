package base_zenly;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import status.Tracking;

public class HeaderNavigatorLoan
{
	WebDriver driver;
	public HeaderNavigatorLoan(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	  @FindBy(how = How.CSS, using =
	  "div.nav>ul>li>a[ui-sref='deal.Status.Tracking']") WebElement StatusTab;
	  
	  @FindBy(how = How.XPATH, using=
	  "//ul/li[2]/a[@ui-sref='deal.Application.Borrower']") WebElement
	  ApplicationTab;
	  
	  @FindBy (how=How.XPATH,
	  using="//a[@ui-sref= 'deal.Processing.CreditInformation']")WebElement
	  ProcessingTab;
	  
	  @FindBy (how=How.XPATH,
	  using="//a[@ui-sref= 'deal.Underwriting.TransmittalSummary']")WebElement
	  UnderwritingTab;
	  
	  @FindBy (how=How.XPATH,
	  using="//a[@ui-sref= 'deal.HMDA.Application']")WebElement HMDATab;
	  
	  @FindBy (how=How.XPATH,
	  using="//a[@ui-sref= 'ui-sref=\\\"deal.Documents.Storage\\\"']")WebElement
	  DocumentsTab;
	  
	  @FindBy (how=How.XPATH,
	  using="//a[@ui-sref= 'deal.Interfaces.Credit']")WebElement ServicesTab;
	  
	  @FindBy (how=How.XPATH,
	  using="//a[@ui-sref= 'deal.MarketPlace.Overview']")WebElement MarketplaceTab;
	  
	  @FindBy (how=How.XPATH,
	  using="//a[@ui-sref= 'deal.Settings.UserAuthorization']\"")WebElement
	  SetingsTab;
	  
	  
	 
	/*WebElement StatusTab = driver.findElement(By.cssSelector("div.nav>ul>li>a[ui-sref='deal.Status.Tracking']"));
	WebElement ApplicationTab = driver.findElement(By.xpath("//ul/li[2]/a[@ui-sref='deal.Application.Borrower']"));

	WebElement ProcessingTab = driver.findElement(By.xpath("//a[@ui-sref= 'deal.Processing.CreditInformation']"));
	WebElement UnderwritingTab = driver.findElement(By.xpath("//a[@ui-sref= 'deal.Underwriting.TransmittalSummary']"));
	WebElement HMDATab = driver.findElement(By.xpath("//a[@ui-sref= 'deal.HMDA.Application']"));
	WebElement DocumentsTab = driver.findElement(By.xpath("//a[@ui-sref= 'ui-sref=\"deal.Documents.Storage\"']"));
	WebElement ServicesTab = driver.findElement(By.xpath("//a[@ui-sref= 'deal.Interfaces.Credit']"));
	WebElement MarketplaceTab = driver.findElement(By.xpath("//a[@ui-sref= 'deal.MarketPlace.Overview']"));
	WebElement SetingsTab = driver.findElement(By.xpath("//a[@ui-sref= 'deal.Settings.UserAuthorization']"));

	 */


	public Tracking ClickStatus() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(StatusTab));
		StatusTab.click();
		return new Tracking(driver);
	}
	
	  public void ClickApplication() { ApplicationTab.click(); }
	  
	  public void ClickProcessing() { ProcessingTab.click(); }
	  
	  public void ClickUnderwriting() { UnderwritingTab.click(); }
	  
	  public void ClickHMDA() { HMDATab.click(); }
	  
	  public void ClickDocuments() { DocumentsTab.click(); }
	  
	  public void ClickServices() { ServicesTab.click(); }
	  
	  public void ClickMarketPlace() { MarketplaceTab.click(); }
	  
	  public void ClickSettings() { SetingsTab.click(); }
	 
}
