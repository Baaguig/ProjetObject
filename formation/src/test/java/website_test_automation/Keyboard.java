package website_test_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {
		public static void main(String[] args) {
			//appel web driver manager 
			WebDriverManager.chromedriver().setup();
			//ouvrir chrome 
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			String url = "https://demoqa.com/text-box";
			driver.get(url);
			
			//déclaration 
			WebElement txt_name, txt_email , txt_current_adress, txt_permanent_adress, bt_submit ;
			//saisie des valeurs (identification des valeurs) 
			 txt_name=driver.findElement(By.id("userName"));
			 txt_email=driver.findElement(By.id("userEmail"));
			 txt_current_adress=driver.findElement(By.id("currentAddress"));
			 txt_permanent_adress=driver.findElement(By.id("permanentAddress"));
			 bt_submit=driver.findElement(By.id("submit"));
			  
			//action 
			 txt_name.sendKeys("Test");
			 txt_email.sendKeys("Test@test.com");
			 txt_current_adress.sendKeys("15 avenue de liberté Tunis");
			 txt_permanent_adress.sendKeys("Hello Hello");
			 ///action.keyDown(txt_current_adress)

			 bt_submit.click();
			 
			 
			 Actions action = new Actions(driver);
			 
			 
	}

}
