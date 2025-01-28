package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_inputfields {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
	    d.manage().window().maximize();
	    d.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    d.findElement(By.id("password")).sendKeys("crmsfa");
	    d.findElement(By.className("decorativeSubmit")).click();
	    d.findElement(By.linkText("CRM/SFA")).click();
	    d.findElement(By.linkText("Accounts")).click();
	    d.findElement(By.linkText("Create Account")).click();
	    d.findElement(By.id("accountName")).sendKeys("Vasumath");
	    WebElement sourceDropdown = d.findElement(By.name("industryEnumId"));
	    Select d1 = new Select(sourceDropdown);
	    d1.selectByVisibleText("Computer Software");
	    Thread.sleep(5000);
	    WebElement sourceDropdown2 = d.findElement(By.name("ownershipEnumId"));
	    Select d2 = new Select(sourceDropdown2);
	    d2.selectByVisibleText("S-Corporation");
	    
	    WebElement sourceDropdown3= d.findElement(By.name("dataSourceId"));
	    Select d3 = new Select(sourceDropdown3);
	    d3.selectByValue("LEAD_EMPLOYEE");
	    
	    d.findElement(By.name("description")).sendKeys("Selenium Automation tester ");
	    
	    WebElement sourceDropdown4= d.findElement(By.id("marketingCampaignId"));
	    Select d4 = new Select(sourceDropdown4);
	    d4.selectByIndex(5);
	    
	    WebElement sourceDropdown5= d.findElement(By.id("generalStateProvinceGeoId"));
	    Select d5 = new Select(sourceDropdown5);
	    d5.selectByValue("TX");
	    
	    d.findElement(By.className("smallSubmit")).click();
	   
	    WebElement element = d.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
	    System.out.println(element.getText()); 
	     
	//    WebElement accountNameDisplay = d.findElement(By.className("tabletext")); // Replace with actual element ID
       // String displayedAccountName = accountNameDisplay.getText();

	  // System.out.println(displayedAccountName);

	    

	    
	    
	    
	     


	}

}
