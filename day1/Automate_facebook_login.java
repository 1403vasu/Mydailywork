package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_facebook_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		d.findElement(By.id("pass")).sendKeys("Tuna@321");
		d.findElement(By.name("login")).click();
		d.findElement(By.linkText("Find your account and log in.")).click();
		System.out.println(d.getTitle());

	}

}
