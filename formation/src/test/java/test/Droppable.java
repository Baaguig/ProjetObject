package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demoqa.com/droppable";
		driver.get(url);
		
		//déclaration 
		WebElement bt_drag_me,bt_drop_here;
		
		//identification 
		bt_drag_me=driver.findElement(By.id("draggable"));
		bt_drop_here=driver.findElement(By.id("droppable"));
		

				//action 
		Actions action = new Actions(driver);
		action.dragAndDrop(bt_drag_me, bt_drop_here).perform();
		
		///vérificatio
		
		//WebElement txt_Drop_zone,Msg_Dropped;
		//txt_Drop_zone=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div[2]/p"));
		//Msg_Dropped=txt_Drop_zone.getText();
		
		//Assert.assertTrue(Msg_Dropped.contains("dropped"));
		
		
		WebElement text_message_drop = driver.findElement(By.xpath("//*[@id='droppable']/p"));
		String message_drop =text_message_drop.getText();
		String message_drop_attendu="Dropped!";
		Assert.assertEquals(message_drop,message_drop_attendu);
		System.out.println("text msg ok");
				
		
		
		
				
		
				
		
		
	
		

	}

}
