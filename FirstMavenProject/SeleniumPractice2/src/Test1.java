import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Test");
		//System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver2.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 Thread.sleep(3000);  // Let the user actually see something!
		 driver.get("https://www.google.com/");
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ChromeDriver");
		  searchBox.submit();
		  Thread.sleep(3000);  // Let the user actually see something!
		  driver.quit();

	}

}
