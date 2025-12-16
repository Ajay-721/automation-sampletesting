package sampletesting;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Search extends Testngtest {
	
	@Test
	
	 public void searchtable() {
		WebDriver a= new EdgeDriver();
		a.manage().window().maximize();
		a.get("https://demoqa.com/webtables");
		a.findElement(By.id("searchBox")).sendKeys("kierra");
		WebElement ele = a.findElement(By.xpath("//*[local-name()='svg' and @viewBox='0 0 1024 1024']"));
		JavascriptExecutor js = (JavascriptExecutor) a;
		js.executeScript("arguments[0].click();", ele);


		a.findElement(By.id("firstName")).clear();
		a.findElement(By.id("firstName")).sendKeys("ajay");
		a.findElement(By.id("submit")).click();
				
		a.close();

		
	}
	@Test
	void button() {

	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/buttons");

	    Actions actions = new Actions(driver);

	    // Double click (correct)
	    actions.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();

	    // Right click (use text)
	    actions.contextClick(driver.findElement(By.xpath("//button[text()='Right Click Me']"))).perform();

	    // Normal click (use text)
	    actions.click(driver.findElement(By.xpath("//button[text()='Click Me']"))).perform();
	}



}
