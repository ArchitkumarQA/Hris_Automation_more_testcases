package com.qainfotech.Hris_Assertion_10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class App 
{
 WebDriver driver;

 public void set_driver()
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\architkumar\\workspace\\chromedriver.exe" );
	 driver = new ChromeDriver();
	 
 }
 public void launch_site()
 {
	 driver.get("https://hris.qainfotech.com/login.php");
 }
 public boolean check_if_login_page_is_opened()
 {
	driver.findElement(By.className("icon-lock")).click();
	return true;
 }
 public void username()
 {
	 driver.findElement(By.id("txtUserName"));
 }
 public void password1()
 {
	 driver.findElement(By.id("txtPassword"));
 }
public boolean Invalid_login1()
{
	driver.findElement(By.id("txtUserName")).sendKeys("");
	driver.findElement(By.id("txtPassword")).sendKeys("");
	driver.findElement(By.xpath("//*[@id='login']/form/div[2]/div/input")).click();
	return true;
}
public boolean Invalid_login2() throws InterruptedException
  {Thread.sleep(2000);
   driver.findElement(By.id("txtUserName")).clear();
	driver.findElement(By.id("txtUserName")).sendKeys("architkumar");
	driver.findElement(By.id("txtPassword")).sendKeys("");
	driver.findElement(By.xpath("//*[@id='login']/form/div[2]/div/input")).click();
	return true;
}
public boolean Invalid_login3() throws InterruptedException
{Thread.sleep(2000);
 driver.findElement(By.id("txtUserName")).clear();
	driver.findElement(By.id("txtUserName")).sendKeys("architkumar");
	driver.findElement(By.id("txtPassword")).sendKeys("123");
	driver.findElement(By.xpath("//*[@id='login']/form/div[2]/div/input")).click();
	return true;
}
public boolean Invalid_login4() throws InterruptedException
{Thread.sleep(2000);
driver.findElement(By.className("icon-lock")).click();
 driver.findElement(By.id("txtUserName")).clear();
	driver.findElement(By.id("txtUserName")).sendKeys("archit");
	driver.findElement(By.id("txtPassword")).sendKeys("Archit@321#");
	driver.findElement(By.xpath("//*[@id='login']/form/div[2]/div/input")).click();
	return true;
}

public boolean valid_login() throws InterruptedException
{Thread.sleep(2000);
  driver.findElement(By.className("icon-lock")).click();
  driver.findElement(By.id("txtUserName")).sendKeys("architkumar");
	driver.findElement(By.id("txtPassword")).sendKeys("Archit@321#");
	driver.findElement(By.xpath("//*[@id='login']/form/div[2]/div/input")).click();
	return true;
}

public boolean logout()throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.className("user-image")).click();
	
//	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a/i[@class='fa fa-sign-out'][contains(text(),Logout)]")).click();
	return true;
}
public boolean remember_me() throws InterruptedException
{
	Thread.sleep(2000);
	 driver.findElement(By.className("icon-lock")).click();
	 driver.findElement(By.id("txtUserName")).sendKeys("architkumar");
		driver.findElement(By.id("txtPassword")).sendKeys("Archit@321#");
		WebElement web2=driver.findElement(By.xpath("//*[@id='login']/form/div[2]/div/label[2]"));
		web2.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='login']/form/div[2]/div/input")).click();
		return true;
}
public boolean forgot_password()
{
	 driver.findElement(By.className("icon-lock")).click();
	 driver.findElement(By.xpath("//*[@id='login']/form/div[2]/div/label[1]")).click();
	 driver.getWindowHandle();
	 for(String Popup : driver.getWindowHandles())
		 driver.switchTo().window(Popup);
	WebElement web3= driver.findElement(By.xpath("//*[@id='content']/h1"));
	String str1=web3.getText();
	if(str1.equals("QA InfoTech Password Manager."));
	return true;
}
}
