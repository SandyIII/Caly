package status;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Contacts
{
	WebDriver driver;
	public Contacts(WebDriver driver){
		this.driver=driver;
	}

	By contype = By.xpath("//select[@ng-model= 'item.RoleType']");
	By otherA = By.xpath("//input[@ng-model= 'item.RoleTypeOtherDescription']");
	By otherD = By.xpath("//input[@ng-model= 'item.RoleTypeOtherDescription'][@disabled]");
	By ref = By.xpath("//input[@ng-model='item.Contact.ReferenceIdentifier']");
	By entityA = By.xpath("//select[@ng-model='item.EntityType']");
	By entityD = By.cssSelector("select[ng-model='item.EntityType'][disabled]");	
	By first = By.xpath("//input[@ng-model='item.Contact.Name_First']");
	By middle = By.xpath("//input[@ng-model='item.Contact.Name_Middle']");
	By last = By.xpath("//input[@ng-model='item.Contact.Name_Last']");
	By suf = By.xpath("//input[@ng-model='item.Contact.Name_Suffix']");
	By pos = By.xpath("//input[@ng-model='item.Contact.Title']");
	By tel = By.xpath("//input[@ng-model='item.Contact.Phone']");
	By ext = By.xpath("//input[@ng-model='item.Contact.PhoneExt']");
	By emai = By.xpath("//input[@ng-model='item.Contact.Email']");
	By cname = By.xpath("//input[@ng-model='item.Company.Name']");
	By add =  By.xpath("//input[@ng-model='item.Address.AddressLineText']");
	By unitdes = By.xpath("//select[@ng-model='item.Address.UnitDesignatorType']"); 
	By num = By.xpath("//input[@ng-model='item.Address.UnitIdentifier']");
	By ct =	By.xpath("//input[@ng-model='item.Address.CityName']");
	By state = By.xpath("//select[@ng-model='item.Address.StateCode']");
	By pcode = By.xpath("//input[@ng-model='item.Address.PostalCode']");
	By zip = By.xpath("//input[@ng-model='item.Address.PlusFourZipCode']"); 
	By county = By.xpath("//input[@ng-model='item.Address.CountyName']");
	By country = By.xpath("//select[@ng-model='item.Address.CountryName']");
	By companytel = By.xpath("//input[@ng-model='item.Company.Phone']");
	By extension1 =	By.xpath("//input[@ng-model='item.Company.PhoneExt']");
	By fax = By.xpath("//input[@ng-model='item.Company.Fax']");

	By trackingBtn = By.cssSelector(".ng-scope.even:nth-child(1)>a");
	By conversationLogBtn = By.cssSelector(".ng-scope.even:nth-child(3)>a");
	By addbutton = By.xpath("//button[text()='Add']");

	public Tracking ClickTracking() throws InterruptedException {
		driver.findElement(trackingBtn).click();
		return new Tracking(driver);
	}

	public void ClickConversationLog() throws InterruptedException {
		driver.findElement(conversationLogBtn).click();
	}

	public void ClickAddBtn() throws InterruptedException {
		driver.findElement(addbutton).click();
	}

	public void Addcontacts(HashMap<String,String> contactsInfo) throws InterruptedException
	{
		new Select(driver.findElement(contype)).selectByValue(contactsInfo.get("contacttype"));
		if(OtherTypeFieldActive())driver.findElement(otherA).sendKeys(contactsInfo.get("othertype"));
		driver.findElement( ref).clear();
		driver.findElement(ref).sendKeys(contactsInfo.get("reference"));
		if(EntityDropdownActive()) new Select(driver.findElement(entityA)).selectByValue(contactsInfo.get("entitytype"));
		driver.findElement(first).clear();
		driver.findElement(first).sendKeys(contactsInfo.get("firstname"));
		driver.findElement( middle).clear();
		driver.findElement( middle).sendKeys(contactsInfo.get("middlename"));
		driver.findElement(last).clear();
		driver.findElement(last).sendKeys(contactsInfo.get("lastname")); 
		driver.findElement(suf).clear();
		driver.findElement(suf).sendKeys(contactsInfo.get("suffix")); 
		driver.findElement(pos).clear();
		driver.findElement(pos).sendKeys(contactsInfo.get("position"));
		driver.findElement(tel).clear();
		driver.findElement(tel).sendKeys(contactsInfo.get("telephone")); 
		driver.findElement(ext).clear();
		driver.findElement(ext).sendKeys(contactsInfo.get("extension"));
		driver.findElement(emai).clear();
		driver.findElement(emai).sendKeys(contactsInfo.get("email"));
		driver.findElement(cname).clear();
		driver.findElement(cname).sendKeys(contactsInfo.get("companyname")); 
		driver.findElement(add).clear();
		driver.findElement(add).sendKeys(contactsInfo.get("address"));
		new Select(driver.findElement(unitdes)).selectByValue(contactsInfo.get("unitdesignator"));
		driver.findElement(num).clear();
		driver.findElement( num).sendKeys(contactsInfo.get("number")); 
		driver.findElement(ct).clear();
		driver.findElement(ct).sendKeys(contactsInfo.get("city"));
		new Select(driver.findElement(state)).selectByValue(contactsInfo.get("stateprovince"));
		driver.findElement(pcode).clear();
		driver.findElement( pcode).sendKeys(contactsInfo.get("postalcode"));
		driver.findElement(zip).clear();
		driver.findElement( zip).sendKeys(contactsInfo.get("zipcode")); 
		driver.findElement(county).clear();
		driver.findElement( county).sendKeys(contactsInfo.get("countyname"));
		new Select(driver.findElement(country)).selectByValue(contactsInfo.get("countryname"));
		driver.findElement(companytel).clear();
		driver.findElement( companytel).sendKeys(contactsInfo.get("companyphone"));
		driver.findElement(extension1).clear();
		driver.findElement( extension1).sendKeys(contactsInfo.get("phoneext"));
		driver.findElement(fax).clear();
		driver.findElement(fax).sendKeys(contactsInfo.get("companyfax"));
	}

	public boolean OtherTypeFieldActive()
	{		
		if(driver.findElements(otherD).size()>=1)
			return false;
		else
			return true;
	}

	public boolean EntityDropdownActive()
	{				
		if(driver.findElements(entityD).size()>=1)
			return false;
		else
			return true;
	}

}

