package ExampleMavenTestNGSelenium;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class NewTest {
	
	public WebDriver driver;
	String baseUrl="http://demo.guru99.com/test/guru99home/";
	String driverPath="C:\\Prabhu\\Personal\\KnowledgeBase\\Learning\\Selenium\\BrowserDriverDownloads\\geckodriver-v0.23.0-win64\\geckodriver.exe";
	
	@BeforeTest
	public void launchUrl()
	{
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver=new FirefoxDriver();
		driver.get(baseUrl);
	}
	
  @Test
  public void verifyTitle() {
	  String actual=driver.getTitle();
	  Assert.assertTrue(actual.contains("Demo Guru99 Page"));
  }
 /* @AfterTest
  public void closeBrowser()
  {
	  driver.quit();
  }*/
}
