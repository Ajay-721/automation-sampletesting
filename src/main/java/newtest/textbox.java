package newtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) {
	WebDriver s=new ChromeDriver();
	s.get("https://demoqa.com/text-box");
	s.findElement(By.id("userName")).sendKeys("Ajay");
	s.findElement(By.id("userEmail")).sendKeys("ajay@gmail.com");
	s.findElement(By.id("currentAddress")).sendKeys("Ajay bhavan vencode cheruvallor");
	s.findElement(By.id("permanentAddress")).sendKeys("Ajay bhavan vencode cheruvallor");
	s.findElement(By.id("submit")).click();

	}
	

}
