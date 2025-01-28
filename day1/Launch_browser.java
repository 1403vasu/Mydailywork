package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.close();
		
		

	}

}
