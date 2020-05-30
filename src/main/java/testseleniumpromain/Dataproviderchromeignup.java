package testseleniumpromain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.utils.Getexceldata;

public class Dataproviderchromeignup {
	WebDriver driver; 
	
	@BeforeMethod
	
	public void setup() {	
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.theluxepass.com/");
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@Test (dataProvider= "getTestdata")
	
    public void Luxepasssignuptest(String firstname,String lastname,String email,String password,String confirmpassword ) {		
//    WebElement loginsignupbtn = driver.findElement(By.xpath("//span[contains(text(), 'Login / Signup')]"));	
//    
//    WebElement signuplink=driver.findElement(By.xpath("//span[@class='click-login' and text()='Signup']"));
//    
//    WebElement user =driver.findElement(By.xpath("//input[contains(@name,'email')]"));
//    
//    WebElement fn =driver.findElement(By.xpath("//input[@name='first_name']"));
//    
//    WebElement ln =driver.findElement(By.xpath("//input[@name='last_name']"));
//	
//	WebElement pwd=driver.findElement(By.xpath("//input[contains(@name,'password')]"));
//	
//	WebElement cp=driver.findElement(By.xpath("//div[@class='show_pass_login']//parent::div[@class='control']//child::input[@name='confirmpassword']"));
	
	driver.findElement(By.xpath("//span[contains(text(), 'Login / Signup')]")).click();
	driver.findElement(By.xpath("//span[@class='click-login' and text()='Signup']")).click();
	
	driver.findElement(By.xpath("//input[@name='first_name']")).clear();
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
	
	driver.findElement(By.xpath("//input[@name='last_name']")).clear();
	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
	
	driver.findElement(By.xpath("//div[@class='control ']//input[@name='email']")).clear();
	driver.findElement(By.xpath("//div[@class='control ']//input[@name='email']")).sendKeys(email);
	
	driver.findElement(By.xpath("//div[@class='show_pass_login']//parent::div[@class='control']"
			+ "//child::input[@name='password']")).clear();
	driver.findElement(By.xpath("//div[@class='show_pass_login']//parent::div[@class='control']"
			+ "//child::input[@name='password']")).sendKeys(password);
	
	driver.findElement(By.xpath("//div[@class='show_pass_login']//parent::div[@class='control']"
			+ "//child::input[@name='confirmpassword']")).clear();
	driver.findElement(By.xpath("//div[@class='show_pass_login']//parent::div[@class='control']"
			+ "//child::input[@name='confirmpassword']")).sendKeys(confirmpassword);
	
	
	}	
	
	@DataProvider
	
	public Iterator<Object[]> getTestdata() {
		
	ArrayList<Object[]> testdata= Getexceldata.fetchdata(); 
	
	return testdata.iterator();
	
	}
	
	
	@AfterMethod
	
	public void teardown()
	{
		driver.quit();
	}
}
