package TEST;

import java.time.Duration;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_random_search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.google.com%2F%3Fptid%3D19027681%26ptt%3D8%26fpts%3D0&ec=futura_hpp_co_si_001_p&ifkv=AfYwgwXFaNmLJ0g2a2kRfxCSgqnyCtmJpMxg1F6gNaQH3Tru8I-YM1VlIsgxP6VAdlfj8hCheYQWMw&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-15643492%3A1758524138701139");
		
		Thread.sleep(2000);
		
		
	//WebElement name=driver.findElement(By.id("identifierId"));
		
		for(int i=1;i<5;i++) {
			
			String random=RandomStringUtils.randomAlphanumeric(6)+"@gmail.com";
			WebElement name1=driver.findElement(By.id("identifierId"));
			name1.sendKeys(random);
			
			
			
		}
		
		
		
	System.out.println(driver.getTitle());//Sign in - Google Accounts
	
	
	
	

		

	}

}
