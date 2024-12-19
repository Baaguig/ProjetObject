package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Menu_Shown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   String url= "https://demoqa.com/menu";
		   driver.get(url);
		   Thread.sleep(3000);

		   
   //Déclaration 
	WebElement 	   bt_main_item2;
	bt_main_item2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
	Actions action = new Actions(driver);
	action.moveToElement(bt_main_item2).perform();
	
	


   
	}

}
