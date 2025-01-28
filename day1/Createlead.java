package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createlead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XKU");
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Welcome");
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thanks");
		Thread.sleep(5000);
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
			driver.close();
		}

	}


