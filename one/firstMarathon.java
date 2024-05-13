package marathon.one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstMarathon {
	public static void main(String[] args) throws InterruptedException {
		
	
	
		
		//load the driver
		ChromeDriver driver=new ChromeDriver();
		//get the url
		driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gad_source=1&gclid=Cj0KCQjw6PGxBhCVARIsAIumnWaVdUiuAHLfMG_xv7-qz-WVYYbeTMYaxOR8_cXl3Iv0Jr4zn_o8EvEaAj6lEALw_wcB");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement findElement = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
	findElement.sendKeys("chennai");
	driver.findElement(By.xpath("//div[text()='Chennai']")).click();
	Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
	
	driver.findElement(By.xpath("//button[@class='btn active text tertiary md active button'][2]")).click();
	WebElement findElement2 = driver.findElement(By.xpath("(//h5[@class='title'])[1]"));
	System.out.println(findElement2.getText());
	Thread.sleep(3000);
	WebElement findElement3 = driver.findElement(By.xpath("(//a[@class='btn  outlined tertiary sm inactive button'])[4]"));
	driver.executeScript("arguments[0].click();",findElement3 );
	WebElement findElement4 = driver.findElement(By.xpath("(//div[@class='text-grey']//small)[1]"));
	System.out.println(findElement4.getText());
	driver.findElement(By.xpath("(//button[contains(text(),'Show')])[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='U10']")).click();
	
	driver.findElement(By.xpath("(//div[@class='label']/p)[1]")).click();
	
	driver.findElement(By.xpath("(//div[@class='label']/p)[1]")).click();
	
	WebElement findElement5 = driver.findElement(By.xpath("//span[text()='Seat Selected :']"));
	
	System.out.println(findElement5.getText());
	WebElement findElement6 = driver.findElement(By.xpath("//span[text()='Base Fare :']"));
	
	System.out.println(findElement6.getText());
	
	System.out.println(driver.getTitle());
	
	}
	

	}


