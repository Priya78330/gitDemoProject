package gitDemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish kuMar\\Downloads\\chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://github.com/mozilla/geckodriver/releases");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		throw new Exception("Java.lang.Exception Occurred");
		
		//driver.close();
	}

}
