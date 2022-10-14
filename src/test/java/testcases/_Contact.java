package testcases;

import java.util.HashMap;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;
import base_zenly.AccountPage;
import base_zenly.HeaderNavigatorLoan;
import base_zenly.LoginPage;
import status.Contacts;
import status.Tracking;
import utilities.Driver;
import utilities.ExcelReader;

public class _Contact extends Driver
{

	@Test(priority=1)
	public void SetContacts() throws InterruptedException 
	{
		AccountPage ap = new LoginPage(driver).LoginZenly(); 
		HeaderNavigatorLoan hn = ap.ClickBtn_NewLoan(); 
		Tracking t = hn.ClickStatus();
		Contacts c =	t.ClickContacts();
		c.ClickAddBtn();

		XSSFSheet sheet = ExcelReader.GetExcelSheet("testdata.xlsx","Sheet2");
		int col = sheet.getRow(1).getPhysicalNumberOfCells();
		for(int i=1; i<col; i++) 
		{
		HashMap<String, String> contactsInfo = new HashMap<>();
		contactsInfo.put("contacttype", ExcelReader.GetValue(sheet,1,i));
		contactsInfo.put("othertype",ExcelReader.GetValue(sheet,2,i));
		contactsInfo.put("reference",ExcelReader.GetValue(sheet,3,i));
		contactsInfo.put("entitytype",ExcelReader.GetValue(sheet,4,i));
		contactsInfo.put("firstname",ExcelReader.GetValue(sheet,5,i));
		contactsInfo.put("middlename",ExcelReader.GetValue(sheet,6,i));
		contactsInfo.put("lastname",ExcelReader.GetValue(sheet,7,i));
		contactsInfo.put("suffix",ExcelReader.GetValue(sheet,8,i));
		contactsInfo.put("position",ExcelReader.GetValue(sheet,9,i));
		contactsInfo.put("telephone",ExcelReader.GetValue(sheet,10,i));
		contactsInfo.put("extension",ExcelReader.GetValue(sheet,11,i));
		contactsInfo.put("email",ExcelReader.GetValue(sheet,12,i));
		contactsInfo.put("companyname",ExcelReader.GetValue(sheet,13,i));
		contactsInfo.put("address",ExcelReader.GetValue(sheet,14,i));
		contactsInfo.put("unitdesignator",ExcelReader.GetValue(sheet,15,i));
		contactsInfo.put("number",ExcelReader.GetValue(sheet,16,i));
		contactsInfo.put("city",ExcelReader.GetValue(sheet,17,i));
		contactsInfo.put("stateprovince",ExcelReader.GetValue(sheet,18,i));
		contactsInfo.put("postalcode",ExcelReader.GetValue(sheet,19,i));
		contactsInfo.put("zipcode",ExcelReader.GetValue(sheet,20,i));
		contactsInfo.put("countyname",ExcelReader.GetValue(sheet,21,i));
		contactsInfo.put("countryname",ExcelReader.GetValue(sheet,22,i));
		contactsInfo.put("companyphone",ExcelReader.GetValue(sheet,23,i));
		contactsInfo.put("phoneext",ExcelReader.GetValue(sheet,24,i));
		contactsInfo.put("companyfax",ExcelReader.GetValue(sheet,25,i));

		new Contacts(driver).Addcontacts(contactsInfo);
		}
	}
}

