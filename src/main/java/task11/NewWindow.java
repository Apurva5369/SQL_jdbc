package task11;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/windows");
		
		WebElement clickhere=driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		clickhere.click();
		Thread.sleep(3000);
		String parent=driver.getWindowHandle();
		Set<String> a=driver.getWindowHandles();
		  for(String b:a)
		  {
			  if(!b.equals(parent))
			  driver.switchTo().window(b); 
		  }
			String titlechild=driver.getTitle();
			System.out.println("Title of window is:-"+titlechild);
			
			
			String child=driver.getWindowHandle();
			driver.close();
			  Set<String> c=driver.getWindowHandles();
			  for(String b:c)
			  {
				  if(!b.equals(child))
				  driver.switchTo().window(b); 
			  }
			  
			String titleparent=driver.getTitle();
			System.out.println("Title of window is:-"+titleparent);
			
			WebElement sel = driver.findElement(By.xpath("//a[normalize-space()='Elemental Selenium']"));
			boolean s=sel.isEnabled();
			if(s==true)
			{
			System.out.println("The Parent Window is active");
			}
			
	}

}
