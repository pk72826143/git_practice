package Selenium_Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.TimeoutExceededException;
import io.netty.handler.timeout.TimeoutException;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		try {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in");
		
		
		//search 'wrist watches in search box'
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist Watches",Keys.RETURN);
		
		//select Display : Analogue
		driver.findElement(By.xpath("//span[text()='Analogue']")).click();
		
		//select brands material : leather
		driver.findElement(By.xpath("//span[text()='Leather']")).click();
		
		//select brand : Titan
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and text()='Titan']")).click();
		
		//select discount : 25% Off or more
		driver.findElement(By.xpath("//span[text()='25% Off or more']")).click();
		Thread.sleep(3000);

		//Get 5th element on the page
		List<WebElement> items =  driver.findElements(By.xpath("//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']"));
		int size = items.size();
		System.out.println(size);
		items.get(4).click();
		}catch(TimeoutException e)
		{
		
		}
	}}

