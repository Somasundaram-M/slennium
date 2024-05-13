package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowser {

	public static void main(String[] args) {
		
		//load the driver
		ChromeDriver driver=new ChromeDriver();
		//link the 
		driver.get("https://www.facebook.com/");
		//to ximize the window
		driver.manage().window().maximize();
		//title
		System.out.println(driver.getTitle());
		//locate the element
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("so");
		driver.findElement(By.id("pass")).sendKeys("so");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
//		System.out.println(driver.getTitle());
		
	}
}
