package JMeter;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JMeter_01 {
	@Test
	public void test(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91984\\Downloads\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://google.co.in");
		wd.getTitle();

	}
}
