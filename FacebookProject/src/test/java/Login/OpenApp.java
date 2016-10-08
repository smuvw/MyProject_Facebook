package Login;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
