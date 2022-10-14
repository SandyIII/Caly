package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {


	public static WebDriver driver;

	@BeforeTest
	public void openbrowser() throws InterruptedException
	{
		if(true) 
		{
			WebDriverManager.chromedriver().driverVersion("106.0.5249.103").setup();
			driver = new ChromeDriver(ChromeOptions());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().timeouts().getImplicitWaitTimeout();
			
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			//Wait<WebDriver> wait =new FluentWait<WebDriver> (driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);			
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div"))));					
		}
	}

	@AfterTest
	public void CloseBrowserAndDriver() 
	{
		driver.quit();
	}

	public ChromeOptions ChromeOptions() {
		org.openqa.selenium.chrome.ChromeOptions option = new org.openqa.selenium.chrome.ChromeOptions();
		return option;
	}

}
