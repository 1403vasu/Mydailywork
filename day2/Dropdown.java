package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		//Step1: Launch the browser
				//ChromeBrowser
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
			     driver.manage().window().maximize();
			     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			     driver.findElement(By.id("password")).sendKeys("crmsfa");
			     driver.findElement(By.className("decorativeSubmit")).click();
			     driver.findElement(By.linkText("CRM/SFA")).click();
			     driver.findElement(By.linkText("Leads")).click();
			     driver.findElement(By.linkText("Create Lead")).click();
			     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
			     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
			     
			     
			     //Handling the dropdown
			     //Step1: Find the Element
			     WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
			     
			     //Step2: Instantiate the Select Class
			     Select dd1=new Select(sourceDropdown);
			     //Sep3: Select the option
			      dd1.selectByIndex(3);
			     //By Value
			     //dd1.selectByValue("IND_GEN_SERVICES");
			     //By Text
			     //dd1.selectByVisibleText("Health Care");
			     
			     //Click Create lead button
			     driver.findElement(By.name("submitButton")).click();
			     
			     }

	}


