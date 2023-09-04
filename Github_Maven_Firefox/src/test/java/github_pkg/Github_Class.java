package github_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Github_Class {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable-notifications");
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		d.get("https://parabank.parasoft.com");
		d.manage().window().maximize();
		
		WebElement reg = d.findElement(By.xpath("//*[@id=\'loginPanel\']/p[2]/a"));
		reg.click();
		

		WebElement fname = d.findElement(By.xpath("//*[@id=\'customer.firstName\']"));
		fname.sendKeys("ABC");
		
		WebElement lname = d.findElement(By.xpath("//*[@id=\'customer.lastName\']"));
		lname.sendKeys("XYZ");
		
		WebElement add = d.findElement(By.xpath("//*[@id=\'customer.address.street\']"));
		add.sendKeys("Mumnbai");
		
		WebElement cty = d.findElement(By.xpath("//*[@id=\'customer.address.city\']"));
		cty.sendKeys("Vashi");
		
		WebElement state = d.findElement(By.xpath("//*[@id=\'customer.address.state\']"));
		state.sendKeys("Maharastra");
		
		WebElement zip = d.findElement(By.xpath("//*[@id=\'customer.address.zipCode\']"));
		zip.sendKeys("400789");
		
		WebElement phone = d.findElement(By.xpath("//*[@id=\'customer.phoneNumber\']"));
		phone.sendKeys("92123645789");
		
		WebElement ssn = d.findElement(By.xpath("//*[@id=\'customer.ssn\']"));
		ssn.sendKeys("2356");
		
		WebElement uname = d.findElement(By.xpath("//*[@id=\'customer.username\']"));
		uname.sendKeys("abc@cmail.com");
		
		WebElement pwd = d.findElement(By.xpath("//*[@id=\'customer.password\']"));
		pwd.sendKeys("pass@123");
		
		WebElement cpwd = d.findElement(By.xpath("//*[@id=\'repeatedPassword\']"));
		cpwd.sendKeys("pass@123");
		
		WebElement rbtn = d.findElement(By.xpath("//*[@id=\'customerForm\']/table/tbody/tr[13]/td[2]/input"));
		rbtn.click();
				

		
	}

}
