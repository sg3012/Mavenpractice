package testseleniumpromain;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.utils.Excelops;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderchromelogin {
	public static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Excelops excel = new Excelops("D:\\Automation\\Workspace\\maventestseleniumpro\\src\\main\\java\\com\\testdata\\Logindata.xlsx");
		
		int sheetIndex = 1; 
		
		int rowcount=excel.rowcount(sheetIndex);
		
		excel.createcolumn(sheetIndex, "Status");
		for(int row=2; row<=rowcount;row++)
		{
			String username=excel.getData(sheetIndex, row, "Username");
			String pass=excel.getData(sheetIndex, row, "Password");
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.theluxepass.com/");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
			driver.findElement(By.xpath("//span[contains(text(), 'Login / Signup')]")).click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
			
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).clear(); 
			driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys(username);
			driver.findElement(By.xpath("//input[contains(@name,'password')]")).clear();
			driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys(pass);
			driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
			
			excel.setcellData(sheetIndex, row, 5, "fail");
			
			driver.quit();
			 
		}
		
		
	}

}
