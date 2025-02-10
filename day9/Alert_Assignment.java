 package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Assignment{

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.leafground.com/alert.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement simplealert = d.findElement(By.xpath("//button[@id='j_idt88:j_idt104']//span[@class='ui-button-text ui-c'][normalize-space()='Show']"));
		simplealert.click();
	      Alert value = d.switchTo().alert();
	      value.sendKeys("vasumathi");
	     String retrivetext =  value.getText();
	     System.out.println("The retrivetext : " +retrivetext );
	      value.dismiss();
	     String confirmation = d.findElement(By.xpath("//span[@id = 'confirm_result']")).getText();
	     System.out.println("The confirmation text : " +confirmation);
	
	}

}
