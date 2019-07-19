package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
	public WebDriver driver;
  @Test
  public void calculateInterest() {
	  driver.navigate().to("http://www.calculator.net/");
      driver.findElement(By.linkText("Interest Calculator")).click();
      boolean radioselection = driver.findElement(By.id("cadditionat1")).isEnabled();
      if (radioselection == true)
      {
      	driver.findElement(By.id("cadditionat2")).click();	
      }
      Select dropdown = new Select(driver.findElement(By.id("ccompound")));
      dropdown.selectByValue("monthly");
      driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[1]/table/tbody/tr[10]/td[1]/input[2]")).click();
      
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","D:\\Personal\\Selenium\\selenium_files\\geckodriver-v0.20.1-win32\\geckodriver.exe");  
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.close(); 
  }

}
