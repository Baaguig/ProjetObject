package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Liste_Déroulante {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/select-menu");	
		   Thread.sleep(3000);

		WebElement Liste_déroulante,bt_couleur_noir;
		Liste_déroulante=driver.findElement(By.id("oldSelectMenu"));
		Actions action = new Actions(driver);
		action.click(Liste_déroulante).perform();
		bt_couleur_noir=driver.findElement(By.xpath("//*[@id='oldSelectMenu']/option[6]"));
		Select select=new Select(bt_couleur_noir);
		select.selectByValue("2");
		   Thread.sleep(3000);
		select.selectByVisibleText("Black");
		
		




 
	}

}
