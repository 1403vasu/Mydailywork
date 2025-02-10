package day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowhandling_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.id("username")).sendKeys("Demosalesmanager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.linkText("CRM/SFA")).click();
		d.findElement(By.linkText("Contacts")).click();
		d.findElement(By.linkText("Merge Contacts")).click();
		d.findElement(By.xpath("//a[contains(@href, 'javascript:call_fieldlookup2autocomplete')]")).click();
		 Set<String> allWindows = d.getWindowHandles();
		 List <String>childwindow = new ArrayList<>(allWindows);
		 d.switchTo().window(childwindow.get(1));
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		d.findElement(By.xpath("(//a[normalize-space()='DemoCustomer'])[1]")).click();
		d.switchTo().window(childwindow.get(0));
		
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(60));
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='partyIdFrom']/following::img)[2]")));				
		element1.click();
		
		Set<String> allWindows1 = d.getWindowHandles();
		 List <String>childwindow1 = new ArrayList<>(allWindows1);
		 d.switchTo().window(childwindow1.get(1));
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 d.findElement(By.xpath("(//a[normalize-space()='DemoCustomer'])[1]")).click();
		 d.switchTo().window(childwindow.get(0));
		 
		 d.findElement(By.xpath("//a[text()='Merge']")).click();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		 Alert alert = d.switchTo().alert();
			alert.accept();
			System.out.println(d.getTitle());
			
			

	}

}
