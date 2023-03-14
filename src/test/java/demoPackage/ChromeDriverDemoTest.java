package demoPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverDemoTest 
{
	static WebDriver driver;
	ChromeDriverDemoPage cdp;
	Properties prop,prop2;
	String Env_URL=null;
	
	
	@BeforeTest
	@Parameters({"browser"})
	public void  beforeTest(String browser) throws IOException, InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(co);
			System.out.println("Chrome browser is opened");
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Edge browser is opened");
			
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//Implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File file1 = new File("Config\\Environment_Details.properties");
		FileInputStream fileInput1 = null;
		
		try
		{
			fileInput1 = new FileInputStream(file1);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		prop = new Properties();
		prop.load(fileInput1);
		
		Env_URL = prop.getProperty("current_Execution_Env");
		System.out.println("current environment url" +Env_URL);
		
		if(Env_URL.contains("QA_URL"))
			{
				System.out.println("Accessing QA environment" +Env_URL);
				driver.get(Env_URL);
				Thread.sleep(2000);
			}
		else if(Env_URL.contains("UAT_URL"))
			{
				System.out.println("Accessing UAT environment" +Env_URL);
				driver.get(Env_URL);
				Thread.sleep(2000);
			}
		else if(Env_URL.contains("Stage_URL"))
			{
				System.out.println("Accessing Stage environment" +Env_URL);
				driver.get(Env_URL);
				Thread.sleep(2000);
			}
			
		cdp = new ChromeDriverDemoPage(driver);
		
	}
	
	@Test(priority=0)
	public void firstTest() throws InterruptedException 
		{
		 
		 driver.get("https://www.google.com");
		 Thread.sleep(3000);
		 System.out.println("Execution 1 complete");
		 
		 }
	@Test(priority=1) //enabled=false, dependsonmethhod= firstTest
	public void secondTest() throws InterruptedException 
		{
		 
		
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.quit();
		 System.out.println("Execution 2  complete");
		 
		 }

}