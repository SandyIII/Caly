package status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tracking{

	WebDriver driver;
	public Tracking(WebDriver driver){
		this.driver=driver;
	}

	By contacts = By.cssSelector(".ng-scope.odd>a");
	By conversationLog=By.cssSelector(".ng-scope.even:nth-child(3)>a");

	public Contacts ClickContacts() throws InterruptedException {
		driver.findElement(contacts).click();		
		return new Contacts(driver);
	}

	public ConversationLog ClickConversationLog() {
		driver.findElement(conversationLog).click();	
		return new ConversationLog(driver);
	}

}
