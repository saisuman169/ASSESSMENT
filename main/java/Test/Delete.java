package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Delete {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suman Kondabala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://beta.warrenroman.com/project-rocket-raccoon/home");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='delete'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='Cancel'])[1]")).click();
}
}