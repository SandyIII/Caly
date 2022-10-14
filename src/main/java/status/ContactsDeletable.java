/* Package status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base_zenly.Driver;

public class ContactsDeletable extends Driver 
{
	String contactType; String othertype; String reference; String entitytype; String firstname; String middlename; String lastname;
	String suffix; String position; String telephone; String extension; String email; String companyname; String address; String unitdesignator;
	String number; String city; String stateprovince; String postalcode; String zipcode; String countyname; String countryname; String companyphone; 
	String phoneext; String companyfax;
	
	public ContactsDeletable(String ContactType, String othertype, String reference, String entitytype, String firstname, String middlename, String lastname,
			String suffix, String position, String telephone, String extension, String email, String companyname, String address, String unitdesignator,
			String number, String city, String stateprovince, String postalcode, String zipcode, String countyname, String countryname, String companyphone, 
			String phoneext, String companyfax){
		
		this.contactType =ContactType;
	}
	WebElement addbutton = driver.findElement(By.xpath("//button[text()= 'Add']"));
	WebElement contype = driver.findElement(By.xpath("//select[@ng-model= 'item.RoleType']"));
	WebElement other = driver.findElement(By.xpath("//input[@ng-model= 'item.RoleTypeOtherDescription']"));
	WebElement ref = driver.findElement(By.xpath("//input[@ng-model='item.Contact.ReferenceIdentifier']"));
	WebElement entity = driver.findElement(By.xpath("//select[@ng-model='item.EntityType']"));
	WebElement first = driver.findElement(By.xpath("//input[@ng-model='item.Contact.Name_First']"));
    WebElement middle = driver.findElement(By.xpath("//input[@ng-model='item.Contact.Name_Middle']"));
	WebElement last = driver.findElement(By.xpath("//input[@ng-model='item.Contact.Name_Last']"));
	WebElement suf = driver.findElement(By.xpath("//input[@ng-model='item.Contact.Name_Suffix']"));
	WebElement pos = driver.findElement(By.xpath("//input[@ng-model='item.Contact.Title']"));
	WebElement tel = driver.findElement(By.xpath("//input[@ng-model='item.Contact.Phone']"));
	WebElement ext = driver.findElement(By.xpath("//input[@ng-model='item.Contact.PhoneExt']"));
	WebElement emai = driver.findElement(By.xpath("//input[@ng-model='item.Contact.Email']"));
	WebElement cname = driver.findElement(By.xpath("//input[@ng-model='item.Company.Name']"));
	WebElement add = driver.findElement(By.xpath("//input[@ng-model='item.Address.AddressLineText']"));
	WebElement unitdes = driver.findElement(By.xpath("//select[@ng-model='item.Address.UnitDesignatorType']"));
	WebElement num = driver.findElement(By.xpath("//input[@ng-model='item.Address.UnitIdentifier']"));
	WebElement ct = driver.findElement(By.xpath("//input[@ng-model='item.Address.CityName']"));
	WebElement state = driver.findElement(By.xpath("//select[@ng-model='item.Address.StateCode']"));
	WebElement pcode = driver.findElement(By.xpath("//input[@ng-model='item.Address.PostalCode']"));
	WebElement zip = driver.findElement(By.xpath("//input[@ng-model='item.Address.PlusFourZipCode']"));
	WebElement county = driver.findElement(By.xpath("//input[@ng-model='item.Address.CountyName']"));
	WebElement country = driver.findElement(By.xpath("//select[@ng-model='item.Address.CountryName']"));
	WebElement companytel = driver.findElement(By.xpath("//input[@ng-model='item.Company.Phone']"));
	WebElement extension1 = driver.findElement(By.xpath("//input[@ng-model='item.Company.PhoneExt']"));
	WebElement fax = driver.findElement(By.xpath("//input[@ng-model='item.Company.Fax']"));
	
	public void Addcontacts(String contacttype, String othertype, String reference, String entitytype, String firstname, String middlename, String lastname,
			String suffix, String position, String telephone, String extension, String email, String companyname, String address, String unitdesignator,
			String number, String city, String stateprovince, String postalcode, String zipcode, String countyname, String countryname, String companyphone, 
			String phoneext, String companyfax) 
	{
		addbutton.click();
		contype.sendKeys(contacttype);
		other.sendKeys(othertype);
		ref.sendKeys(reference);
		entity.sendKeys(entitytype);
		first.sendKeys(firstname);
		middle.sendKeys(middlename);
		last.sendKeys(lastname);
		suf.sendKeys(suffix);
		pos.sendKeys(position);
		tel.sendKeys(telephone);
		ext.sendKeys(extension);
		emai.sendKeys(email);
		cname.sendKeys(companyname);
		add.sendKeys(address);
		unitdes.sendKeys(unitdesignator);
		num.sendKeys(number);
		ct.sendKeys(city);
		state.sendKeys(stateprovince);
		pcode.sendKeys(postalcode);
		zip.sendKeys(zipcode);
		county.sendKeys(countyname);
		country.sendKeys(countryname);
		companytel.sendKeys(companyphone);
		extension1.sendKeys(phoneext);
		fax.sendKeys(companyfax);

		
	}
}*/
