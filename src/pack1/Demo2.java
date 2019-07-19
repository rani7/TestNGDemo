package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo2 {
	public WebDriver driver;
  @Test (priority=1)
public void sGoogle() throws InterruptedException{
	driver.navigate().to("http://www.google.co.in");
	driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("news");
	driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]")).click();
	Thread.sleep(1000);
  }
  
  @Test (priority=2)
  public void sAmazon() throws InterruptedException {
	  driver.navigate().to("http://www.amazon.in/");
	  WebElement item = driver.findElement(By.id("twotabsearchtextbox"));
	  item.sendKeys("refrigerator");
	  item.sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
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
