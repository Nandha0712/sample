package packs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Self {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nandha Tony\\eclipse-workspace\\packs\\src\\packs\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/");
		String string = driver.getCurrentUrl();
		System.out.println(string);

		driver.manage().window().maximize();
		WebElement txtusernme = driver.findElement(By.id("email"));
		txtusernme.sendKeys("vijayrajan");
		WebElement txtpass = driver.findElement(By.id("pass"));
		Thread.sleep(3000);
		txtpass.sendKeys("soj");

		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText();
		

	}

}
