package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		Thread.sleep(10000);
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobilephone");
		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}

}
