package mavensikulitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ChromeHandleYoutubeplayer {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromDriver-78.0\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/watch?v=B4VmfpFNLxQ");
		//Thread.sleep(1000);	
		Screen capture = new Screen();
		//Thread.sleep(1500);
		//1.Settings : 
		    Pattern settingimg = new Pattern("YT_settings.png");
	        capture.wait(settingimg, 1200);
	        capture.click();
	        
	    //2.Auto : 
		    Pattern autoimg = new Pattern("YT_Auto480p.png");
	        capture.wait(autoimg, 1200);
	        capture.click();
	        
	    //3.360p : 
		    Pattern submenu = new Pattern("YT_360p.png");
	        capture.wait(submenu, 1200);
	        capture.click();    	
	    //3.Pause Video : 
		     Pattern pauseimg = new Pattern("YT_pause.png");
		     capture.wait(pauseimg,1200);
		     capture.click();
		     
		//4. Play Video : 
		     Pattern playimg = new Pattern("YT_play.png");
		     capture.wait(playimg,1200);
		     capture.click(); 


	}

}
