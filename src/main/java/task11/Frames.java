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
		
		//WebElement left = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		//driver.switchTo().frame(left);
       // String left1=left.getText();
       // System.out.println("Inside left:-"+left1);
		
		//WebElement middle = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		//driver.switchTo().frame(middle);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement left = driver.findElement(By.xpath("//frame[@src='/frame_left']"));
		String left1=left.getText();
		
		boolean left5=left.isDisplayed();
		System.out.println("Inside left frame:-"+left5);
		
		driver.switchTo().parentFrame();
		WebElement middle = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
		driver.switchTo().frame(middle);
		WebElement middle2 = driver.findElement(By.xpath("//frame[@src='/frame_middle']"));
		//String middle1=left.getText();
		
		
		
		boolean middle5=middle2.isDisplayed();
		System.out.println("Inside middle frame:-"+middle5);
		
		driver.close();
		
	}

}
