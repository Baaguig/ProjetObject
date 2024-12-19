package cucumber;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthentificationOrangeHRM {

    WebDriver driver;

    @Given("ouvrir navigateur")
    public void ouvrir_navigateur() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();}
        

    @Given("saisir url Orange")
    public void saisir_url_orange() {
        String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(URL);
    }

    @When("saisir username")
    public void saisir_username() {
        WebElement txt_Username = driver.findElement(By.xpath("//input[@name='username']"));
        txt_Username.sendKeys("Admin");
    }

    @When("saisir password")
    public void saisir_password() {
        WebElement txt_Password = driver.findElement(By.xpath("//input[@name='password']"));
        txt_Password.sendKeys("admin123");
    }

    @When("cliquer sur le bouton login")
    public void cliquer_sur_le_bouton_login() {
        WebElement bt_Login = driver.findElement(By.xpath("//button[@type='submit']"));
        bt_Login.click();
    }

    @Then("vérifier page dashboead")
    public void vérifier_page_dashboead() {
        WebElement txt_menu = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
        String menu = txt_menu.getText();
        Assert.assertEquals("Dashboard", menu);
    }

    @Then("Vérifier compte client")
    public void vérifier_compte_client() {
        WebElement txt_resultat_user = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
        String user_result = txt_resultat_user.getText();
        Assert.assertEquals("FirstTest lastTest", user_result);
    }
}