package com.qainfotech.Hris_Assertion_10;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AppTest 
{ 
	App app = new App();
	
	
	@BeforeClass
   public void driver()
   {
     app.set_driver();
   app.launch_site();
   }
	
    @Test(priority=0)
    public void login1()
    	{
    	Assert.assertTrue(app.check_if_login_page_is_opened());
    }
    @Test(priority=1)
 public void fail_login1()
 {
	 Assert.assertTrue(app.Invalid_login1());
 }
    @Test(priority=2)
    public void fail_login2() throws InterruptedException
    {
    	Assert.assertTrue(app.Invalid_login2());
    }
    @Test(priority=3)
    public void fail_login3() throws InterruptedException
    {
    	Assert.assertTrue(app.Invalid_login3());
    }
    @Test(priority=4)
    public void fail_login4()throws InterruptedException
    {
    	Assert.assertTrue(app.Invalid_login4());
    }
    @Test(priority=5)
    public void valid_login()throws InterruptedException
    {
    	Assert.assertTrue(app.valid_login());
    }
    @Test(priority=6)
    public void logout()throws InterruptedException
    {
    	Assert.assertTrue(app.logout());
    }
    @Test(priority=7)
    public void remember_user() throws InterruptedException
    {
    	Assert.assertTrue(app.remember_me());
    	Assert.assertTrue(app.logout());
    }
    @Test(priority=8)
    public void Forgot_Password()
    { 
    	Assert.assertTrue(app.forgot_password());
}
}