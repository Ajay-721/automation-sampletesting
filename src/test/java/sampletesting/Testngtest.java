package sampletesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testngtest {

	@Test
	 public void testbox() {
		WebDriver s = new ChromeDriver();
		s.get("https://demoqa.com/text-box");
		s.findElement(By.id("userName")).sendKeys("Ajay");
		s.findElement(By.id("userEmail")).sendKeys("ajay@gmail.com");
		s.findElement(By.id("currentAddress")).sendKeys("Ajay bhavan vencode cheruvallor");
		s.findElement(By.id("permanentAddress")).sendKeys("Ajay bhavan vencode cheruvallor");
		s.findElement(By.id("submit")).click();
		s.close();

	}

	@Test
	void checkbox() {
		WebDriver s1 = new ChromeDriver();
		s1.get("https://demoqa.com/text-box");
		s1.manage().window().maximize();
		s1.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[2]/span")).click();
		WebElement arrow = s1.findElement(By.xpath("//*[contains(@class,'rct-icon-expand-open')]"));
		JavascriptExecutor js = (JavascriptExecutor) s1;
		js.executeScript("arguments[0].click();", arrow);
		s1.findElement(By.xpath("//*[contains(@class,'rct-icon-uncheck')]")).click();
		s1.close();

	}

	@Test
	void radiobutton() throws InterruptedException {

		String[] radio = { "impressiveRadio", "yesRadio" };

		WebDriver s1 = new ChromeDriver();
		s1.manage().window().maximize();
		s1.get("https://demoqa.com/radio-button");

		JavascriptExecutor js = (JavascriptExecutor) s1;

		// Click Impressive
		js.executeScript("arguments[0].click();", s1.findElement(By.id(radio[0])));
		Thread.sleep(2000); // wait to see Impressive selected

		// Click Yes
		js.executeScript("arguments[0].click();", s1.findElement(By.id(radio[1])));
		Thread.sleep(2000);
		s1.close();
	}

	@Test
	void Webtables() throws InterruptedException {

		String[][] table = { { "Ajayan", "Devan M", "ajaydevan721@gmail.com", "23", "10000", "IT" },
				{ "alex", "b", "alex@gmail.com", "22", "200000", "mech" } };

		WebDriver s1 = new ChromeDriver();
		s1.manage().window().maximize();
		s1.get("https://demoqa.com/webtables");

		s1.findElement(By.id("addNewRecordButton")).click();

		s1.findElement(By.id("firstName")).sendKeys(table[0][0]);
		s1.findElement(By.id("lastName")).sendKeys(table[0][1]);
		s1.findElement(By.id("userEmail")).sendKeys(table[0][2]);
		s1.findElement(By.id("age")).sendKeys(table[0][3]);
		s1.findElement(By.id("salary")).sendKeys(table[0][4]);
		s1.findElement(By.id("department")).sendKeys(table[0][5]);
		s1.findElement(By.id("submit")).click();
		Thread.sleep(2000);

		s1.findElement(By.id("addNewRecordButton")).click();

		s1.findElement(By.id("firstName")).sendKeys(table[1][0]);
		s1.findElement(By.id("lastName")).sendKeys(table[1][1]);
		s1.findElement(By.id("userEmail")).sendKeys(table[1][2]);
		s1.findElement(By.id("age")).sendKeys(table[1][3]);
		s1.findElement(By.id("salary")).sendKeys(table[1][4]);
		s1.findElement(By.id("department")).sendKeys(table[1][5]);

		s1.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		s1.close();
	}
	@Test
	void link() {
		WebDriver s1 = new ChromeDriver();
		s1.manage().window().maximize();
		s1.get("https://demoqa.com/links");
		s1.findElement(By.linkText("Home")).click();
		//dynamic link
		s1.findElement(By.xpath("//*[@id=\"dynamicLink\"]")).click();
		//Api call
		s1.findElement(By.linkText("Created")).click();
		
	}

}
