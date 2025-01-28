package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.leaftaps.com/opentaps/control/logout");
		d.manage().window().maximize();
		d.findElement(By.id("username")).sendKeys("Demosalesmanager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.linkText("CRM/SFA")).click();
		d.findElement(By.linkText("Accounts")).click();
		d.findElement(By.linkText("Create Account")).click();
		d.findElement(By.id("accountName")).sendKeys("Staging");
		d.findElement(By.id("numberEmployees")).sendKeys("20");
		d.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		d.findElement(By.className("smallSubmit")).click();
		System.out.println(d.getTitle());
		

	}

}
