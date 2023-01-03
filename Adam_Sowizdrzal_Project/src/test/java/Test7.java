import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Test that check if you can send a message by "kontakt"
public class Test7 {
    @Test
    void messageSendBtKontakt() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://34.171.101.114/");
        // Going to "Kontakt" Page
        WebElement kontaktPage = driver.findElement(By.linkText("Kontakt"));
        kontaktPage.click();
        // Filling all fields
        // Filling Name and surename
        WebElement FirstandLastnameInput = driver.findElement(By.name("your-name"));
        FirstandLastnameInput.sendKeys("Adam Adamski");
        // Filling E-mail adress
        WebElement EmailInput = driver.findElement(By.name("your-email"));
        EmailInput.sendKeys("Adamskkii123@gmail.com");
        // Filing Topic
        WebElement TopicInput = driver.findElement(By.name("your-subject"));
        TopicInput.sendKeys("Reklamacja");
        // Filling message
        WebElement MessageInput = driver.findElement(By.name("your-message"));
        MessageInput.sendKeys("Dzień dobry \n" + "Chciałbym zrealizować bardzo duże zamówienie na monety prosze o kontakt");
        // send button
        WebElement SendButton = driver.findElement(By.xpath("//input[@value='Wyślij']"));
        ((WebElement) SendButton).click();
    }
}
