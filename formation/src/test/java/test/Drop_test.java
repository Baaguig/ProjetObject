package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_test {

    public static void main(String[] args) {
        // Configuration du WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://demoqa.com/droppable";
        driver.get(url);
        
        // Déclaration des éléments
        WebElement bt_drag_me, bt_drop_here;
        
        // Identification des éléments
        bt_drag_me = driver.findElement(By.id("draggable"));
        bt_drop_here = driver.findElement(By.id("droppable"));
        
        // Action de glisser-déposer
        Actions action = new Actions(driver);
        action.dragAndDrop(bt_drag_me, bt_drop_here).perform();
        
        // Vérification
        WebElement text_message_drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
        String message_drop = text_message_drop.getText();
        String message_drop_attendu = "Dropped!";  // Assurez-vous que cela correspond au texte affiché
        Assert.assertEquals(message_drop_attendu, message_drop);  // Correction ici
        System.out.println("Text message is correct: " + message_drop);
        
        // Fermeture du navigateur
        driver.quit();  // Ajout de la fermeture du navigateur
    }
}