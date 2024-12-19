package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lancer_chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//appel web driver manager:
		WebDriverManager.chromedriver().setup();
		//lancer chrome
		WebDriver driver = new ChromeDriver();
		// maximize browser 
		driver.manage().window().maximize();
		//ouvrir url 
		driver.navigate().to("https://www.google.fr/");	
		//driver.get("https://www.google.fr/");
		
		
		
		
		//déclaration 
		//saisie de valeur 
		//action 
		//résultat 
		//fermer navigateur 
		driver.close();
		

	}

}
