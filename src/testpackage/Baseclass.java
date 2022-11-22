package testpackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	//Driver Initialization
	WebDriver driver=new ChromeDriver();
		
	//Object creation - to call Repository
	Repository obj =new Repository();

	 @BeforeTest
	 public void launch() {
	 System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	 //implicit wait
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 

	 //open the site
	 driver.get(obj.URL);
	 driver.manage().window().maximize();
	 }
			 
	 @AfterTest
	 public void exit() {
	 driver.close();
	 }
}
