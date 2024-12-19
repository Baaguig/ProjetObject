package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url= "https://demoqa.com/buttons";
		driver.get(url);
		//sleep 3s
		Thread.sleep(3000);
		
		//déclaration 
		WebElement bt_double_click_me,bt_Right_click_me,txt_double_click,txt_right_click;
		String msg_double_click,msg_right_click;
		//identification
		bt_double_click_me=driver.findElement(By.id("doubleClickBtn"));
		bt_Right_click_me=driver.findElement(By.id("rightClickBtn"));
	
		//action et resultat
		
		Actions	action = new Actions(driver);	
		action.doubleClick(bt_double_click_me).perform();
				
		txt_double_click = driver.findElement(By.id("doubleClickMessage"));
		msg_double_click = txt_double_click.getText();
		Assert.assertTrue(msg_double_click.contains("double"));
		Assert.assertTrue(msg_double_click.equals("You have done a double click"));
		System.out.println("test bouton double ok");
		
		action.contextClick(bt_Right_click_me).perform();
		
		txt_right_click = driver.findElement(By.id("rightClickMessage"));
		msg_right_click = txt_right_click.getText();
		Assert.assertEquals(msg_right_click, "You have done a right click");
		System.out.println("test bouton right ok");
		
		
	}

}
