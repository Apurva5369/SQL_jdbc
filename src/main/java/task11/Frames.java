package task11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Thread.sleep(1000);
		
		WebElement top = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(top);
		
		List<WebElement> a=driver.findElements(By.tagName("frame"));
		int sizeof=a.size();
		System.out.println("Number of frames in upper section is"+sizeof);
		
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.xpath("//body")).getText().trim());
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		
		System.out.println(driver.findElement(By.xpath("//body")).getText().trim());
		
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		
		System.out.println(driver.findElement(By.xpath("//body")).getText().trim());
		
		
		driver.switchTo().defaultContent();
		WebElement bottom = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(bottom);
		
		System.out.println(driver.findElement(By.xpath("//body")).getText().trim());
		
		driver.close();
		
	}

}
