package daivtechTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidPassword {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("student");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Pa23");
		driver.findElement(By.id("submit")).click();
		WebElement invalidPwd = driver.findElement(By.id("error"));
		System.out.println(invalidPwd.getText());//displays Error message
}
}
