package tasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_tasks_004_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//li[@class='menu_Flights']")).click();
		driver.findElement(By.xpath("//div[@data-cy='rootPage']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		driver.findElement(By.xpath("//div[@class='bgGradient webpSupport']")).click();
		WebElement dropdown=driver.findElement(By.xpath("//span[text()='From']"));
		
		Select select=new Select(dropdown);
		List<WebElement> all=select.getOptions();
		select.selectByValue("Bangkok, Thailand");
		Actions action=new Actions(driver);
		WebElement Jobssearch=driver.findElement(By.xpath("//li[@role='option'][1]"));
		action.moveToElement(Jobssearch).build().perform();
	}
}
