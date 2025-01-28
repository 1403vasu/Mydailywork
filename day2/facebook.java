package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.linkText("Create new account")).click();
		d.findElement(By.name("firstname")).sendKeys("vasumathi");
		d.findElement(By.name("lastname")).sendKeys("kn");
		
		WebElement drop=d.findElement(By.id("day"));
		Select dropvalue = new Select(drop);
		dropvalue.selectByValue("1");
		
		WebElement drop1=d.findElement(By.id("month"));
		Select dropvalue1 = new Select(drop1);
		dropvalue1.selectByValue("2");
		
		//year
		WebElement drop2=d.findElement(By.id("year"));
		Select dropvalue2 = new Select(drop2);
		dropvalue2.selectByValue("2009");	
		
	    
		   d.findElement(By.name("reg_email__")).sendKeys("testleaf1@gmail.com");
		     //Enter the New password
		     d.findElement(By.id("password_step_input")).sendKeys("Password@123");
		     d.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		
		
		
		
		

	}

}
