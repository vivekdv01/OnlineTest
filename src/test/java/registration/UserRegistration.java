package registration;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class UserRegistration {
	
	static boolean c,c1,c2,c3,c4,c5,c6,c7;	
	
	static WebElement f;
	
	static String sample,sample1,sample2,sample3, sample4;
	
	private WebDriver driver;
	
  @Test(priority = 0)
  public void isfield_present() {
	  	 c= driver.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(3) > label")).isDisplayed();
	  	 if(c==true)
		  System.out.println("First Name is present"); 	  
	   
		  c1= driver.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(4) > label")).isDisplayed();
		  if(c1==true)
			  System.out.println("Last Name is present");		
	
		  c2= driver.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(6) > label")).isDisplayed();
		  if(c2==true)
			  System.out.println("Username is present");	  	
	  
		  c3= driver.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(7) > label")).isDisplayed();
		  if(c3==true)
			  System.out.println("Password is present");	  	
	  
		  c4= driver.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(8) > label")).isDisplayed();
		  if(c4==true)
			  System.out.println("Confirm Password is present");	 
  
		  c5= driver.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(9) > label")).isDisplayed();
		  if(c5==true)
		  System.out.println("E-Mail is present");
		  
		  c6= driver.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(10) > label")).isDisplayed();
		  if(c6==true)
		  System.out.println("Contact No");
  }
		  
  @Test(priority = 1)
	public void blank_field() {
			 
		driver.findElement(By.name("first_name")).sendKeys(" ");
		driver.findElement(By.name("last_name")).sendKeys(" ");
		driver.findElement(By.name("user_name")).sendKeys(" ");
		driver.findElement(By.name("user_password")).sendKeys(" "); 
		driver.findElement(By.name("confirm_password")).sendKeys(" ");
		driver.findElement(By.name("email")).sendKeys(" ");
		driver.findElement(By.name("contact_no")).sendKeys(" ");
	    driver.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(12) > div > button")).click();
		System.out.println("Please enter valid values in the field");		 
}
  
  @Test(priority = 2)
	public void fname_blank() {
	  driver.findElement(By.name("first_name")).sendKeys(" ");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");	  
	  System.out.println("Please enter your First Name");
}
  
  @Test(priority = 3)
	public void lname_blank() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys(" ");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");	  
	  System.out.println("Please enter your Last Name");
}
  
  @Test(priority = 4)
	public void uname_blank() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys(" ");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");	 
	  System.out.println("Please enter your Username");
}
  
  @Test(priority = 5)
	public void pwd_blank() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  driver.findElement(By.name("user_password")).sendKeys(" "); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");	 
	  System.out.println("Please enter your Password");
}
  
  @Test(priority = 6)
	public void cpwd_blank() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");	  
	  System.out.println("Please confirm your Password");
}
  
  @Test(priority = 7)
	public void email_blank() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys(" ");	  
	  System.out.println("Please enter your Email Address");
}
  @Test(priority = 8)
	public void fname_lenth() {
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");
	  driver.findElement(By.name("first_name")).sendKeys("V");
	  sample=driver.findElement(By.name("first_name")).getAttribute("value");
	  if(sample.length()<2)
	  {
	   System.out.println("First Name should be greater than 2");
	  }
  }
  
  @Test(priority = 9)
	public void lname_lenth() { 
     driver.findElement(By.name("first_name")).sendKeys("Vivek");     
     driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
     driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
     driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
     driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");
     driver.findElement(By.name("last_name")).sendKeys("Y");
	  sample1=driver.findElement(By.name("last_name")).getAttribute("value");
	  if(sample1.length()<2)
	  {
	   System.out.println("Last Name should be greater than 2");
	  }
  }
  
  @Test(priority = 10)
  	public void uname_length() {	  
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");	  
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv");	  
	  sample2=driver.findElement(By.name("user_name")).getAttribute("value");
	  if(sample2.length()<7)
	  {
	   System.out.println("Username should be greater than 7");
	  }
  }
  
  @Test(priority = 11)
  	public void pwd_length() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");	  
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@1");	  
	  sample3=driver.findElement(By.name("user_password")).getAttribute("value");
	  if(sample3.length()<7)
	  {
	   System.out.println("Password should be greater than 7");
	  }
  }
  
  @Test(priority = 12)
  	public void cpwd_length() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 	  
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@1");	  
	  sample4=driver.findElement(By.name("confirm_password")).getAttribute("value");
	  if(sample4.length()<7)
	  {
	   System.out.println("Confirm Password should be greater than 7");
	  }  
  }
  
  @Test(priority = 13)
  public void invalid_email() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");
	  driver.findElement(By.name("contact_no")).sendKeys("779571 "); 	  
	  {
	   System.out.println("Please enter Valid Phone");
	  }
  }
  
  @Test(priority = 14)
  public void invalid_phone() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");
	  {
		System.out.println("Please enter Valid eamil");
	  }
  }
  
  @Test(priority = 15)
	public void all_invalid_field_lenth() {
	  driver.findElement(By.name("first_name")).sendKeys("V");
	  sample=driver.findElement(By.name("first_name")).getAttribute("value");
	  if(sample.length()<2)
	  {
	   System.out.println("First Name should be greater than 2");
	  }
	  
	  driver.findElement(By.name("last_name")).sendKeys("Y");
	  sample1=driver.findElement(By.name("last_name")).getAttribute("value");
	  if(sample1.length()<2)
	  {
	   System.out.println("Last Name should be greater than 2");
	  }
	  
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv");	  
	  sample2=driver.findElement(By.name("user_name")).getAttribute("value");
	  if(sample2.length()<7)
	  {
	   System.out.println("Username should be greater than 7");
	  }
	  
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@1");	  
	  sample3=driver.findElement(By.name("user_password")).getAttribute("value");
	  if(sample3.length()<7)
	  {
	   System.out.println("Password should be greater than 7");
	  }
	  
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@1");	  
	  sample4=driver.findElement(By.name("confirm_password")).getAttribute("value");
	  if(sample4.length()<7)
	  {
	   System.out.println("Confirm Password should be greater than 7");
	  }  	     
	 }
  
  @Test(priority = 16)
  public void pwd_match() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123");
	  sample3=driver.findElement(By.name("user_password")).getAttribute("value");
	  
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  sample4=driver.findElement(By.name("confirm_password")).getAttribute("value");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");
	  if(sample3.equals(sample4))
		    
	  {
	   System.out.println("Passwords are matching"); 
	  }
	  else
	   
		System.out.println("Password donot match"); 
  }
  
  @Test(priority = 17)
  public void pwd_mismatch() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123");
	  sample3=driver.findElement(By.name("user_password")).getAttribute("value");
	  
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@12");
	  sample4=driver.findElement(By.name("confirm_password")).getAttribute("value");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");
	  if(sample3.equals(sample4))
		    
	  {
	   System.out.println("Passwors donot match"); 
	  }
	  else
	   
		System.out.println("Passwords are matching"); 
  }
  
  @Test(priority = 18)
  public void successful_registration() {
	  driver.findElement(By.name("first_name")).sendKeys("Vivek");
	  driver.findElement(By.name("last_name")).sendKeys("Yadav");
	  driver.findElement(By.name("user_name")).sendKeys("vivekdv01");
	  driver.findElement(By.name("user_password")).sendKeys("Vivek@123"); 
	  driver.findElement(By.name("confirm_password")).sendKeys("Vivek@123");
	  driver.findElement(By.name("email")).sendKeys("vivekdv01@gmail.com");
	  driver.findElement(By.cssSelector("#contact_form > fieldset > div:nth-child(12) > div > button")).click();
	  c7= driver.findElement(By.cssSelector("#contact_form > fieldset > legend > center > h2 > b")).isDisplayed();
	  if(c7==true)
	  System.out.println("Thanks");
  }
  
  @BeforeMethod
  public void beforeMethod() {	  
	  System.setProperty("webdriver.chrome.driver", "E:\\MavenANDSelenium\\WorkSpace\\OnlineTest\\drivers\\Chromedriver-2.35-win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://bit.ly/dxqatest-online");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
