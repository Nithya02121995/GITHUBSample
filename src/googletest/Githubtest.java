package googletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Githubtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo lap\\Desktop\\selinium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

}
