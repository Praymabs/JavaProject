package web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chrome-win64\\chrome-win64\\chrome.exe");
		
		// Initialize 
		WebDriver driver = new ChromeDriver();
		
		// Open Google 
		driver.get("https://www.google.com/");
		
	}

}
