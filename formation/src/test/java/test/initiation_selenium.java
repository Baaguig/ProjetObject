package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class initiation_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 bt_submit.click();
		 
		//résultat 
		
		

	}

}
