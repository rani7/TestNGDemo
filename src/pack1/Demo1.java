//multi browser test
package pack1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	public WebDriver driver;
	  @Test
	  public void searchGoogle() {
	  driver.navigate().to("http://www.google.co.in");
  }
	  @Parameters("browser")
	  @BeforeTest
	  public void beforeTest(String browser) {
		  
	  if(browser.equalsIgnoreCase("chrome")){
	  System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Selenium\\selenium_files\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
	  else if(browser.equalsIgnoreCase("ie")){
	  System.setProperty("webdriver.ie.driver", "D:\\Personal\\Selenium\\selenium_files\\IEDriverServer.exe");
	  driver = new InternetExplorerDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
	  else{
	  System.setProperty("webdriver.gecko.driver","D:\\Personal\\Selenium\\selenium_files\\geckodriver-v0.20.1-win32\\geckodriver.exe");  
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }
	  }

  @AfterTest
  public void afterTest() {
  driver.close();  
}

}
