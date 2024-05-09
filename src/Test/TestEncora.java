package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEncora {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver; 
		
		System.setProperty("webdriver.chromedriver", "C:\\Users\\Danel\\Desktop\\driver"); 
		driver = new ChromeDriver(); 
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.manage().window().maximize();
		
		//Register
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Daniel Wilfredo");
		
		driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Baique Sanchez");
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("Av. Arequipa 3056");
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Lima");
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("Lima");
		
		driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("+51");
		
		driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("921997842");
		
		driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("78454921997842");
		
		driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("DanielBaiqu");
		
		driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		
		

		Thread.sleep(5000);
		
		// Log Out
		
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
		
		
	// Login 
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("Danielbaiqu"); 
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("123456"); 
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	
	}
}
	
		

		
	

