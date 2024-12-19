package website_test_automation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
public class Register_User {

	public static void main(String[] args) {
		
 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get(Données.url);
 
 //Verify Home Button
 WebElement txt_home;
 //txt_home=driver.findElement(By.xpath("//i[(text()='  Home')]"));
 txt_home=driver.findElement(By.xpath("//a[normalize-space()='Home']"));
 String couleur_home_obtenu=txt_home.getCssValue("color");
Assert.assertEquals(couleur_home_obtenu,Données.couleur_orange);
System.out.println("home button is shown");
 
 
 
 // click and verify signup-login
 WebElement btn_Sign_up_login,new_User_Signup_element;
 btn_Sign_up_login=driver.findElement(By.xpath("//a[contains(text(),' Signup / Login')]"));
 btn_Sign_up_login.click();  
 
 new_User_Signup_element=driver.findElement(By.xpath("//h2[contains(text(),'New User Signup')]"));


 String actual_new_User_Signup= new_User_Signup_element.getText();
 String expected_new_User_Signup=("New User Signup!");
 
 System.out.println("New User Sign up is visible");
 
 WebElement text_name,text_email,Sign_up_button;
 text_name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
 text_email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
 Sign_up_button=driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
 text_name.sendKeys("Legion");
 text_email.sendKeys("Legion22@Gmail.com");
 Sign_up_button.click();
 
WebElement password;

password=driver.findElement(By.id("password"));
password.sendKeys("Legion123$$");


WebElement Gender_btn,btn_days;
Gender_btn=driver.findElement(By.id("id_gender1"));
Gender_btn.click();


btn_days=driver.findElement(By.id("days"));
Select select = new Select(btn_days);
select.selectByValue("25");

WebElement btn_months;

btn_months=driver.findElement(By.xpath("//select[@id='months']"));
Select select2 = new Select(btn_months);
select2.selectByValue("6");

WebElement btn_years=driver.findElement(By.id("years"));
Select select3= new Select(btn_years);
select3.selectByValue("1992");

WebElement btn_newsletter;
btn_newsletter=driver.findElement(By.id("newsletter"));
btn_newsletter.click();

WebElement btn_specialoffers;
btn_specialoffers=driver.findElement(By.id("optin"));
btn_specialoffers.click();

WebElement txt_first_name = driver.findElement(By.id("first_name"));
txt_first_name.sendKeys("argus");


WebElement txt_last_name = driver.findElement(By.id("last_name"));
txt_last_name.sendKeys("Kagura");


WebElement txt_company = driver.findElement(By.id("company"));
txt_company.sendKeys("LBP");

WebElement txt_address = driver.findElement(By.id("address1"));
txt_address.sendKeys("Fifa Street 17");

WebElement txt_state = driver.findElement(By.id("state"));
txt_state.sendKeys("Milano");

WebElement txt_zipcode = driver.findElement(By.id("zipcode"));
txt_zipcode.sendKeys("92000");

WebElement txt_city = driver.findElement(By.id("city"));
txt_city.sendKeys("Verona");

WebElement txt_telephone = driver.findElement(By.xpath("//input[@id='mobile_number']"));
txt_telephone.sendKeys("+21650415307");

WebElement btn_creat_account;
btn_creat_account=driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
btn_creat_account.click();

WebElement area_account_created;
area_account_created=driver.findElement(By.xpath("//b[normalize-space()='Account Created!']"));
String txt_account_created=area_account_created.getText();
String expected_txt_account_created="A[CCOUNT CREATED";
Assert.assertEquals(expected_txt_account_created, txt_account_created);


		
		





 
	}

}
