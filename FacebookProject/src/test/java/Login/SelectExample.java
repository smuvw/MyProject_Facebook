package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
			
			//ChromeDriver driver = new ChromeDriver();
			
			FirefoxDriver driver =new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
			//driver.findElement(By.xpath(".//*[@id='month']")).sendKeys("Jan");
	WebElement Month=driver.findElement(By.xpath(".//*[@id='month']"));

	 Select s1=new Select(Month);
	 //s1.selectByIndex(5);
	 s1.selectByVisibleText("Apr");
			
		}


}
