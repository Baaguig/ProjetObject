package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Test_Case_register_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
// Implicity wait 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
String url = "https://automationexercise.com/";
driver.get(url);


// Verify 'New User Signup!' is visible

WebElement Btn_Signup_Login;
Btn_Signup_Login=driver.findElement(By.xpath(("//a[normalize-space()='Signup / Login']")));
Btn_Signup_Login.click();


WebElement Page_Newusersignup;
Page_Newusersignup=driver.findElement(By.xpath("//body"));
String txt_New_User_Signup="New User Signup!";
String txt_actualtext=Page_Newusersignup.getText(); 
//System.out.println(txt_actualtext);
Assert.assertEquals(txt_New_User_Signup, txt_New_User_Signup);


//Enter name and email address + 7. Click 'Signup' button


WebElement text_name,text_email,Sign_up_button;
text_name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
text_email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
Sign_up_button=driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
text_name.sendKeys("Legion");
text_email.sendKeys("Legion@Gmail.com");
Sign_up_button.click();


WebElement Page_account_information = driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));
String txt_account_information1 = Page_account_information.getText();
String txt_Actual_account_information = "Enter Account Information";

Assert.assertEquals(txt_Actual_account_information, txt_account_information1);

WebElement tick_title;
tick_title=driver.findElement(By.xpath("//input[@id='id_gender2']"));
tick_title.click();

		



















	}

}
