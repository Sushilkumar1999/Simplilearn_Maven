package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TDDexample {
	
	SoftAssert Assert = new SoftAssert();
	WebDriver driver;

	
	@BeforeMethod
	public void lunchBrowser()  {
		System.setProperty("webdriver.chrome.driver", "/home/sushilnayaktecn/Downloads/chromedriver");
        //System.setProperty("webdriver.gecko.driver", "/home/sushilnayaktecn/Downloads/geckodriver");
              	
	    driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		String ActTitle = driver.getTitle();
		String ExpTitle = "World's #1 Online Bootcamp & Certification Course Provider | Simplilearn";
		System.out.println(ActTitle);
		Assert.assertEquals(ExpTitle, ActTitle);
		driver.quit();
	}


	
	@Test
	public void addtest() {
		int result= this.addition(10,20);
		junit.framework.Assert.assertEquals(30,result);
		
	}
	
	public int addition(int a, int b) {
		return a+b;
	}
}
