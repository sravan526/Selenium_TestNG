package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeDriverDemoPage 
{
	WebDriver driver;
	WebDriverWait wait;
	
	public ChromeDriverDemoPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//select multiple elements in grid
	public void selectmultipleelements()
	{
		List <WebElement>multipleelements= driver.findElements(By.xpath("//select[@id='ct100_pageContent_lstBoxRoleTransactions']/option"));
		System.out.println("Total no of multiple elements" +multipleelements.size());
		for(int i=0;i<multipleelements.size();i++)
		{
			multipleelements.get(i).click();
		}
	}
	
	
	
}
